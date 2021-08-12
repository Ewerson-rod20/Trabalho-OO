/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.trabalho.character;

/**
 *
 * @author danie
 */
public class ClassePersonagem {
    
    // Atributos ---------------------------------------------------------------
    // Atributos do ataque 1:
    private String nome1;
    private int ataque1;
    
    // Atributos do ataque 2:
    private String nome2;
    private int ataque2;
    
    // Atributos do ataque 3:
    private String nome3;
    private int ataque3;
    
    // Construtor --------------------------------------------------------------
    public ClassePersonagem(int ataque1, int ataque2, int ataque3) {
        this.ataque1 = ataque1;
        this.ataque2 = ataque2;
        this.ataque3 = ataque3;
    }
    
    // Getteres ----------------------------------------------------------------
    // Ataque 1:
    public String getNome1(){
        return nome1;
    }
    public int getAtaque1() {
        return ataque1;
    }

    // Ataque 2:
    public String getNome2(){
        return nome2;
    }
    public int getAtaque2() {
        return ataque2;
    }

    // Ataque 3:
    public String getNome3(){
        return nome3;
    }
    public int getAtaque3() {
        return ataque3;
    }
    
    // Setteres ----------------------------------------------------------------
    // Ataque 1:
    public void setNome1(String nome1){
        this.nome1 = nome1;
    }
    public void setAtaque1(int ataque1) {
        this.ataque1 = ataque1;
    }

    // Ataque 2:
    public void setNome2(String nome2){
        this.nome2 = nome2;
    }
    public void setAtaque2(int ataque2) {
        this.ataque2 = ataque2;
    }

    // Ataque 3:
    public void setNome3(String nome3){
        this.nome1 = nome3;
    }
    public void setAtaque3(int ataque3) {
        this.ataque3 = ataque3;
    }
    
}
