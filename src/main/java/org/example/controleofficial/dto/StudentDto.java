package org.example.controleofficial.dto;

import lombok.*;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class StudentDto {
    String name;
    String email;
    Date dateNaissance;
}