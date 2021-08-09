package ufjf.dcc025.trabalho.model;

import java.util.Scanner;
/**
 * @author Vitor Fernandes Reis (202065096A)
 */
public class Jogador {
    
    String nome;
    String dataNascimento;
    String email;
    String senha;
    Personagem personagem;
    
    // Construtores ------------------------------------------------------------
    public Jogador(){
        this.nome = null;
        this.dataNascimento = null;
        this.email = null;
        this.senha = null;
        this.personagem = null;
    }
    
    public Jogador(String nome, String nascimento, String email, String senha, Personagem personagem){
        this.nome = nome;
        this.dataNascimento = nascimento;
        this.email = email;
        this.senha = senha;
        this.personagem = personagem;
    }
    
    // Getteres ----------------------------------------------------------------
    public String getNome() {
        return nome;
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
    
    public Personagem getPersonagem(){
        return personagem;
    }
    
    // Setteres ----------------------------------------------------------------
    public void setNome(String nome) {
        this.nome = nome;
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
    
    public void setPersonagem(Personagem personagem){
        this.personagem = personagem;
    }
    
}
