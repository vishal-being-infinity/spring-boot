package com.spring_boot.vishal.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Main {
  @GetMapping("/health")
  public String help(){
    return "health check api";
  }
  @GetMapping("v2/health")
  public String help2(){
    return "check api";
  }
}
