package com.school.controller;


import com.school.model.Student;
import com.school.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class StudentController {

    @Autowired
    private StudentRepository studentrepository;

    @GetMapping("/employees")
    public List<Student> getAllStudents(){
        return studentrepository.findAll();
    }

    @PostMapping("/employees")
    public Student createEmployee(@RequestBody  Student student){
        return studentrepository.save(student);
    }

}
