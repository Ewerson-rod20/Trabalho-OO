/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.trabalho.controllerScreen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ufjf.dcc025.trabalho.viewUsers.PersonagemGUI;

/**
 *
 * @author Bonorino
 */
public class DesenhaCriarPersonagem implements ActionListener{
    PersonagemGUI personagemGUI;
    
    public DesenhaCriarPersonagem(){
        this.personagemGUI = new PersonagemGUI();
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        PersonagemGUI.chama();
    }
}
