/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.trabalho.controllerScreen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import ufjf.dcc025.trabalho.modelUsers.Jogador;
import ufjf.dcc025.trabalho.viewUsers.EditaPersonagem;

/**
 *
 * @author Bonorino
 */
public class DesenhaEditarPersonagem implements ActionListener{

    EditaPersonagem edita;
    Jogador jogador;
    
    public DesenhaEditarPersonagem(Jogador jogador){
        this.edita = new EditaPersonagem(jogador);
        this.jogador = jogador;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        if(jogador.getPersonagens().isEmpty()){
            JOptionPane.showMessageDialog(null, "Não tem nenhum personagem criado!");
        } else {
            edita.chama(jogador);
        }
    }
    
}
