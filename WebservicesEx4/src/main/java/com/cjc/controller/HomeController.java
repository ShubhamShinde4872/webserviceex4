package com.cjc.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.model.Student;
import com.cjc.servicei.HomeServiceI;

@RestController
public class HomeController {
	@Autowired
	HomeServiceI hs;
	
	//Get all data 
	
	@GetMapping("/putupdate")
	public Iterable<Student> getAllData(){
		
		Iterable<Student> itr=hs.displayAllData();
		
		return itr;
	}
	
	//get single data with username
	
	@GetMapping("/getSingleData/{usernmae}")
	public Student getSingleDataus(@PathVariable("username") String un)
	{
		
		Student s=hs.getSingleDataus(un);
		return s;
	}
	
	//post method use for add data
	  @PostMapping("/regData")
	  public String regData(@RequestBody Student s)
	  {
		  hs.saveData(s);
		  return "Register data succesfully";
	  }
	
	//put method use for update data using id
	@PutMapping("/putupdate/{id}")
	public String updatedata(@PathVariable("id") int id,@RequestBody Student s)
	{
		s.setId(id);
		hs.saveData(s);
		return "Update data Succesfully";
	}
	
	@DeleteMapping("/deleteData/{id}")
	public String deleteData(@PathVariable("id") int id)
	{
		hs.deleteIDData(id);
		return "Delete data succesfully";
	}
	
	
	
}
