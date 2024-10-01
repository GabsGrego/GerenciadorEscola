package com.fiap.GerenEscola.controller;

import com.fiap.GerenEscola.controller.dto.AlunoDTO;
import com.fiap.GerenEscola.model.Aluno;
import com.fiap.GerenEscola.repository.AlunoRepository;
import com.fiap.GerenEscola.service.AlunoService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/alunos")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @PostMapping
    public ResponseEntity<AlunoDTO> criarAluno(@RequestBody AlunoDTO alunoDTO) {
        AlunoDTO novoAluno = alunoService.criarAluno(alunoDTO);
        return ResponseEntity.ok(novoAluno);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AlunoDTO> atualizarAluno(@PathVariable Long id, @RequestBody AlunoDTO alunoDTO) {
        AlunoDTO alunoAtualizado = alunoService.atualizarAluno(id, alunoDTO);
        return ResponseEntity.ok(alunoAtualizado);
    }


}
