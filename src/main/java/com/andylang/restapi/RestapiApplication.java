// 46:36
package com.andylang.restapi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@SpringBootApplication
public class RestapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestapiApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(StudentRepository repository) {
        return args -> {
            Address address = new Address(
                    "Finland",
                    "Helsinki",
                    "00940"
            );
            Student student = new Student(
                    "Andy",
                    "Lang",
                    "andylang@email.com",
                    Gender.MALE,
                    address,
                    List.of("Computer Science", "Mathematics"),
                    BigDecimal.TEN,
                    LocalDateTime.now()
            );

            repository.insert(student);
        };
    }
}
