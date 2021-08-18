/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.trabalho.controllerUser;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import ufjf.dcc025.trabalho.viewScreens.TelaLogin;

/**
 *
 * @author danie
 */
public class CancelaLogin implements ActionListener{
    TelaLogin telaLogin;
    
    public CancelaLogin (TelaLogin telaLogin){
        this.telaLogin = telaLogin;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        JOptionPane.showMessageDialog(null, "Login cancelado!");
        telaLogin.chama().setVisible(false);
    }
}
