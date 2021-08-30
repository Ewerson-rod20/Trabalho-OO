package ufjf.dcc025.trabalho.controllerScreen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ufjf.dcc025.trabalho.modelCharacter.Oponente;
import ufjf.dcc025.trabalho.modelCharacter.Personagem;
import ufjf.dcc025.trabalho.viewScreens.TelaLuta;

       
/**
 * @author vitor
 */

public class DesenhaTelaLuta implements ActionListener{
    
    Personagem personagem;
    Oponente oponente;
    TelaLuta tela;
    
    public DesenhaTelaLuta (Personagem personagem, Oponente oponente){
        this.personagem = personagem;
        this.oponente = oponente;
        tela = new TelaLuta();
    }
        
    @Override
    public void actionPerformed(ActionEvent ae) {
        tela.chama(this.personagem, this.oponente);
    }   
}

