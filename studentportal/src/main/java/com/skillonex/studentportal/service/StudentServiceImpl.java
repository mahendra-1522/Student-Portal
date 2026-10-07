package com.skillonex.studentportal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillonex.studentportal.modal.Student;
import com.skillonex.studentportal.repo.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	StudentRepo studentRepo;

	@Override
	public Student createstudent(Student s) {
		
		return studentRepo.save(s);
	}

	@Override
	public List<Student> getAllStudents() {
		
		return studentRepo.findAll();
	}

	@Override
	public Student getStudentById(Integer sid) {
		
		return studentRepo.findById(sid).orElseThrow();
	}

	@Override
	public Student updateStudent(Student s,Integer sid) {
		
		Student stinfo=getStudentById(sid);
		
		stinfo.setAge(s.getAge());
		stinfo.setFname(s.getFname());
		stinfo.setLname(s.getLname());
		stinfo.setMarks(s.getMarks());
		stinfo.setPhoneNo(s.getPhoneNo());
		
		return studentRepo.save(stinfo);
	}

	

	@Override
	public Student getStudentByName(String fname) {
		
		return studentRepo.findByFname(fname);
	}

	@Override
	public void deleteStudentById(Integer id) {
		
		studentRepo.deleteById(id);
	}

	@Override
	public Student partial(Student s,Integer sid) {
		
		Student sinfo=getStudentById(sid);
		
		sinfo.setLname(s.getLname());
		sinfo.setAge(s.getAge());
		
		return studentRepo.save(sinfo);
	}

	
	

}
