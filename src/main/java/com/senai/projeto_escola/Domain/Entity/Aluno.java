package com.senai.projeto_escola.Domain.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@MappedSuperclass
@Data
public class Aluno extends Usuario {

    @NotBlank(message = "O campo turma não pode estar vazio")
    @Column(nullable = false, length = 15)
    private String turma;

    @ManyToOne
    @NotBlank(message = "O campo curso não pode estar vazio")
    @JoinColumn(name = "curso_id")
    private Curso curso;




}
