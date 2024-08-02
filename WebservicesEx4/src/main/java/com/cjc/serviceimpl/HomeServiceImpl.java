package com.cjc.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.model.Student;
import com.cjc.repository.HomeRepositoryI;
import com.cjc.servicei.HomeServiceI;
@Service
public class HomeServiceImpl implements HomeServiceI{

	@Autowired
	HomeRepositoryI hr;
	
	@Override
	public Iterable<Student> displayAllData() {
		
		return hr.findAll();
	}

	@Override
	public Student getSingleDataus(String un) {
		
		return hr.findAllByUsername(un);
	}

	@Override
	public void saveData(Student s) {
		hr.save(s);
		
	}

	@Override
	public void deleteIDData(int id) {
		
		hr.deleteById(id);
	}

}
