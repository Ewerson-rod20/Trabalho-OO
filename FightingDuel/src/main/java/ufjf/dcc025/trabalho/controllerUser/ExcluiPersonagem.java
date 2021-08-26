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
 * @author Bonorino
 */
public class ExcluiPersonagem implements ActionListener{
    int indice;
    Jogador jogador = null;
    
    public ExcluiPersonagem(Jogador jogador, int indice) {
        this.jogador = jogador;
        this.indice = indice;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String nomePersonagemDeletado = jogador.getPersonagens().get(indice).getNome();
        jogador.getPersonagens().remove(indice);
        JOptionPane.showMessageDialog(null, "Personagem '" + nomePersonagemDeletado + "' deletado com sucesso!");
    }
        
}
