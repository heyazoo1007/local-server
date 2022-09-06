package practice.localdeploy.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@Configuration
public class RedisConfig {
    //Redis 사용을 위한 기본 Configuration
    @Value("${spring.redis.host}")
    private String host;

    @Value("${spring.redis.port}")
    private int port;
    
    @Bean
    public RedisConnectionFactory redisConnectionFactory() {
        //redis와 connection을 생성해주는 객체
        return new LettuceConnectionFactory(host, port);
    }

    @Bean
    public RedisTemplate<?, ?> redisTemplate() {
        RedisTemplate<byte[], byte[]> redisTemplate = new RedisTemplate<>();
        redisTemplate.setConnectionFactory(redisConnectionFactory());
        return redisTemplate;
    }
}
