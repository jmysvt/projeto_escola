package com.senai.projeto_escola.Domain.Repository;

import com.senai.projeto_escola.Domain.Entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CursoRepository extends JpaRepository<Curso, String> {
}
