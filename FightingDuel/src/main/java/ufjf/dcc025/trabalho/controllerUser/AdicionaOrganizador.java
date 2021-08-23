/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.trabalho.controllerUser;

import ufjf.dcc025.trabalho.viewUsers.OrganizadorGUI;
import ufjf.dcc025.trabalho.modelUsers.Organizador;
import ufjf.dcc025.trabalho.modelGame.Dados;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import ufjf.dcc025.trabalho.modelUsers.Administrador;
import ufjf.dcc025.trabalho.modelUsers.Jogador;

/**
 *
 * @author danie
 */
public class AdicionaOrganizador implements ActionListener {

    OrganizadorGUI organizadorGUI;
    JFrame tela;

    public AdicionaOrganizador(OrganizadorGUI organizadorGUI, JFrame tela) {
        this.organizadorGUI = organizadorGUI;
        this.tela = tela;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        int control = 0;

        for (Jogador jogador1 : Dados.jogadores) {
            if (organizadorGUI.getTfNome().getText().equals(jogador1.getNome()) || organizadorGUI.getTfEmail().getText().equals(jogador1.getEmail())) {
                control = 1;
                JOptionPane.showMessageDialog(null, "ERRO! Já existe um jogador com essas informações!\n Email ou nome já cadastrados.");
            }
        }

        for (Administrador administrador1 : Dados.administradores) {
            if (organizadorGUI.getTfNome().getText().equals(administrador1.getNome()) || organizadorGUI.getTfEmail().getText().equals(administrador1.getEmail()) || organizadorGUI.getTfCpf().getText().equals(administrador1.getCpf())) {
                control = 1;
                JOptionPane.showMessageDialog(null, "ERRO! Já existe um administrador com essas informações!\n Email, cpf ou nome já cadastrados.");
            }
        }

        for (Organizador organizador1 : Dados.organizadores) {
            if (organizadorGUI.getTfNome().getText().equals(organizador1.getNome()) || organizadorGUI.getTfEmail().getText().equals(organizador1.getEmail()) || organizadorGUI.getTfCpf().getText().equals(organizador1.getCpf())) {
                control = 1;
                JOptionPane.showMessageDialog(null, "ERRO! Já existe um organizador com essas informações!\n Email, cpf ou nome já cadastrados.");
            }
        }

        if (control == 0) {
            Organizador organizador = new Organizador();

            organizador.setCpf(organizadorGUI.getTfCpf().getText());
            organizador.setEmail(organizadorGUI.getTfEmail().getText());
            organizador.setDataNascimento(organizadorGUI.getTfDataNascimento().getText());
            organizador.setNome(organizadorGUI.getTfNome().getText());
            organizador.setSenha(organizadorGUI.getTfSenha().getText());

            Dados.organizadores.add(organizador);

            tela.dispose();
            JOptionPane.showMessageDialog(null, "Cadastro realizado.");
            
            for (Organizador organizador1 : Dados.organizadores) {
                System.out.println(organizador1);
            }
        }
    }
}
