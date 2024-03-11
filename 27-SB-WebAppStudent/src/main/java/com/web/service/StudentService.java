package com.web.service;

import java.util.List;

import com.web.model.Student;
import com.web.model.StudentUse;

public interface StudentService {

	public Student saveStudent(StudentUse student);
	public Student getStudent(Integer id);
	public List<Student> getAllStudents();
	public Student updateStudent(Student student);
	public void deleteStudent(Integer id);	
	
}
