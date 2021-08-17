/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.trabalho.controllerScreen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import ufjf.dcc025.trabalho.viewScreens.TelaCadastro;
import ufjf.dcc025.trabalho.viewUsers.AdministradorGUI;

/**
 *
 * @author danie
 */
public class DesenhaAdministrador implements ActionListener{
    
    AdministradorGUI tela;
    
    public DesenhaAdministrador(){
        this.tela = new AdministradorGUI();
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        tela.chama();
    }
}
