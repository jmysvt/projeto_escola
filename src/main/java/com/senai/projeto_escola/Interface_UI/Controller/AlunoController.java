package com.senai.projeto_escola.Interface_UI.Controller;

import com.senai.projeto_escola.Domain.Entity.Aluno;
import com.senai.projeto_escola.application.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public class AlunoController {


    @Autowired
    AlunoService alunoService;

    @GetMapping
    public List<Aluno> listarAlunos(){
        return alunoService.listarAlunos();
    }

    @GetMapping("/{id}")
    public Aluno buscarAluno(@PathVariable String id){
        return alunoService.bucarAlunoPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletarAluno(@PathVariable String id){
        alunoService.deletarAluno(id);
    }



}
