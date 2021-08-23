/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.trabalho.controllerUser;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import ufjf.dcc025.trabalho.modelUsers.Jogador;

/**
 *
 * @author danie
 */
public class ExibeContaJogador implements ActionListener{
    Jogador jgd;
    
    public ExibeContaJogador(Jogador jgd){
        this.jgd = jgd;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        JOptionPane.showMessageDialog(null, "Nome: " + jgd.getNome() + 
                                            "\nNascimento: " + jgd.getDataNascimento() +
                                            "\nEmail: " + jgd.getEmail());
    }
}
