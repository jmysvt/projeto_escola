package com.senai.projeto_escola.Application.DTO;
import com.senai.projeto_escola.Domain.Entity.Aluno;
import com.senai.projeto_escola.Domain.Entity.Curso;

public record AlunoDTO (
    String nome,
    int cpf,
    String idCurso,
    String turma
){
    public static AlunoDTO fromEntity(Aluno aluno){
        if(aluno ==null) return null;
        return new AlunoDTO(
                aluno.getNome(),
                aluno.getCpf(),
                aluno.getCurso() !=null ? aluno.getCurso().getId() : null ,
                aluno.getTurma()
        );
    }

    public Aluno toEntity(Curso curso){
        Aluno aluno = new Aluno();
        aluno.setNome(this.nome);
        aluno.setCpf(this.cpf);
        aluno.setTipo("Aluno");
        aluno.setTurma(this.turma);
        aluno.setCurso(curso);
        return aluno;

    }

}
