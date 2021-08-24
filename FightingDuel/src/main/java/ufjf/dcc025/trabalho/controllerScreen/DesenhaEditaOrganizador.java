/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.trabalho.controllerScreen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ufjf.dcc025.trabalho.modelUsers.Jogador;
import ufjf.dcc025.trabalho.modelUsers.Organizador;
import ufjf.dcc025.trabalho.viewUsers.EditaJogador;
import ufjf.dcc025.trabalho.viewUsers.EditaOrganizador;

/**
 *
 * @author danie
 */
public class DesenhaEditaOrganizador implements ActionListener{
    EditaOrganizador edita;
    Organizador organizador;
    
    public DesenhaEditaOrganizador(Organizador organizador){
        this.edita = new EditaOrganizador();
        this.organizador = organizador;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        edita.chama(organizador);
    }
}
