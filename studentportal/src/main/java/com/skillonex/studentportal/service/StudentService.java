
package com.skillonex.studentportal.service;

import java.util.List;

import com.skillonex.studentportal.modal.Student;

public interface StudentService {
 
	public abstract Student createstudent(Student s);
	
	List<Student> getAllStudents();
	
	Student getStudentById(Integer sid);
	
	Student updateStudent(Student s,Integer sid);
	
	void deleteStudentById(Integer id);
	
	Student  getStudentByName(String fname);
	
	Student partial(Student s,Integer sid);
}
