package com.senai.projeto_escola.Application.Service;

import com.senai.projeto_escola.Application.DTO.ProfessorDTO;
import com.senai.projeto_escola.Domain.Entity.Professor;
import com.senai.projeto_escola.Domain.Repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ProfessorService {

    @Autowired
    private ProfessorRepository professorRepository;

    @Transactional(readOnly = true)
    public List<ProfessorDTO> listarProfessores() {
        return professorRepository.findAll()
                .stream()
                .map(ProfessorDTO::fromEntity)
                .toList();
    }

    @Transactional(readOnly = true)
    public ProfessorDTO buscarProfessorPorId(String id) {
        return professorRepository.findById(id)
                .map(ProfessorDTO::fromEntity)
                .orElse(null);
    }

    public ProfessorDTO salvarProfessor(ProfessorDTO dto) {
        Professor professor = dto.toEntity();
        Professor salvo = professorRepository.save(professor);
        return ProfessorDTO.fromEntity(salvo);
    }

    public ProfessorDTO atualizarProfessor(String id, ProfessorDTO dto) {
        Optional<Professor> professorOpt = professorRepository.findById(id);
        if (professorOpt.isEmpty()) return null;

        Professor professor = professorOpt.get();
        professor.setNome(dto.nome());
        professor.setCpf(dto.cpf());
        professor.setTipo("Professor");
        professor.setTurmas(dto.turmas());
        professor.setDisciplinas(dto.disciplinas());

        Professor atualizado = professorRepository.save(professor);
        return ProfessorDTO.fromEntity(atualizado);
    }

    public void deletarProfessor(String id) {
        professorRepository.deleteById(id);
    }
}

