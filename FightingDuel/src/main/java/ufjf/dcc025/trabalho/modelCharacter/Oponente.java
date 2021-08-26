/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.trabalho.modelCharacter;

/**
 *
 * @author Bonorino
 */
public class Oponente extends Personagem{
    
    private boolean jogavel;
    
    public Oponente(String nome, ClassePersonagem classe, int nivel) {
        super(nome, classe, nivel);
        jogavel = false;
    }

    public boolean isJogavel() {
        return jogavel;
    }

    public void setJogavel(boolean jogavel) {
        this.jogavel = jogavel;
    }
    
}
