/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.trabalho.controllerUser;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import ufjf.dcc025.trabalho.modelGame.Dados;
import ufjf.dcc025.trabalho.modelUsers.Jogador;
import ufjf.dcc025.trabalho.viewUsers.AdministraUsuarios;

/**
 *
 * @author danie
 */
public class ExibeDados implements ActionListener {

    AdministraUsuarios adm;

    public ExibeDados(AdministraUsuarios adm) {

        this.adm = adm;
    }

    @Override
    public void actionPerformed(ActionEvent ae){
        
        int  control = adm.getList().getSelectedIndex();
        
        for(Jogador jogador1 : Dados.jogadores){
            if(jogador1.getNome().equals(Dados.jogadores.get(control).getNome())){
                
                JOptionPane.showMessageDialog(null, "Nome: " + jogador1.getNome() + 
                                            "\nNascimento: " + jogador1.getDataNascimento() +
                                            "\nEmail: " + jogador1.getEmail() + 
                                            "\nSenha: " + jogador1.getSenha());
                
                break;
            }
        }
    }

}
