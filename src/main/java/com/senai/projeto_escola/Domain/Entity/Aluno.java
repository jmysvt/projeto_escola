package com.senai.projeto_escola.Domain.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Data
public class Aluno extends Usuario {
    @NotBlank(message = "O campo turma não pode estar vazio")
    @Column(nullable = false, length = 15)
    private String turma;

    @NotBlank(message = "O campo curso não pode estar vazio")
    @Column(nullable = false, length = 15)
    private String curso;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;


}
