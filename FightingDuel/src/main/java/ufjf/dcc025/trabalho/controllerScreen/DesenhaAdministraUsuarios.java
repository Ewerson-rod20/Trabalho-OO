/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.trabalho.controllerScreen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ufjf.dcc025.trabalho.viewUsers.AdministraUsuarios;

/**
 *
 * @author danie
 */
public class DesenhaAdministraUsuarios implements ActionListener{
    
    AdministraUsuarios adm;

    public DesenhaAdministraUsuarios() {
        this.adm = new AdministraUsuarios();
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        adm.chama();
    }
    
}
