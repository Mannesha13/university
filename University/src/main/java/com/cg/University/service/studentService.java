package com.cg.University.service;

import org.springframework.stereotype.Service;

import com.cg.University.entity.student;

@Service
public interface studentService {
public student addStudent(student st);
public student searchByRollNo(student st,String rollNo);
public student searchByName(student st,String name);
}
