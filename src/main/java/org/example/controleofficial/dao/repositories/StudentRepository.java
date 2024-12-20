package org.example.controleofficial.dao.repositories;

import org.example.controleofficial.dao.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    public List<Student> findByDateNaissance(Date dateNaissance);
}

