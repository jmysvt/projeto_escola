package com.senai.projeto_escola.Domain.Repository;

import com.senai.projeto_escola.Domain.Entity.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, String> {
}
