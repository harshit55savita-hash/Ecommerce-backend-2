package com.example.project2.aws2;

import java.util.List;

public interface StudentService {
    Student createStudent(Student student);

    Student getStudent(Long id);

    List<Student> getAllStudents();

    Student updateStudent(Long id, Student student);

    void deleteStudent(Long id);

}
