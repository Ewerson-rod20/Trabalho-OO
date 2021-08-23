/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.trabalho.controllerScreen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ufjf.dcc025.trabalho.modelUsers.Jogador;
import ufjf.dcc025.trabalho.viewScreens.TelaPersonagem;

/**
 *
 * @author danie
 */
public class DesenhaPersonagem implements ActionListener{
    TelaPersonagem tela;
    private Jogador jogador = null;
    
    public DesenhaPersonagem(Jogador jogador){
        this.tela = new TelaPersonagem(jogador);
        this.jogador = jogador;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        tela.chama(jogador);
    }
}