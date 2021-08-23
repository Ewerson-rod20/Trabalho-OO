/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.trabalho.viewScreens;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicOptionPaneUI;
import javax.swing.plaf.basic.BasicSplitPaneUI;
import ufjf.dcc025.trabalho.controllerScreen.DesenhaAdministrador;
import ufjf.dcc025.trabalho.controllerScreen.DesenhaCadastro;
import ufjf.dcc025.trabalho.controllerScreen.DesenhaLogin;

/**
 *
 * @author danie
 */
public class TelaPrincipal {

    private static JFrame tela;
    
    // Construtor --------------------------------------------------------------
    public TelaPrincipal(){
        this.tela = new JFrame("Tela Principal");
    }
    
    // Desenha -----------------------------------------------------------------
    public JPanel desenha(){
        
        JPanel painel = new JPanel();
        JPanel painel1 = new JPanel();
        JPanel painel2 = new JPanel();
        JPanel painel3 = new JPanel();
        
        JLabel jlName = new JLabel("TÍTULO DO JOGO");
        JLabel jlID = new JLabel("Identificação dos desenvolvedores.");
        
        JButton botaoCadastrar = new JButton("Cadastrar");
        botaoCadastrar.addActionListener(new DesenhaCadastro());
        
        JButton botaoLogar = new JButton("Login");
        botaoLogar.addActionListener(new DesenhaLogin(this.tela));
        
        painel.setLayout(new BorderLayout());
        
        painel1.add(jlName);
        //painel1.setMinimumSize(new Dimension(500, 200));
        
        painel2.setLayout(new GridLayout(0, 1));
        painel2.add(botaoLogar);
        painel2.add(botaoCadastrar);
        painel2.setMaximumSize(new Dimension(500, 200));
        
        painel3.add(jlID);
        //painel3.setMinimumSize(new Dimension(300, 200));
        
        painel.setLayout(new GridLayout(0, 1));
        painel.add(painel1);
        painel.add(painel2);
        painel.add(painel3);
        
        return painel;
    }
    
    // Desenha Botões ----------------------------------------------------------
    public JPanel desenhaBotoes(){
        
        JPanel painel = new JPanel();
        
        painel.setLayout(new BorderLayout());
        
        JButton botaoCadastrar = new JButton("Cadastrar");
        botaoCadastrar.addActionListener(new DesenhaCadastro());
        
        JButton botaoLogar = new JButton("Login");
        
        painel.add(botaoLogar, BorderLayout.CENTER);
        painel.add(botaoCadastrar, BorderLayout.SOUTH);
        
        return painel;
    }
    
    // Main --------------------------------------------------------------------
    public void chama(TelaPrincipal telaPrincipal){
        
        tela.setSize(500, 600);
        
        tela.setLayout(new BorderLayout());
        
        //tela.add(telaPrincipal.desenhaBotoes(), BorderLayout.CENTER);
        tela.add(telaPrincipal.desenha(), BorderLayout.CENTER);
        
        tela.setVisible(true);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    // Getteres ----------------------------------------------------------------
    public static JFrame getTela() {
        return tela;
    }   
}
