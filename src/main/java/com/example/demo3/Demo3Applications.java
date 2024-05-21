package com.example.demo3;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo3Applications {
    @RequestMapping("/test")
  public String deom(){
      return "hello the star";
  }

}
