/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.trabalho.controllerScreen;

import ufjf.dcc025.trabalho.viewScreens.TelaCadastro;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



/**
 *
 * @author danie
 */
public class DesenhaCadastro implements ActionListener{
    TelaCadastro tela;
    
    public DesenhaCadastro(){
        this.tela = new TelaCadastro();
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        tela.chama();
    }
}
