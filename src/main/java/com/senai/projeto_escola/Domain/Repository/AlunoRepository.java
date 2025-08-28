package com.senai.projeto_escola.Domain.Repository;

import com.senai.projeto_escola.Domain.Entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository  extends JpaRepository<Aluno, String> {
}
