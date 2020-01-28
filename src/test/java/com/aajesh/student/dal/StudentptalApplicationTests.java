package com.aajesh.student.dal;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.aajesh.student.dal.entities.Student;
import com.aajesh.student.dal.repos.StudentRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentptalApplicationTests {

	@Autowired
	private StudentRepository studentRepository;

	@Test
	public void testCreateStudent() {

		Student s = new Student();
		s.setName("ajesh");
		s.setCourse("java");
		s.setFee(30d);

		studentRepository.save(s);
	}
	@Test
	public void testReadStudent() {
		Optional<Student> stutent = studentRepository.findById(1l);
		System.out.println(stutent);
	}

	@Test
	public void testUpdateStudent() {
		Optional<Student> s = studentRepository.findById(1l);
		Student ss = s.get();
		ss.setFee(40d);
		studentRepository.save(ss);
	}
	
	@Test
	public void testDeleteStudent() {
		Student s = new Student();
		s.setId(1l);
		 //studentRepository.save(ss);
		 studentRepository.delete(s);
	}

}
