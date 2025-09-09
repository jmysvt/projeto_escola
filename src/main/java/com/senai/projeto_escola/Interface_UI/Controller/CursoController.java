package com.senai.projeto_escola.Interface_UI.Controller;
import com.senai.projeto_escola.Application.DTO.CursoDTO;
import com.senai.projeto_escola.Domain.Entity.Curso;
import com.senai.projeto_escola.Application.Service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/curso")
public class CursoController {
    @Autowired
    CursoService cursoService;

    @GetMapping
    public List<CursoDTO> listarCursos(){
        return cursoService.listarCursos();
    }

    @GetMapping("/{id}")
    public CursoDTO buscarCurso(@PathVariable String id){
        return cursoService.buscarCursoPorId(id);
    }

    @PostMapping
    public CursoDTO salvaCurso(@RequestBody CursoDTO dto){
        return cursoService.salvarCurso (dto);
    }

    @PutMapping("/{id}")
    public CursoDTO editarCurso(@PathVariable String id ,@RequestBody CursoDTO dto){
        return cursoService.atualizarCurso(id,dto);
    }
    @DeleteMapping("/{id}")
    public void deletarCuros(@PathVariable String id){
        cursoService.deletarCurso (id);
    }
}
