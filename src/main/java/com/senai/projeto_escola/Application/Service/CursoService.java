package com.senai.projeto_escola.Application.Service;

import com.senai.projeto_escola.Domain.Entity.Curso;
import com.senai.projeto_escola.Domain.Repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {
    @Autowired
    CursoRepository cursoRepository;

    public List<Curso> listarCursos(){
        return cursoRepository.findAll();
    }

    public Curso buscarCursoPorId (String id){
        return cursoRepository.findById(id).orElse(null);
    }

    public Curso salvarCurso(Curso curso){
        return cursoRepository.save(curso);
    }

    public Curso atualizarCurso(String id, Curso cursoAtualizado){
        if (!cursoRepository.existsById(id))
            return null;
        cursoAtualizado.setId(id);
        return cursoRepository.save(cursoAtualizado);
    }

    public void deletarCurso(String id){
        cursoRepository.deleteById(id);
    }
}
