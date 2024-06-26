package com.demo1.productservices.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/say")
public class SampleController {

    @GetMapping("/hello")
  public String sayHello() {
      return "Hello Everyone";
  }

  @GetMapping("/bye")
    public String bye() {
        return "Bye Everyone";
  }
}
