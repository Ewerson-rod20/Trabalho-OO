/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.trabalho.controllerScreen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author danie
 */
public class Retroceder implements ActionListener{
    
    private JFrame tela;
    
    public Retroceder(JFrame tela){
        this.tela = tela;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        this.tela.dispose();
    }
}
