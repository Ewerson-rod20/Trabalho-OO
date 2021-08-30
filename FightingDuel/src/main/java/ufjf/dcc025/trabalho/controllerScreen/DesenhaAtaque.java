/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.trabalho.controllerScreen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import ufjf.dcc025.trabalho.controllerUser.Derrota;
import ufjf.dcc025.trabalho.controllerUser.Vitoria;
import ufjf.dcc025.trabalho.modelCharacter.Oponente;
import ufjf.dcc025.trabalho.modelCharacter.Personagem;

/**
 *
 * @author Bonorino
 */
public class DesenhaAtaque implements ActionListener{
    
    int ataque;
    Personagem personagem;
    Oponente oponente;
    
    public DesenhaAtaque(Personagem personagem, Oponente oponente, int ataque) {
        ataque = pegaAtaque(ataque);
        this.personagem = personagem;
        this.oponente = oponente;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Animacao?
        ataqueJogador();
        if(oponente.getVida() > 0){
            ataqueOponente();
        } else {
            encerraLuta(1);
        }
        
        if(personagem.getVida() <= 0){
            encerraLuta(2);
        }
    }

    private int pegaAtaque(int ataque) {
        switch(ataque){
            case 1:
                return personagem.getClasse().getAtaque1();
            case 2:
                return personagem.getClasse().getAtaque2();
            case 3:
                return personagem.getClasse().getAtaque3();
        }
        return 0;
    } 

    private void ataqueJogador() {
        oponente.setVida((int) (oponente.getVida() - personagem.calculaDano(ataque) + oponente.getClasse().getForcaDef() * 2 * oponente.getNivel()));
    }

    private void ataqueOponente() {
        personagem.setVida((int) (personagem.getVida() - oponente.calculaDano(ataque) + oponente.getClasse().getForcaDef() * 2 * oponente.getNivel()));
    }

    private void encerraLuta(int vencedor) {
//        1 = jogador vencedor
//        2 = oponente vencedor
        if(vencedor == 1){
            personagem.setNivel(personagem.getNivel() + 1);
            personagem.getClasse().setForcaAtk(personagem.getClasse().getForcaAtk() + 3);
            personagem.getClasse().setForcaDef(personagem.getClasse().getForcaDef()+ 4);
            personagem.getClasse().setVidaBase(personagem.getClasse().getVidaBase() + 12);
            JOptionPane.showMessageDialog(null, "Parabéns, você venceu!");
            Vitoria vitoria = new Vitoria();
            vitoria.chama();
        }
        
        if(vencedor == 2){
            Derrota derrota = new Derrota();
            derrota.chama();
        }
    }
}
