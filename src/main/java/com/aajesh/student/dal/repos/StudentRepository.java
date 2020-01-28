package com.aajesh.student.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.aajesh.student.dal.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
