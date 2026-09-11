package com.example.project2.aws2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentServiceImpl studentService;

    @Autowired
    private StudentService service;

    // Create Student
    @PostMapping
    public Student createStudent(@RequestBody Student student) {

        return service.createStudent(student);

    }

    // Get Student By ID
    @GetMapping("/{id}")
    public Student getStudent(@PathVariable Long id) {

        return service.getStudent(id);

    }

    // Get All Students
    @GetMapping
    public List<Student> getAllStudents() {

        return service.getAllStudents();

    }

    // Update Student
    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id,
                                 @RequestBody Student student) {

        return service.updateStudent(id, student);

    }

    // Delete Student
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {

        service.deleteStudent(id);

    }

}
