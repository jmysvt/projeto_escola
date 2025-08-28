package com.senai.projeto_escola.Domain.Repository;

import com.senai.projeto_escola.Domain.Entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository  extends JpaRepository<Curso, String> {

}
