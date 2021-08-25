package ufjf.dcc025.trabalho.modelCharacter;

/**
 * @authors Daniel and Vitor
 */

public class Cavaleiro extends ClassePersonagem{

    // Atributos ---------------------------------------------------------------
    float vidaMax;  // Vida máxima que um Personagem da classe Cavaleiro pode ter
    float forcaAtk; // Força de ataque de um Personagem da classe Cavaleiro
    float forcaDef; // Força de defesa de um Personagem da classe Cavaleiro    
    
    // Construtor --------------------------------------------------------------
    public Cavaleiro(int ataque1, int ataque2, int ataque3) {
        super(ataque1, ataque2, ataque3);
        nomeClasse = "Mago";
    }
    
    // Getteres ----------------------------------------------------------------
    public float getVidaMax(){
        return vidaMax;
    }
    
    public float getForcaAtk(){
        return forcaAtk;
    }
    
    public float getForcaDef(){
        return forcaDef;
    }
    
    // Setteres ----------------------------------------------------------------
    public void setVidaMax(float vida){
        this.vidaMax = vida;
    }
    
    public void setForcaAtk(float ataque){
        this.forcaAtk = ataque;
    }
    
    public void setForcaDef(float defesa){
        this.forcaDef = defesa;
    }  
}
