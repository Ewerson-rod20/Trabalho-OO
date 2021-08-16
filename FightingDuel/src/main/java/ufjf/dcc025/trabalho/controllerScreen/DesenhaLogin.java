/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.trabalho.controllerScreen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ufjf.dcc025.trabalho.viewScreens.TelaLogin;

/**
 *
 * @author danie
 */
public class DesenhaLogin implements ActionListener{
    TelaLogin tela;
    
    public DesenhaLogin(){
        this.tela = new TelaLogin();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        tela.chama();
    }
    
    
}
