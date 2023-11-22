package com.jpa.test.dao;

import org.springframework.data.repository.CrudRepository;

import com.jpa.test.entity.Student;

public interface StudentRepository extends CrudRepository<Student,Integer>{

}
