package com.vtxlab.demo.helloworld.classdemohelloworld.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Cat {

  private String name;

  private int age;

  
}
