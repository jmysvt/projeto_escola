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

    @ElementCollection
    @CollectionTable(name = "professor_turmas",
            joinColumns = @JoinColumn(name = "professor_id"))
    @Column(name = "turmas")
    @NotBlank(message = "O campo turmas não pode estar vazio")
    private List<String> turmas;

    @ElementCollection
    @CollectionTable(name = "professor_disciplinas",
            joinColumns = @JoinColumn(name = "professor_id"))
    @Column(name = "disciplinas")
    @NotBlank(message = "O campo disciplinas não pode estar vazio")
    private List<String> disciplinas;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;




}
