package com.vtxlab.demo.helloworld.classdemohelloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller // Web Layer, provide the capability of API (application programming interface)
@ResponseBody // JSON (Format of data transmission - System A call System B API)
@RequestMapping(value = "/api/v1")
public class HelloworldController {

  // No attributes, constructor
  // Have instance method

  @GetMapping(value = "/hello") // endpoint
  public String helloworld() {
    return "Welcome to Spring Boot.";
  }

  // One more API
  // Return primitive? Wrapper Class?
  @GetMapping(value = "/primitive")
  public int primitive() {
      return 13;
  }
  
  @GetMapping(value = "/wrapperclass")
  public Character wrapperClass() {
      return 'C';
  }

  @GetMapping(value = "/wrapperclass2")
  public Double doubleWrapper() {
    return Double.valueOf(13.2d);
  }

  // Return Cat?
  @GetMapping(value = "/cat")
  public Cat getCat() {
    return Cat.builder() //
    .name("ABC") //
    .age(1) //
    .build();
  }

  // Return List<Cat> ?
  @GetMapping(value = "/cat")
  public List<Cat> getCats() {
    return Stream.of(new Cat("ABC", 2), new Cat("DEF", 3)) //
    .collect(Collectors.toList());
  }

  // Return Cat [] ?
  @GetMapping(value = "/catArray")
  public Cat[] getArray() {
    return new Cat[] {new Cat("ABC",2), new Cat("DEFF", 3)};
  }

}