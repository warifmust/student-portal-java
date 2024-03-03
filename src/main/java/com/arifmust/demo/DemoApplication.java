package com.arifmust.demo;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arifmust.demo.student.Student;

@SpringBootApplication
@RestController
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping
	public List<Student> hello() {
		return List.of(
				new Student(
						1L,
						"Maryam",
						4,
						LocalDate.of(2020, Month.JANUARY, 31),
						"maryam.med@gmail.com"));
	}

}
