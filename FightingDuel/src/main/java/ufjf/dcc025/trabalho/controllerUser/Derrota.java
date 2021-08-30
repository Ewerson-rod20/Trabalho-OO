/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.trabalho.controllerUser;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Bonorino
 */
public class Derrota {

    JFrame tela;
    
    public Derrota(JFrame tela) {
        this.tela =tela;
    }
   
    public void chama(){
        JOptionPane.showMessageDialog(null, "Você perdeu! :(");
        tela.dispose();
    }
}
