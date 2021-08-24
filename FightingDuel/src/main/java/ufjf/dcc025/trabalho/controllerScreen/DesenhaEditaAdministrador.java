/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.trabalho.controllerScreen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ufjf.dcc025.trabalho.modelUsers.Administrador;
import ufjf.dcc025.trabalho.modelUsers.Jogador;
import ufjf.dcc025.trabalho.viewUsers.EditaAdministrador;
import ufjf.dcc025.trabalho.viewUsers.EditaJogador;

/**
 *
 * @author danie
 */
public class DesenhaEditaAdministrador implements ActionListener{
    
    EditaAdministrador edita;
    Administrador administrador;
    
    public DesenhaEditaAdministrador(Administrador administrador){
        this.edita = new EditaAdministrador();
        this.administrador = administrador;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        edita.chama(administrador);
    }
}
