/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.trabalho.controllerScreen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ufjf.dcc025.trabalho.modelUsers.Administrador;
import ufjf.dcc025.trabalho.viewUsers.OponenteGUI;

/**
 *
 * @author Bonorino
 */
public class DesenhaCriaOponentes implements ActionListener{
    OponenteGUI oponenteGUI;
    Administrador adm;
    
    public DesenhaCriaOponentes(Administrador adm){
        this.oponenteGUI = new OponenteGUI();
        this.adm = adm;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        OponenteGUI.chama(adm);
    }
    
}
