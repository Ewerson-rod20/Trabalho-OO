/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.trabalho.controllerUser;

import ufjf.dcc025.trabalho.viewUsers.JogadorGUI;
import ufjf.dcc025.trabalho.modelUsers.Jogador;
import ufjf.dcc025.trabalho.modelGame.Dados;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import ufjf.dcc025.trabalho.modelUsers.Administrador;
import ufjf.dcc025.trabalho.modelUsers.Organizador;

/**
 *
 * @author danie
 */
public class AdicionaJogador implements ActionListener {

    JogadorGUI jogadorGUI;

    public AdicionaJogador(JogadorGUI jogadorGUI) {
        this.jogadorGUI = jogadorGUI;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        int control = 0;

        for (Jogador jogador1 : Dados.jogadores) {
            if (jogadorGUI.getTfNome().getText().equals(jogador1.getNome()) || jogadorGUI.getTfEmail().getText().equals(jogador1.getEmail())) {
                control = 1;
                JOptionPane.showMessageDialog(null, "ERRO! Já existe um jogador com essas informações!\n Email ou nome já cadastrados.");
            }
        }

        for (Administrador administrador1 : Dados.administradores) {
            if (jogadorGUI.getTfNome().getText().equals(administrador1.getNome()) || jogadorGUI.getTfEmail().getText().equals(administrador1.getEmail())){
                control = 1;
                JOptionPane.showMessageDialog(null, "ERRO! Já existe um administrador com essas informações!\n Email ou nome já cadastrados.");
            }
        }

        for (Organizador organizador1 : Dados.organizadores) {
            if (jogadorGUI.getTfNome().getText().equals(organizador1.getNome()) || jogadorGUI.getTfEmail().getText().equals(organizador1.getEmail())) {
                control = 1;
                JOptionPane.showMessageDialog(null, "ERRO! Já existe um organizador com essas informações!\n Email ou nome já cadastrados.");
            }
        }

        if (control == 0) {
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
}
