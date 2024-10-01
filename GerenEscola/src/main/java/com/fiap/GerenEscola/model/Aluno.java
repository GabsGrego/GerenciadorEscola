package com.fiap.GerenEscola.model;

import com.fiap.GerenEscola.controller.dto.AlunoDTO;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

import java.util.Set;

@Entity
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    private String nome;

    @Email
    private String email;

    @NotNull
    private String matricula;

    @ManyToMany()
    private Set<Curso> curso;

    public Aluno() {}

    public Aluno(AlunoDTO alunoDTO) {
        this.id = alunoDTO.getId();
        this.nome = alunoDTO.getNome();
        this.email = alunoDTO.getEmail();
        this.matricula = alunoDTO.getMatricula();
    }

    public long getId() {return id;}

    public void setId(long id) {this.id = id;}

    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}

    public String getMatricula() {return matricula;}

    public void setMatricula(String matricula) {this.matricula = matricula;}

}