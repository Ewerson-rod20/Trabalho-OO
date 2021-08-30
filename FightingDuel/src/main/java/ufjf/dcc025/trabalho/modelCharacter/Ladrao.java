package ufjf.dcc025.trabalho.modelCharacter;

/**
 * @authors Daniel and Vitor
 */

public class Ladrao extends ClassePersonagem{
    // Construtor --------------------------------------------------------------
    public Ladrao(int ataque1, int ataque2, int ataque3) {
        super(ataque1, ataque2, ataque3);
        nomeClasse = "Ladrão";
        //Ajeitar valores
        forcaAtk = 6;
        forcaDef = 17;
        vidaBase = 150;
    }
}
