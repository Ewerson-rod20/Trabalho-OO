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
    private int ataque1;
    private int ataque2;
    private int ataque3;
    
    // Construtor --------------------------------------------------------------
    public ClassePersonagem(int ataque1, int ataque2, int ataque3) {
        this.ataque1 = ataque1;
        this.ataque2 = ataque2;
        this.ataque3 = ataque3;
    }
    
    // Getteres ----------------------------------------------------------------
    public int getAtaque1() {
        return ataque1;
    }

    public int getAtaque2() {
        return ataque2;
    }

    public int getAtaque3() {
        return ataque3;
    }
    
    // Setteres ----------------------------------------------------------------
    public void setAtaque1(int ataque1) {
        this.ataque1 = ataque1;
    }

    public void setAtaque2(int ataque2) {
        this.ataque2 = ataque2;
    }

    public void setAtaque3(int ataque3) {
        this.ataque3 = ataque3;
    }
    
}
