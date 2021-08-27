package ufjf.dcc025.trabalho.modelUsers;

import javax.swing.JOptionPane;
import ufjf.dcc025.trabalho.modelCharacter.Personagem;

/**
 * @author  Daniel Muller Rezende
 * @@code   202065020A
 */

public class Organizador {
    
    String nome;
    String cpf;
    String dataNascimento;
    String email;
    String senha;
    Personagem personagem;
    
    // Construtores ------------------------------------------------------------
    public Organizador(){
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
 
    public Personagem getPersonagem(){
        return personagem;
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
    
    public void setPersonagem(Personagem personagem){
        this.personagem = personagem;
    }
    
    public void deletaOrganizador(){
        this.nome = null;
        this.cpf = null;
        this.dataNascimento = null;
        this.email = null;
        this.senha = null;
    }
}
