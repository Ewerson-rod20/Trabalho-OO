/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.trabalho.controllerScreen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ufjf.dcc025.trabalho.modelUsers.Organizador;
import ufjf.dcc025.trabalho.viewScreens.TelaValidaOponentes;

/**
 *
 * @author Bonorino
 */
public class DesenhaValidaOponentes implements ActionListener{
    Organizador organizador;
    TelaValidaOponentes valida;

    public DesenhaValidaOponentes(Organizador organizador) {
        this.organizador = organizador;
        valida = new TelaValidaOponentes(organizador);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        valida.chama(this.organizador);
    }
}
