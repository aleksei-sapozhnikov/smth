package com.github.vermucht.smth;

import com.github.vermucht.smth.repository.EmployeeRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    public HelloWorldController(EmployeeRepository employeeRepository) {
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return "Hello, %s".formatted(name);
    }
}
