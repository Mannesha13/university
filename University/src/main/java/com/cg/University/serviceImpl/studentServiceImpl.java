package com.cg.University.serviceImpl;

import org.springframework.stereotype.Service;

import com.cg.University.Repository.studentRepository;
import com.cg.University.entity.student;
import com.cg.University.service.studentService;

@Service
public class studentServiceImpl implements studentService{
   private studentRepository sturepo;
	@Override
	public student addStudent(student st) {
		sturepo.save(st);
		return st ;
	}

	@Override
	public student searchByRollNo(student st,String rollNo) {
		sturepo.findAllById(rollNo);
		return st;

		
	}

	@Override
	public student searchByName(student st,String name) {
	    
		sturepo.findBy(name);
		return st;
	}

}
