package com.fiap.GerenEscola.service;

import com.fiap.GerenEscola.controller.dto.AlunoDTO;
import com.fiap.GerenEscola.model.Aluno;
import com.fiap.GerenEscola.repository.AlunoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    @Transactional()
    public AlunoDTO criarAluno(AlunoDTO alunoDTO) {
        Aluno aluno = new Aluno(alunoDTO);
        aluno = alunoRepository.save(aluno);
        return new AlunoDTO(aluno);
    }

    @Transactional()
    public AlunoDTO atualizarAluno(Long id, AlunoDTO alunoDTO) {
        Aluno aluno = alunoRepository.findById(id).orElseThrow(() -> new RuntimeException("Aluno não encontrado."));
        aluno.setNome(alunoDTO.getNome());
        aluno.setEmail(alunoDTO.getEmail());
        aluno = alunoRepository.save(aluno);
        return new AlunoDTO(aluno);
    }


}
