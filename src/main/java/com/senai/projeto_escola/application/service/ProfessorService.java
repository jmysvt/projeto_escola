package com.senai.projeto_escola.application.service;
import com.senai.projeto_escola.Domain.Entity.Professor;
import com.senai.projeto_escola.Domain.Repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {
    @Autowired
    ProfessorRepository professorRepository;

    public List<Professor> listarProfessores(){
        return professorRepository.findAll();
    }

    public Professor bucarProfessorPorId (String id){
        return professorRepository.findById(id).orElse(null);
    }

    public Professor salvarProfessor(Professor professor){
        return professorRepository.save(professor);
    }

    public Professor atualizarProfessor(String id, Professor professorAtualizado){
        if (!professorRepository.existsById(id))
            return null;
        professorAtualizado.setId(id);
        return professorRepository.save(professorAtualizado);
    }

    public void deletarProfessor(String id){
        professorRepository.deleteById(id);
    }

}
