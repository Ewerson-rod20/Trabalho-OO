/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.trabalho.userController;

import ufjf.dcc025.trabalho.view.JogadorGUI;
import ufjf.dcc025.trabalho.users.Jogador;
import ufjf.dcc025.trabalho.model.Dados;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
/**
 *
 * @author danie
 */
public class AdicionaJogador implements ActionListener{
    
    JogadorGUI jogadorGUI;
    
    public AdicionaJogador(JogadorGUI jogadorGUI){
        this.jogadorGUI = jogadorGUI;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {

        Jogador jogador = new Jogador();
        
        jogador.setEmail(jogadorGUI.getTfEmail().getText());
        jogador.setDataNascimento(jogadorGUI.getTfDataNascimento().getText());
        jogador.setNome(jogadorGUI.getTfNome().getText());
        jogador.setSenha(jogadorGUI.getTfSenha().getText());
        
        Dados.jogadores.add(jogador);
        
        for (Jogador jogador1 : Dados.jogadores) {
            System.out.println(jogador1);
        }
    }
}
