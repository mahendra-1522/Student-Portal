package com.skillonex.studentportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skillonex.studentportal.modal.Student;
import com.skillonex.studentportal.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	StudentService studentService;

	@PostMapping("/ss")
	Student createStudent(@RequestBody Student s) {

		return studentService.createstudent(s);
	}

	@GetMapping("/all")
	List<Student> getAllStudents() {
		return studentService.getAllStudents();
	}

	@GetMapping("/std/{sid}")

	Student getStudentById(@PathVariable Integer sid) {
		return studentService.getStudentById(sid);
	}
	
	@GetMapping("/fname/{fname}")
	Student getStudentByName(@PathVariable String fname) {
		return studentService.getStudentByName(fname);
		
	}
	
	@PutMapping("/update/{sid}")
	Student updateStudent(@RequestBody Student s,@PathVariable Integer sid) {
		studentService.updateStudent(s,sid);
		
		return studentService.updateStudent(s,sid);
	}
	
	@DeleteMapping("/delete/{sid}")
	String deleteStudentById(@PathVariable Integer sid) {
		
		studentService.deleteStudentById(sid);
		return "DELETE SUCCESSFULLY";
	}
    @PatchMapping("/pu/{sid}")
    Student partial(@RequestBody Student s,@PathVariable Integer sid) {
    	
    	
    	return studentService.partial(s, sid);
    }
}
