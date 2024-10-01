package com.fiap.GerenEscola.controller.dto;

import com.fiap.GerenEscola.model.Aluno;

public class AlunoDTO {

    private long id;
    private String nome;
    private String email;
    private String matricula;

    public AlunoDTO() {}

    public AlunoDTO(Aluno aluno) {
        this.id = aluno.getId();
        this.nome = aluno.getNome();
        this.email = aluno.getEmail();
        this.matricula = aluno.getMatricula();
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
