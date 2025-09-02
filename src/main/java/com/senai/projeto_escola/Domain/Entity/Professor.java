package com.senai.projeto_escola.Domain.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Professor extends Usuario {

    @NotBlank(message = "O campo turmas não pode estar vazio")
    @Column(nullable = false, length = 25)
    private List<String> Turmas;

    @NotBlank(message = "O campo disciplinas não pode estar vazio")
    @Column(nullable = false, length = 15)
    private List<String> Disciplinas;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private List<String> id;




}
