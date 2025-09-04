package com.senai.projeto_escola.Application.DTO;

import com.senai.projeto_escola.Domain.Entity.Professor;

import java.util.List;

public record ProfessorDTO (
        String nome,
        int cpf,
        List<String>turmas,
        List<String>disciplinas

){
    public static ProfessorDTO fromEntity(Professor professor){
        if (professor == null) return null;
        return new ProfessorDTO(
                professor.getNome(),
                professor.getCpf(),
                professor.getTurmas(),
                professor.getDisciplinas()
        );
    }

    public Professor toEntity() {
        Professor professor = new Professor();
        professor.setNome(this.nome);
        professor.setCpf(this.cpf);
        professor.setTipo("Professor");
        professor.setTurmas(this.turmas);
        professor.setDisciplinas(this.disciplinas);
        return professor;
    }

}
