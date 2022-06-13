package com.exercise.springbootgraphql.controller;

import com.exercise.springbootgraphql.controller.model.Student;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class HelloController {

  @QueryMapping
  public String getHelloWorld(@Argument String name) {
    return "Hello World " + name;
  }

  @QueryMapping
  public Student getStudentById(@Argument String id) {
    Student student = new Student();
    student.setId(id);
    student.setName("Eka");
    return student;
  }

}
