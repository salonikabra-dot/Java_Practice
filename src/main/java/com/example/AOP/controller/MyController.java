package com.example.AOP.controller;//package com.example.demo.controller;

//import com.example.demo.service.MyService;
import com.example.AOP.service.MyService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MyController {

    private final MyService myService;

    public MyController(MyService myService) {
        this.myService = myService;
    }

    @GetMapping("/hello")
    public String sayHello(@RequestParam String name) {
        return myService.doSomething(name);
    }
}
