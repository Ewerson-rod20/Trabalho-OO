/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.trabalho.viewScreens;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import ufjf.dcc025.trabalho.controllerUser.ValidaLogin;

/**
 *
 * @author danie
 */
public class TelaLogin {
    
    private JTextField tfNome;
    private JTextField tfSenha;
        
    // Construtor --------------------------------------------------------------
    public TelaLogin(){
        this.tfNome = new JTextField(50);
        this.tfSenha = new JTextField(50);
    }
    
    // Desenha -----------------------------------------------------------------
    public JPanel desenha(){
        
        JPanel painel = new JPanel();
        
        JLabel jlNome = new JLabel("Nome: ");
        JLabel jlSenha = new JLabel("Senha: ");
        
        painel.setLayout(new GridLayout(0, 2));
        
        painel.add(jlNome);
        painel.add(tfNome);
        
        painel.add(jlSenha);
        painel.add(tfSenha);
        
        return painel;
    }
    
    // Desenha botões ----------------------------------------------------------
    public JPanel desenhaBotoes(){
        
        JPanel painel = new JPanel();
        
        JButton botaoLogar = new JButton("Entrar");
        botaoLogar.addActionListener(new ValidaLogin(this));
        
        JButton botaoCancelar = new JButton("Cancelar");
        
        painel.add(botaoLogar);
        painel.add(botaoCancelar);
        
        return painel;
    }
    
    // Chama -------------------------------------------------------------------
    public void chama(){
        
        JFrame tela = new JFrame("Tela Login");
        TelaLogin telaLogin = new TelaLogin();
        
        tela.setSize(600, 300);
        
        tela.setLayout(new BorderLayout());
        
        tela.add(telaLogin.desenha(), BorderLayout.CENTER);
        tela.add(telaLogin.desenhaBotoes(), BorderLayout.SOUTH);
        
        tela.setVisible(true);
        tela.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }
    
    // Getteres ----------------------------------------------------------------

    public JTextField getTfNome() {
        return tfNome;
    }

    public JTextField getTfSenha() {
        return tfSenha;
    }
    
}
