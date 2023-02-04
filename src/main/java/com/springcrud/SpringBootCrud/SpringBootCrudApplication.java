package com.springcrud.SpringBootCrud;

import com.springcrud.SpringBootCrud.Repository.StudentRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringBootCrudApplication
{

	public static void main(String[] args)
	{

		SpringApplication.run(SpringBootCrudApplication.class, args);
	}

}
