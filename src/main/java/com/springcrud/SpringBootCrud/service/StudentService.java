package com.springcrud.SpringBootCrud.service;

import com.springcrud.SpringBootCrud.Bean.Student;
import com.springcrud.SpringBootCrud.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private final StudentRepository studentRepository;


    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    public record studentRecord (
            String cen,
            String name,
            String email
    ) {}

    public List<Student> getAllStudent()
    {
        return studentRepository.findAll();
    }


    public Optional<Student> getStudent(String id)
    {
        return studentRepository.findById(id);
    }



    public void addStudent(studentRecord student)
    {   Student st =new Student();
        st.setCen(student.cen);
        st.setName(student.name);
        st.setEmail(student.email);
        studentRepository.save(st);

    }

    public void  editStudent(studentRecord student, String id)
    {
        Student st =studentRepository.getById(id);
        st.setName(student.name);
        st.setEmail(student.email);
        studentRepository.save(st);

    }
    public  void deleteStudent(String id)
    {
        studentRepository.deleteById(id);
    }




}
