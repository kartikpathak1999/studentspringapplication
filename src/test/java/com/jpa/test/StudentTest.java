package com.jpa.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertNotNull; // Import the assertion method

import com.jpa.test.entity.Student;
import com.jpa.test.dao.StudentRepository;

@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class StudentTest {

    @Autowired
    private StudentRepository studentRepository;
   
    @Test
    public void testSaveStudent() {
        Student student = new Student();
        student.setName("John Doe");
        student.setAge(25);
        student.setSalary(50000.0);

        Student savedStudent = studentRepository.save(student);
        assertNotNull(savedStudent.getId());
    }
}
