package com.cjc.servicei;

import com.cjc.model.Student;

public interface HomeServiceI {

	Iterable<Student> displayAllData();

	Student getSingleDataus(String un);

	void saveData(Student s);

	void deleteIDData(int id);

}
