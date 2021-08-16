/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.trabalho.controllerUser;

import ufjf.dcc025.trabalho.viewUsers.AdministradorGUI;
import ufjf.dcc025.trabalho.modelUsers.Administrador;
import ufjf.dcc025.trabalho.modelGame.Dados;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
/**
 *
 * @author danie
 */
public class AdicionaAdministrador implements ActionListener{
    
    AdministradorGUI administradorGUI;
    
    public AdicionaAdministrador(AdministradorGUI administradorGUI){
        this.administradorGUI = administradorGUI;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {

        Administrador administrador = new Administrador();
        
        administrador.setCpf(administradorGUI.getTfCpf().getText());
        administrador.setEmail(administradorGUI.getTfEmail().getText());
        administrador.setDataNascimento(administradorGUI.getTfDataNascimento().getText());
        administrador.setNome(administradorGUI.getTfNome().getText());
        administrador.setSenha(administradorGUI.getTfSenha().getText());
        
        Dados.administradores.add(administrador);
        
        for (Administrador administrador1 : Dados.administradores) {
            System.out.println(administrador1);
        }
        

    }
}
