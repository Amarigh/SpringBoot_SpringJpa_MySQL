package com.springcrud.SpringBootCrud.Controller;

import com.springcrud.SpringBootCrud.Bean.Student;
import com.springcrud.SpringBootCrud.service.StudentService;
import com.springcrud.SpringBootCrud.service.StudentService.studentRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("api/fsdm/students")
public class StudentController {

    @Autowired
   public StudentService studentService;

   @GetMapping()
    public List<Student> getAllStudent()
   {
        return studentService.getAllStudent();
   }

   @GetMapping("{id}")
   public Optional<Student> getStudent(@PathVariable("id") String id)
   {
       return studentService.getStudent(id);
   }

   @PostMapping()
    public void addStudent(@RequestBody studentRecord student)
   {
       studentService.addStudent(student);
   }

   @PutMapping("{id}")
    public void editStudent(@RequestBody studentRecord student,@PathVariable("id") String id)
   {
       studentService.editStudent(student,id);
   }

   @DeleteMapping("{id}")
   public void deleteStudent(@PathVariable("id") String id)
   {
       studentService.deleteStudent(id);
   }

}
