package ufjf.dcc025.trabalho.modelCharacter;

/**
 * @authors Daniel and Vitor
 */

public class Mago extends ClassePersonagem{
    // Construtor --------------------------------------------------------------
    public Mago(int ataque1, int ataque2, int ataque3) {
        super(ataque1, ataque2, ataque3);
        nomeClasse = "Mago";
        //Ajeitar valores
        forcaAtk = 5;
        forcaDef = 19;
        vidaBase = 185;
    }
}
