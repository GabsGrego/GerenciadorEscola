package com.fiap.GerenEscola.repository;

import com.fiap.GerenEscola.model.Aluno;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
    Page<Aluno> findByNomeContainingOrIdContainingOrMatricula(String nome, long id, long matricula, Pageable pageable);

}



