/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.trabalho.controllerScreen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import ufjf.dcc025.trabalho.viewUsers.JogadorGUI;

/**
 *
 * @author danie
 */
public class DesenhaJogador implements ActionListener{
    
    JogadorGUI tela;
    JFrame tela1;
    
    public DesenhaJogador(JFrame tela1){
        this.tela = new JogadorGUI();
        this.tela1 = tela1;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        tela.chama();
        tela1.dispose();
    }
}
