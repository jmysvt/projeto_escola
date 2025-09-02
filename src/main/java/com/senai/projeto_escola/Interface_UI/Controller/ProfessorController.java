package com.senai.projeto_escola.Interface_UI.Controller;

import com.senai.projeto_escola.Domain.Entity.Curso;
import com.senai.projeto_escola.Domain.Entity.Professor;
import com.senai.projeto_escola.application.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/professor")
public class ProfessorController {
    @Autowired
    ProfessorService professorService;

    @GetMapping
    public List<Professor> listarProfessores(){
        return professorService.listarProfessores();
    }

    @GetMapping("/{id}")
    public Professor buscarProfessor(@PathVariable String id){
        return professorService.bucarProfessorPorId(id);
    }

    @PostMapping
    public Professor salvarProfessor(@RequestBody Professor professor){
        return professorService.salvarProfessor (professor);
    }

    @PutMapping("/{id}")
    public Professor editarProfessor(@PathVariable String id ,@RequestBody Professor professor){
        return professorService.atualizarProfessor(id,professor);
    }
    @DeleteMapping("/{id}")
    public void deletarProfessor(@PathVariable String id){
        professorService.deletarProfessor (id);
    }
}
