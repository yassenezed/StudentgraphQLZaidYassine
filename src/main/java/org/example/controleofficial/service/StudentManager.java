package org.example.controleofficial.service;

import lombok.AllArgsConstructor;
import org.example.controleofficial.dao.entities.Student;
import org.example.controleofficial.dao.repositories.StudentRepository;
import org.example.controleofficial.dto.StudentDto;
import org.example.controleofficial.mapper.StudentMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Service
@AllArgsConstructor
public class StudentManager implements StudentService{


    private StudentRepository studentRepository;
    private StudentMapper studentMapper;
    @Override
    public StudentDto saveStudent(StudentDto studentDto) {
        Student student = studentMapper.fromStudentDtoToStudent(studentDto);
        student = studentRepository.save(student);
        studentDto = studentMapper.fromStudentToStudentDto(student);
        return studentDto;
    }

    @Override
    public List<StudentDto> getStudentByDateNaissance(Date dateNaissance) {
        List<Student> students = studentRepository.findByDateNaissance(dateNaissance);
        List<StudentDto> studentDtos = new ArrayList<>();
        for (Student student : students) {
            studentDtos.add(studentMapper.fromStudentToStudentDto(student));
        }
        return studentDtos;
    }

    @Override
    public List<StudentDto> saveStudents(List<StudentDto> studentDtos) {

        List<Student> students = new ArrayList<>();
        for (StudentDto studentDto : studentDtos) {
            students.add(studentMapper.fromStudentDtoToStudent(studentDto));
        }

        students = studentRepository.saveAll(students);

        studentDtos = new ArrayList<>();
        for (Student student : students) {
            studentDtos.add(studentMapper.fromStudentToStudentDto(student));
        }
        return studentDtos;
    }

}
