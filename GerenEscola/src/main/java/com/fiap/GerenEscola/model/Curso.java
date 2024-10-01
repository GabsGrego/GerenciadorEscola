package com.fiap.GerenEscola.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.Set;

@Entity
public class Curso{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    private String nome;

    private String descricao;

    private int cargaHoraria;

    @ManyToMany
    private Set<Aluno> alunos;

    public Curso(){}

    public Curso(long id, String nome, String descricao, int cargaHoraria, Set<Aluno> alunos) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
        this.alunos = alunos;
    }

    public long getId() {return id;}

    public void setId(long id) {this.id = id;}

    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public String getDescrição() {return descricao;}

    public void setDescrição(String descricao) {this.descricao = descricao;}

    public int getCargaHoraria() {return cargaHoraria;}

    public void setCargaHoraria(int cargaHoraria) {this.cargaHoraria = cargaHoraria;}

    public Set<Aluno> getAlunos() {return alunos;}

    public void setAlunos(Set<Aluno> alunos) {this.alunos = alunos;}
}
