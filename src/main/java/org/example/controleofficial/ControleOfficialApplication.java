package org.example.controleofficial;

import org.example.controleofficial.dto.StudentDto;
import org.example.controleofficial.service.StudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class ControleOfficialApplication {

    public static void main(String[] args) {
        SpringApplication.run(ControleOfficialApplication.class, args);
    }

    @Bean
    CommandLineRunner start(StudentService studentService){

        return  args -> {
            studentService.saveStudents(
                    List.of(
                            StudentDto.builder().name("Yassine").email("yassin@yassine.me").dateNaissance(Date.valueOf("2025-12-12")).build(),
                            StudentDto.builder().name("Idriss").email("idriss@idriss.me").dateNaissance(Date.valueOf("2025-12-12")).build(),
                            StudentDto.builder().name("Ayoub").email("ayoub@ayoub.me").dateNaissance(Date.valueOf("2025-12-12")).build(),
                            StudentDto.builder().name("Othman").email("othman@othman.me").dateNaissance(Date.valueOf("2025-12-12")).build()
                    )

            );
        };
    }



}
