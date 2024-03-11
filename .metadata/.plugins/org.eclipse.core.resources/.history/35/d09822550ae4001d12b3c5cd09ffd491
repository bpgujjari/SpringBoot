package com.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.model.Student;
import com.web.model.StudentUse;
import com.web.repo.StudentRepo;
@Service
public class StudentServiceImp  implements StudentService{

	@Autowired
	private StudentRepo repo;
	@Override
	public Student saveStudent(StudentUse student) {
		Student s=new Student();
		String fn=student.getFname()+" "+student.getLname();
		s.setName(fn);
		
		s.setId(student.getId());
		s.setSub1(student.getSub1());
		s.setSub2(student.getSub2());
		s.setSub3(student.getSub3());
		
		double t=s.getSub1()+s.getSub2()+s.getSub3();
		
		double p=(t)/3;
		
		s.setTotal(t);
		s.setPercentage(p);
		
		char g='Z';
		
		if(s.getPercentage()>70)
		{g='A';
			
		}
		else if(s.getPercentage()>60&&s.getPercentage()<70)
		{g='B';
			
		}
		else if(s.getPercentage()<=60&&s.getPercentage()>=50)
		{g='C';
			
		}
		else if(s.getPercentage()<50)
		{g='F';
			
		}
			
		s.setGrade(g);

		repo.save(s);
		
		return s;
	}

	@Override
	public List<Student> getAllStudents() {
		List<Student>students=(List<Student>) repo.findAll();
		return students;
	}
	
	@Override
	public Student getStudent(Integer id) {
		Student s1= repo.findById(id).get();
		return s1;
	}

	@Override
	public Student updateStudent(Student student) {
			
		Student s=new Student();
		
		s.setId(student.getId());
		s.setName(student.getName());
		s.setSub1(student.getSub1());
		s.setSub2(student.getSub2());
		s.setSub3(student.getSub3());
		
		double t=s.getSub1()+s.getSub2()+s.getSub3();
		
		double p=(t)/3;
		
		s.setTotal(t);
		s.setPercentage(p);
		
		char g='Z';
		
		if(s.getPercentage()>70)
		{g='A';
			
		}
		else if(s.getPercentage()>60&&s.getPercentage()<70)
		{g='B';
			
		}
		else if(s.getPercentage()<=60&&s.getPercentage()>=50)
		{g='C';
			
		}
		else if(s.getPercentage()<50)
		{g='F';
			
		}
			
		s.setGrade(g);

		repo.save(s);
		
		return s;

		}

	@Override
	public void deleteStudent(Integer id) {
		repo.deleteById(id);	
	}

}
