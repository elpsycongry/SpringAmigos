package com.example.corelearn.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository
    ){
        return args -> {
               Student tung = new Student(
                       1,
                       "Tung",
                       "tungemail@.gmail.com",
                       LocalDate.of(2004, Month.MAY,2)
               );
               Student duc = new Student(
                       2,
                       "Duc",
                       "tungemail@.gmail.com",
                       LocalDate.of(2008, Month.MAY,2)
               );
               repository.saveAll(
                       List.of(tung, duc)
               );
        };
    }
}
