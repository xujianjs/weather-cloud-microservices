package com.xujian.spring.cloud.microweatherbasic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 徐健
 * @version 1.0.0
 * @ClassName HelloController.java
 * @Description TODO
 * @createTime 2019年08月14日 16:53:00
 */
@RestController("/hello")
public class HelloController {

    @GetMapping
    public String sayHello() {
        return "hello weather!";
    }

}
