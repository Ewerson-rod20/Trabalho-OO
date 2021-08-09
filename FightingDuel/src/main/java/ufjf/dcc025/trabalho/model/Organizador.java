/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.trabalho.model;

/**
 *
 * @author danie
 */
public class Organizador {
    
    String nome;
    String cpf;
    String dataNascimento;
    String email;
    String senha;
    
    // Construtores ------------------------------------------------------------
    public Organizador(){
        this.nome = null;
        this.cpf = null;
        this.dataNascimento = null;
        this.email = null;
        this.senha = null;
    }
    
    public Organizador(String nome, String cpf, String nascimento, String email, String senha){
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = nascimento;
        this.email = email;
        this.senha = senha;
    }
    
    // Getteres ----------------------------------------------------------------
    public String getNome() {
        return nome;
    }
    
    public String getCpf(){
        return cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }
    
    // Setteres ----------------------------------------------------------------
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
