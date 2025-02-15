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
import ufjf.dcc025.trabalho.modelGame.Dados;
import ufjf.dcc025.trabalho.modelUsers.Administrador;
import ufjf.dcc025.trabalho.modelUsers.Jogador;
import ufjf.dcc025.trabalho.modelUsers.Organizador;
import ufjf.dcc025.trabalho.viewScreens.TelaAdministrador;
import ufjf.dcc025.trabalho.viewScreens.TelaJogador;
import ufjf.dcc025.trabalho.viewScreens.TelaLogin;
import ufjf.dcc025.trabalho.viewScreens.TelaOrganizador;

/**
 *
 * @author danie
 */
public class ValidaLogin implements ActionListener{
    TelaLogin telaLogin;
    JFrame telaPrincipal;
    JFrame tela;
    
    public ValidaLogin (TelaLogin telaLogin, JFrame telaPrincipal, JFrame tela){
        this.telaLogin = telaLogin;
        this.telaPrincipal = telaPrincipal;
        this.tela = tela;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        
        int cont = 0;
        
        for (Jogador jogador1 : Dados.jogadores){
            if((telaLogin.getTfNome().getText().equals(jogador1.getNome())) && (telaLogin.getTfSenha().getText().equals(jogador1.getSenha()))){

                TelaJogador tela1 = new TelaJogador(this.telaPrincipal);

                tela1.chama(jogador1);
                tela.dispose();
                telaPrincipal.setVisible(false);
                cont = 1;
            }
        }
        
        for (Administrador administrador1 : Dados.administradores){
            if(telaLogin.getTfNome().getText().equals(administrador1.getNome()) && telaLogin.getTfSenha().getText().equals(administrador1.getSenha())){
                TelaAdministrador tela2 = new TelaAdministrador(this.telaPrincipal);
                tela2.chama(administrador1);
                tela.setVisible(false);
                telaPrincipal.setVisible(false);
                cont = 1;
            }
        }
        
        for (Organizador organizador1 : Dados.organizadores){
            if(telaLogin.getTfNome().getText().equals(organizador1.getNome()) && telaLogin.getTfSenha().getText().equals(organizador1.getSenha())){
                TelaOrganizador tela3 = new TelaOrganizador(this.telaPrincipal);
                tela3.chama(organizador1);
                tela.setVisible(false);
                telaPrincipal.setVisible(false);
                cont = 1;
            }
        }
        
        if(cont == 0){
            JOptionPane.showMessageDialog(null, "ERRO! O usuário não existe.");
        }
    }
}
