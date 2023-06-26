package com.cg.University.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.University.entity.student;
import com.cg.University.service.studentService;

@RestController
@RequestMapping("/stu")
public class studentController {
	 @Autowired
	  private studentService stuser;
  @PostMapping("/student")
  public student addstudent(@RequestBody student st) {
	return stuser.addStudent(st);
	  
  }
  @GetMapping("/rollNo")
  public student searchById(@RequestBody student st,@PathVariable("rollNo")String rollNo) {
	return stuser.searchByRollNo(st, rollNo);
	  
  }
  @GetMapping("/name")
  public student searchByName(@RequestBody student st,@PathVariable("name")String name) {
	return stuser.searchByRollNo(st, name);
	  
  }
}
