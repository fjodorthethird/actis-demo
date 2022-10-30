package com.actis.actisproject.controller;

import com.actis.actisproject.exception.ResourceNotFoundException;
import com.actis.actisproject.model.Student;
import com.actis.actisproject.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("students")
    public List<Student> getAllStudents(){
        return this.studentRepository.findAll();
    }

    @GetMapping("/students/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable(value = "id") Long studentId)
        throws ResourceNotFoundException{
        Student student = studentRepository.findById(studentId)
                .orElseThrow(() -> new ResourceNotFoundException("Student not found ::" + studentId));
        return ResponseEntity.ok().body(student);
    }
}
