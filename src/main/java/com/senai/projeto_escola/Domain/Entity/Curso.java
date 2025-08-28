package com.senai.projeto_escola.Domain.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
public class Curso {

    @NotBlank(message = "O campo titulo não pode estar vazio")
    @Column(nullable = false, length = 25)
    private String titulo;

    @NotNull(message = "O campo Carga Horaria não pode estar vazio")
    @Column(nullable = false, length = 25)
    private int cargaHoraria;
}
