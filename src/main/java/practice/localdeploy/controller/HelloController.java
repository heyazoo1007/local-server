package practice.localdeploy.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import practice.localdeploy.service.HelloService;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/hello")
@RequiredArgsConstructor
public class HelloController {

    private final HelloService helloService;

    @PostMapping("/save")
    public HttpStatus save(@RequestBody HelloRequest helloRequest, HttpServletResponse response) {
        String name = helloRequest.getName();
        helloService.save(name);
        return HttpStatus.valueOf(200);
    }
}
