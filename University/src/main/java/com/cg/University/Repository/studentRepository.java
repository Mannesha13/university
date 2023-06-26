package com.cg.University.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.University.entity.student;

@Repository
public abstract class studentRepository implements JpaRepository<String,student>{

	

	public abstract void findAllById(String rollNo) ;

	public abstract void findBy(String name);

	public abstract void save(student st);

}
