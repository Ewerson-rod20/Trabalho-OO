/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.trabalho.screenController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ufjf.dcc025.trabalho.view.OrganizadorGUI;

/**
 *
 * @author danie
 */
public class DesenhaOrganizador implements ActionListener{
    OrganizadorGUI tela;
    
    public DesenhaOrganizador(){
        tela = new OrganizadorGUI();
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        tela.chama();
    }
}
