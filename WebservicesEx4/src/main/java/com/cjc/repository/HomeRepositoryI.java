package com.cjc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.model.Student;

@Repository
public interface HomeRepositoryI extends CrudRepository<Student, Integer> {
	
	public Student findAllById(int id);
	public Student findAllByUsername(String un);
	

}
