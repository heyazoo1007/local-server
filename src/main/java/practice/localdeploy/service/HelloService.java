package practice.localdeploy.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import practice.localdeploy.domain.hello.Hello;
import practice.localdeploy.domain.hello.HelloRepository;

@Service
@RequiredArgsConstructor
public class HelloService {

    private final HelloRepository helloRepository;

    public void save(String name) {

        Hello hello = Hello.builder()
                .name(name)
                .build();
        helloRepository.save(hello);
    }
}
