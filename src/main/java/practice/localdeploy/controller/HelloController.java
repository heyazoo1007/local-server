package practice.localdeploy.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import practice.localdeploy.service.HelloService;

import javax.servlet.http.HttpServletResponse;

@RestController

@RequiredArgsConstructor
public class HelloController {

    private final HelloService helloService;

    @RequestMapping("/hello")
    public String sample() {
        return "Sample";
    }
}
