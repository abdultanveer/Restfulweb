package com.example.Restfulweb.controller;


import com.example.Restfulweb.StudentRepository;
import com.example.Restfulweb.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * this class connects to the db
 */

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    List<Student> students = new ArrayList<>();

    public void createStudents() {

        students.add(new Student(1, "aaa", 1, 11));
        students.add(new Student(2, "bbb", 2, 22));
        students.add(new Student(3, "ccc",3, 33));
        students.add(new Student(4, "ddd", 4, 44));
    }
    public List<Student> getStudents() {
        createStudents();
        return studentRepository.findAll();
       // return students;
    }

    /**
     * query for the student in the db with
     * @param id given id
     * @return
     */
    public Student findStudent(int id) {
        Student student=  students.stream()   //convert the students list to a stream
                .filter(s -> s.getId() == id )
                .findFirst()
                .get();

        return student;
    }

    /**
     * add  a new student[row] in  the db
     * @param student
     */
    public void addStudent(Student student) {
        //students.add(student);
        studentRepository.save(student);
        System.out.println("added a student");
    }
}
