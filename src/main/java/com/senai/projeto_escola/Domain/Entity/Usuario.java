package com.senai.projeto_escola.Domain.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
public class Usuario {

    @NotBlank(message = "O campo nome não pode estar vazio")
    @Column(nullable = false, length = 100)
    private String nome;

    @NotNull(message = "O campo CPF não pode estar vazio")
    @Column(nullable = false, length = 25)
    private int cpf;

    @NotBlank(message = "O campo turmas não pode estar vazio")
    @Column(nullable = false, length = 25)
    private String tipo;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

}
