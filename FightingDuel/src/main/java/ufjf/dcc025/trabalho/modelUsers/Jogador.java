package ufjf.dcc025.trabalho.modelUsers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;
import ufjf.dcc025.trabalho.modelCharacter.Personagem;

public class Jogador {
    
    String nome;
    String dataNascimento;
    String email;
    String senha;
    List<Personagem> personagens; // Personagens do jogador
//    Personagem personagem1;  // Personagens do Jogador
//    Personagem personagem2;  //
//    Personagem personagem3;  //
    int contPersonagem;      // Contador de personagens do Jogador
    
    
    // Construtores ------------------------------------------------------------
    public Jogador(){
        this.nome = null;
        this.dataNascimento = null;
        this.email = null;
        this.senha = null;
        personagens = new ArrayList<>();
//        this.personagem1 = null;
//        this.personagem2 = null;
//        this.personagem3 = null;
        contPersonagem = 0;
    }
    
    public Jogador(String nome, String nascimento, String email, String senha){
        this.nome = nome;
        this.dataNascimento = nascimento;
        this.email = email;
        this.senha = senha;
        personagens = new ArrayList<>();
        contPersonagem = 0;
    }    
    
    public Jogador(String nome, String nascimento, String email, String senha, Personagem personagem){
        this.nome = nome;
        this.dataNascimento = nascimento;
        this.email = email;
        this.senha = senha;       
        personagens = new ArrayList<>();
        personagens.add(personagem);
        contPersonagem = personagens.size();
//        this.personagem1 = personagem;
//        contPersonagem++;     
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
    
//    public Personagem[] getPersonagens(){
//        if(personagem3 != null){
//            personagens[0] = personagem1;
//            personagens[1] = personagem2;
//            personagens[2] = personagem3;
//        } else if(personagem2 != null){
//            personagens[0] = personagem1;
//            personagens[1] = personagem2;
//        } else if(personagem1 != null){
//            personagens[0] = personagem1;
//        } else {}
//        return personagens;
//    }
    
//    public Personagem getPersonagem1(){
//        return personagem1;
//    }
//    
//    public Personagem getPersonagem2(){
//        return personagem2;
//    }
//
//    public Personagem getPersonagem3(){
//        return personagem3;
//    }
    
    public List<Personagem> getPersonagens(){
        return this.personagens;
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
    
//    public void setPersonagem(Personagem personagem){
//        if (contPersonagem == 0){
//            this.personagem1 = personagem;
//            contPersonagem++;
//        }
//        else if (contPersonagem == 1){
//            this.personagem2 = personagem;
//            contPersonagem++;            
//        }
//        else if (contPersonagem == 2){
//            this.personagem3 = personagem;
//            contPersonagem++;    
//        }
//        else
//            JOptionPane.showMessageDialog (null, "Número máximo de personagens alcançado."
//            , "Aviso", JOptionPane.INFORMATION_MESSAGE); 
//    }
    
    public void addPersonagem(Personagem personagem){
        if(personagens.size() == 3){
            JOptionPane.showMessageDialog(null, "Número máximo de personagens atingido!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            personagens.add(personagem);
            JOptionPane.showMessageDialog(null, "Personagem criado com sucesso!");
        }
        contPersonagem = personagens.size();
    }
    
    public int getcontPersonagem(){
        return contPersonagem;
    }
    
    // Métodos -----------------------------------------------------------------
//    public void removePersonagem(Personagem personagem){
//        if (personagem1 == personagem){
//            personagem1 = null;
//            contPersonagem--;
//        }
//        else if (personagem2 == personagem){
//            personagem2 = null;
//            contPersonagem--;
//        }
//        else if (personagem3 == personagem){
//            personagem3 = null;
//            contPersonagem--;
//        }
//        else
//            JOptionPane.showMessageDialog (null, "Personagem não encontrado."
//            , "Aviso", JOptionPane.INFORMATION_MESSAGE);
//    }
    
    public void removePersonagem(String nome){
        int indice = 0;
        boolean removeu = false;
        for(Personagem personagem : personagens){
            if(personagem.getNome().equals(nome)){
                personagens.remove(indice);
                removeu = true;
                JOptionPane.showMessageDialog(null, "Personagem deletado com sucesso!");
                break;
            }
            indice++;
        }
        if(!removeu){
            JOptionPane.showMessageDialog(null, "Personagem não encontrado!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
        contPersonagem = personagens.size();
    }
}
