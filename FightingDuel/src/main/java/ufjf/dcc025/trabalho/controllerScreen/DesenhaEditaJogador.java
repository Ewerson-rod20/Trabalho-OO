/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.trabalho.controllerScreen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ufjf.dcc025.trabalho.modelUsers.Jogador;
import ufjf.dcc025.trabalho.viewUsers.EditaJogador;

/**
 *
 * @author danie
 */
public class DesenhaEditaJogador implements ActionListener{
    
    EditaJogador edita;
    Jogador jogador;
    
    public DesenhaEditaJogador(Jogador jogador){
        this.edita = new EditaJogador();
        this.jogador = jogador;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        edita.chama(jogador);
    }
    
}
