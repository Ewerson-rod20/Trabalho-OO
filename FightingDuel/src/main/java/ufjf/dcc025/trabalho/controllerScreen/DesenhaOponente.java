/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.trabalho.controllerScreen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ufjf.dcc025.trabalho.modelUsers.Administrador;
import ufjf.dcc025.trabalho.viewScreens.TelaOponente;

/**
 *
 * @author Bonorino
 */
public class DesenhaOponente implements ActionListener{
    TelaOponente tela;
    Administrador adm;
    
    public DesenhaOponente(Administrador adm){
        this.tela = new TelaOponente(adm);
        this.adm = adm;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        tela.chama(adm);
    }
}
