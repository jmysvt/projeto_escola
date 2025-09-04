package com.senai.projeto_escola.Interface_UI.Controller;
import com.senai.projeto_escola.Application.DTO.AlunoDTO;
import com.senai.projeto_escola.Domain.Entity.Aluno;
import com.senai.projeto_escola.Application.Service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/aluno")
public class AlunoController {

    @Autowired
    AlunoService alunoService;

    @GetMapping
    public List<AlunoDTO> listarAlunos(){
        return alunoService.listarAlunos();
    }

    @GetMapping("/{id}")
    public AlunoDTO buscarAluno(@PathVariable String id){
        return alunoService.buscarAlunoPorId(id);
    }

    @PostMapping
    public AlunoDTO salvarAluno(@RequestBody AlunoDTO alunoDTO){
        return alunoService.salvarAluno(alunoDTO);
    }

    @PutMapping("/{id}")
    public AlunoDTO editarAluno(@PathVariable String id ,@RequestBody AlunoDTO alunoDTO){
        return alunoService.atualizarAluno(id,alunoDTO);
    }
    @DeleteMapping("/{id}")
    public void deletarAluno(@PathVariable String id){
        alunoService.deletarAluno(id);
    }
}
