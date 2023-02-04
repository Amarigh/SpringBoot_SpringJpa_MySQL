package com.springcrud.SpringBootCrud.Repository;

import com.springcrud.SpringBootCrud.Bean.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,String> {

}
