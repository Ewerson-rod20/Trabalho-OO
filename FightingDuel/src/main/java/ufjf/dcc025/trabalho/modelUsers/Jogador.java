package ufjf.dcc025.trabalho.modelUsers;

import javax.swing.JOptionPane;
import ufjf.dcc025.trabalho.modelCharacter.Personagem;
/**
 * @author Vitor Fernandes Reis (202065096A)
 */
public class Jogador {
    
    String nome;
    String dataNascimento;
    String email;
    String senha;
    Personagem personagem1;
    Personagem personagem2;
    Personagem personagem3;
    int contPersonagem;      // Contador de personagens do Jogador
    
    
    // Construtores ------------------------------------------------------------
    public Jogador(){
        this.nome = null;
        this.dataNascimento = null;
        this.email = null;
        this.senha = null;
        this.personagem1 = null;
        this.personagem2 = null;
        this.personagem3 = null;
        contPersonagem = 0;
    }
    
    public Jogador(String nome, String nascimento, String email, String senha){
        this.nome = nome;
        this.dataNascimento = nascimento;
        this.email = email;
        this.senha = senha;    
    }    
    
    public Jogador(String nome, String nascimento, String email, String senha, Personagem personagem){
        this.nome = nome;
        this.dataNascimento = nascimento;
        this.email = email;
        this.senha = senha;
        
        if (contPersonagem == 0){
            this.personagem1 = personagem;
            contPersonagem++;
        }
        else if (contPersonagem == 1){
            this.personagem2 = personagem;
            contPersonagem++;            
        }
        else if (contPersonagem == 2){
            this.personagem3 = personagem;
            contPersonagem++;    
        }
        else
            JOptionPane.showMessageDialog (null, "Número máximo de personagens alcançado."
            , "Aviso", JOptionPane.INFORMATION_MESSAGE);        
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
    
    public Personagem getPersonagem1(){
        return personagem1;
    }
    
    public Personagem getPersonagem2(){
        return personagem2;
    }

    public Personagem getPersonagem3(){
        return personagem3;
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
        if (contPersonagem == 0){
            this.personagem1 = personagem;
            contPersonagem++;
        }
        else if (contPersonagem == 1){
            this.personagem2 = personagem;
            contPersonagem++;            
        }
        else if (contPersonagem == 2){
            this.personagem3 = personagem;
            contPersonagem++;    
        }
        else
            JOptionPane.showMessageDialog (null, "Número máximo de personagens alcançado."
            , "Aviso", JOptionPane.INFORMATION_MESSAGE); 
    }   
}
