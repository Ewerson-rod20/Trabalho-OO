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
import ufjf.dcc025.trabalho.controllerScreen.DesenhaPersonagem;
import ufjf.dcc025.trabalho.controllerUser.AdicionaPersonagem;

/**
 *
 * @author Bonorino
 */
public class TelaCriarPersonagem {
    // Construtor --------------------------------------------------------------
    public TelaCriarPersonagem(){
    }
    
    // Desenha -----------------------------------------------------------------
    public static JPanel desenha(){
        JPanel painel = new JPanel();
        
        JLabel jlID = new JLabel("Identificação dos desenvolvedores.");
        
        painel.setLayout(new GridLayout(0, 1));
        
        painel.add(jlID);
        
        return painel;
    }
    
    // Desenha Botões ----------------------------------------------------------
    public static JPanel desenhaBotoes(){
        
        JPanel painel = new JPanel();
        
        JButton criarPersonagem = new JButton("Finalizar");
//        criarPersonagem.addActionListener(Finalizar);
        
        
        return painel;
    }
    
    // Chama --------------------------------------------------------------------
    public static JFrame chama(){
        
        JFrame tela = new JFrame("Criar Personagem");
        TelaCriarPersonagem telaCriarPersonagem = new TelaCriarPersonagem();
        
        tela.setSize(600, 300);
        
        tela.setLayout(new BorderLayout());
        
        tela.add(TelaCriarPersonagem.desenhaBotoes(), BorderLayout.CENTER);
        tela.add(TelaCriarPersonagem.desenha(), BorderLayout.SOUTH);
        
        tela.setVisible(true);
        tela.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        
        return tela;
    }
    
    // Fecha -------------------------------------------------------------------
    public void fecha(JFrame tela){
        tela.setVisible(false);
    }
}
