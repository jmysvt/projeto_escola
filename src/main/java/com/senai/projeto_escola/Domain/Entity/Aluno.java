package com.senai.projeto_escola.Domain.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Aluno extends Usuario {

    @NotBlank(message = "O campo turma não pode estar vazio")
    @Column(nullable = false, length = 15)
    private String turma;

    @ManyToOne
    @NotNull(message = "O campo curso não pode estar vazio")
    @JoinColumn(name = "curso_id")
    private Curso curso;

}
