package com.senai.projeto_escola.Domain.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Entity
@Data
public class Curso {

    @NotBlank(message = "O campo titulo não pode estar vazio")
    @Column(nullable = false, length = 25)
    private String titulo;

    @NotNull(message = "O campo Carga Horaria não pode estar vazio")
    @Column(nullable = false, length = 25)
    private int cargaHoraria;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @OneToMany(mappedBy = "curso")
    private List<Aluno> alunos;
}
