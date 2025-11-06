package profect.group1.goormdotcom.hello.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import profect.group1.goormdotcom.hello.service.HelloService;

@RestController
@RequiredArgsConstructor
public class HelloController {
    private final HelloService helloService;

    @GetMapping
    public String helloWorld() {
        return helloService.helloWorld();
    }
}
