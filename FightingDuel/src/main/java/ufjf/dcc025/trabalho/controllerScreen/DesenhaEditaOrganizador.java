/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.trabalho.controllerScreen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
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
    JFrame telaPrincipal;
    JFrame telaOrganizador;
    
    public DesenhaEditaOrganizador(Organizador organizador, JFrame telaOrganizador, JFrame telaPrincipal){
        this.edita = new EditaOrganizador();
        this.organizador = organizador;
        this.telaPrincipal = telaPrincipal;
        this.telaOrganizador = telaOrganizador;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        edita.chama(organizador, this.telaOrganizador, this.telaPrincipal);
    }
}
