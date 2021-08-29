/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.trabalho.controllerUser;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import ufjf.dcc025.trabalho.modelCharacter.Oponente;
import ufjf.dcc025.trabalho.modelGame.Dados;
import ufjf.dcc025.trabalho.viewScreens.TelaValidaOponentes;

/**
 *
 * @author Bonorino
 */
public class OponenteValido implements ActionListener{
    TelaValidaOponentes tela;
    boolean valido;
    
    public OponenteValido(TelaValidaOponentes tela ,boolean valido) {
        this.valido = valido;
        this.tela = tela;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Oponente oponente = Dados.oponentes.get(tela.getOponentesList().getSelectedIndex());
        
        oponente.setJogavel(valido);
        
        if(valido){
            JOptionPane.showMessageDialog(null, "Oponente agora é valido!");
        } else {
            JOptionPane.showMessageDialog(null, "Oponente agora é inválido!");
        }
    }
    
}
