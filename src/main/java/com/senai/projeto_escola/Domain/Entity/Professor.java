package com.senai.projeto_escola.Domain.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Data
public class Professor extends Usuario {

    @NotBlank(message = "O campo turmas não pode estar vazio")
    @Column(nullable = false, length = 25)
    private String Turmas;

    @NotBlank(message = "O campo disciplinas não pode estar vazio")
    @Column(nullable = false, length = 15)
    private String Disciplinas;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;




}
