package org.example.controleofficial.service;

import org.example.controleofficial.dto.StudentDto;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface StudentService {
    public StudentDto saveStudent(StudentDto studentDto);


    public List<StudentDto> getStudentByDateNaissance(Date dateNaissance);


    public List<StudentDto> saveStudents(List<StudentDto> studentDtos);

}
