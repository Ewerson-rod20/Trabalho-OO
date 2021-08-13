/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.trabalho.userController;

import ufjf.dcc025.trabalho.view.OrganizadorGUI;
import ufjf.dcc025.trabalho.users.Organizador;
import ufjf.dcc025.trabalho.model.Dados;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
/**
 *
 * @author danie
 */
public class AdicionaOrganizador implements ActionListener{
    
    OrganizadorGUI organizadorGUI;
    
    public AdicionaOrganizador(OrganizadorGUI organizadorGUI){
        this.organizadorGUI = organizadorGUI;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {

        Organizador organizador = new Organizador();
        
        organizador.setCpf(organizadorGUI.getTfCpf().getText());
        organizador.setEmail(organizadorGUI.getTfEmail().getText());
        organizador.setDataNascimento(organizadorGUI.getTfDataNascimento().getText());
        organizador.setNome(organizadorGUI.getTfNome().getText());
        organizador.setSenha(organizadorGUI.getTfSenha().getText());
        
        Dados.organizadores.add(organizador);
        
        for (Organizador organizador1 : Dados.organizadores) {
            System.out.println(organizador1);
        }
        

    }
}
