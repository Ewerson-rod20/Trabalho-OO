/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ufjf.dcc025.trabalho.controllerScreen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import ufjf.dcc025.trabalho.modelCharacter.Oponente;
import ufjf.dcc025.trabalho.modelCharacter.Personagem;
import ufjf.dcc025.trabalho.viewScreens.TelaLuta;
import ufjf.dcc025.trabalho.viewUsers.OponenteGUI;
import ufjf.dcc025.trabalho.viewUsers.PersonagemGUI;
        


/**
 *
 * @author vitor
 */
public class DesenhaTelaLuta implements ActionListener{

    public static ActionListener chama(Personagem personagem, Oponente get) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    Personagem personagem;
    Oponente oponente;
    TelaLuta tela;
    
    public DesenhaTelaLuta (Personagem personagem, Oponente oponente){
        this.personagem = personagem;
        this.oponente = oponente;
        tela = new TelaLuta(personagem, oponente);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        tela.chama(personagem, oponente);
    }
    
}
