/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.trabalho.modelCharacter;

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
    
    String nomeClasse;
    
    float vidaBase;  // Vida máxima que um Personagem
    float forcaAtk; // Força de ataque de um Personagem
    float forcaDef; // Força de defesa de um Personagem
    
    // Construtor --------------------------------------------------------------
    public ClassePersonagem(int ataque1, int ataque2, int ataque3) {
        this.ataque1 = ataque1;
        this.ataque2 = ataque2;
        this.ataque3 = ataque3;
        ajustaNomes();
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
    
    public String getNomeClasse(){
        return nomeClasse;
    }

    public float getVidaBase() {
        return vidaBase;
    }

    public float getForcaAtk() {
        return forcaAtk;
    }

    public float getForcaDef() {
        return forcaDef;
    }
    
    // Setteres ----------------------------------------------------------------
    // Ataque 1:
    public void setAtaque1(int ataque1) {
        this.ataque1 = ataque1;
    }

    // Ataque 2:
    public void setAtaque2(int ataque2) {
        this.ataque2 = ataque2;
    }

    // Ataque 3:
    public void setAtaque3(int ataque3) {
        this.ataque3 = ataque3;
    }

    public void setVidaBase(float vidaBase) {
        this.vidaBase = vidaBase;
    }

    public void setForcaAtk(float forcaAtk) {
        this.forcaAtk = forcaAtk;
    }

    public void setForcaDef(float forcaDef) {
        this.forcaDef = forcaDef;
    }
    
    private void ajustaNomes(){
        if("Cavaleiro".equals(getNomeClasse())){
            nome1 = "Balanço de Espada";
            nome2 = "Escudada Carregada";
            nome3 = "Arremesso de Veneno";
        } else if("Ladrão".equals(getNomeClasse())){
            nome1 = "Flanco Estratégico";
            nome2 = "Encontro Frontal";
            nome3 = "Bomba de Fumaça";
        } else {
            nome1 = "Batida de Cajado";
            nome2 = "Furacão de Cristal";
            nome3 = "Lança de Cristal";
        }
    }
    
}
