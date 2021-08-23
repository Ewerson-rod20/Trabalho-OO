/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.trabalho.controllerUser;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author danie
 */
public class Desconectar implements ActionListener{
    
    private JFrame tela; 
    private JFrame telaPrincipal;
    
    public Desconectar(JFrame tela, JFrame telaPrincipal){
        this.tela = tela;
        this.telaPrincipal = telaPrincipal;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        this.tela.setVisible(false);
        this.telaPrincipal.setVisible(true);
    }
}
