package com.senai.projeto_escola.Interface_UI.Controller;
import com.senai.projeto_escola.Domain.Entity.Curso;
import com.senai.projeto_escola.application.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/curso")
public class CursoController {
    @Autowired
    CursoService cursoService;

    @GetMapping
    public List<Curso> listarCursos(){
        return cursoService.listarCursos();
    }

    @GetMapping("/{id}")
    public Curso buscarCurso(@PathVariable String id){
        return cursoService.buscarCursoPorId(id);
    }

    @PostMapping
    public Curso salvaCurso(@RequestBody Curso curso){
        return cursoService.salvarCurso (curso);
    }

    @PutMapping("/{id}")
    public Curso editarCurso(@PathVariable String id ,@RequestBody Curso curso){
        return cursoService.atualizarCurso(id,curso);
    }
    @DeleteMapping("/{id}")
    public void deletarCuros(@PathVariable String id){
        cursoService.deletarCurso (id);
    }
}
