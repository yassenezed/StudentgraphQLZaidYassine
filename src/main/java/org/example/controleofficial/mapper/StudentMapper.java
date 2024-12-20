package org.example.controleofficial.mapper;


import org.example.controleofficial.dao.entities.Student;
import org.example.controleofficial.dto.StudentDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper {
private final ModelMapper mapper = new ModelMapper();

    public Student fromStudentDtoToStudent(StudentDto studentDto){
        return mapper.map(studentDto, Student.class);
    }

    public StudentDto fromStudentToStudentDto(Student student){
        return mapper.map(student, StudentDto.class);
    }

}
