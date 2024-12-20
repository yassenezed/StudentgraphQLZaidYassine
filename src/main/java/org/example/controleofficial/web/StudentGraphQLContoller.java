package org.example.controleofficial.web;


import lombok.AllArgsConstructor;
import org.example.controleofficial.dto.StudentDto;
import org.example.controleofficial.service.StudentService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Controller
@AllArgsConstructor
public class StudentGraphQLContoller {


    private StudentService studentService ;

    @MutationMapping
    public StudentDto saveStudent(@Argument StudentDto student){
        return studentService.saveStudent(student);
    }


    @QueryMapping
    public List<StudentDto> getStudentByDateNaissance(@Argument Date dateNaissance){
        return studentService.getStudentByDateNaissance(dateNaissance);
    }



}
