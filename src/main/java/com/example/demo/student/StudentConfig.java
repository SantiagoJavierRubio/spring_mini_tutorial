package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student santiago = new Student(
				"Santiago",
				"santiaguito@gmail.com",
				LocalDate.of(1991, Month.MAY, 24)
			);

            Student marcos = new Student(
                "Marcos",
                "marquitos@gmail.com",
                LocalDate.of(1995, Month.JANUARY, 5)
            );
            studentRepository.saveAll(List.of(santiago, marcos));
        };
    }
}
