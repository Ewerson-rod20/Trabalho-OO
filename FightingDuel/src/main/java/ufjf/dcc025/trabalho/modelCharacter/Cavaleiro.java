package ufjf.dcc025.trabalho.modelCharacter;

/**
 * @authors Daniel and Vitor
 */

public class Cavaleiro extends ClassePersonagem{  
    
    // Construtor --------------------------------------------------------------
    public Cavaleiro(int ataque1, int ataque2, int ataque3) {
        super(ataque1, ataque2, ataque3);
        nomeClasse = "Cavaleiro";
        //Ajeitar valores
        forcaAtk = 30;
        forcaDef = 10;
    }
}
