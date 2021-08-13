/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.trabalho.screens;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicOptionPaneUI;
import ufjf.dcc025.trabalho.screenController.DesenhaCadastro;

/**
 *
 * @author danie
 */
public class TelaPrincipal {

    // Construtor --------------------------------------------------------------
    public TelaPrincipal(){ 
    }
    
    // Desenha -----------------------------------------------------------------
    public JPanel desenha(){
        
        JPanel painel = new JPanel();
        
        JLabel jlID = new JLabel("Identificação dos desenvolvedores.");
        
        painel.setLayout(new GridLayout(0, 1));
        
        painel.add(jlID);
        
        return painel;
    }
    
    // Desenha Botões ----------------------------------------------------------
    public JPanel desenhaBotoes(){
        
        JPanel painel = new JPanel();
        
        JButton botaoCadastrar = new JButton("Cadastrar");
        botaoCadastrar.addActionListener(new DesenhaCadastro());
        
        JButton botaoLogar = new JButton("Login");
        
        painel.add(botaoLogar);
        painel.add(botaoCadastrar);
        
        return painel;
    }
    
    // Main --------------------------------------------------------------------
    public static void main(String[] args){
        
        JFrame tela = new JFrame("Tela Principal");
        TelaPrincipal telaPrincipal = new TelaPrincipal();
        
        tela.setSize(1270, 720);
        
        tela.setLayout(new BorderLayout());
        
        tela.add(telaPrincipal.desenhaBotoes(), BorderLayout.CENTER);
        tela.add(telaPrincipal.desenha(), BorderLayout.SOUTH);
        
        tela.setVisible(true);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
