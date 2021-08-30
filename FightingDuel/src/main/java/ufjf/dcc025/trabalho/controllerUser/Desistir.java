/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.trabalho.controllerUser;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_OPTION;

/**
 *
 * @author Bonorino
 */
public class Desistir implements ActionListener{

    JFrame tela;
    
    public Desistir(JFrame tela) {
        this.tela = tela;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //sim = 0, nao = 1
        int escolha = JOptionPane.showConfirmDialog(null, "Deseja realmente desistir?", "Desistir", YES_NO_OPTION);
        if(escolha == 0){
            Derrota derrota = new Derrota(this.tela);
            derrota.chama();
        }
    }
}
