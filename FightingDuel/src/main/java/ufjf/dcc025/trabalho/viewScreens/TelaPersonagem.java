/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.trabalho.viewScreens;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import ufjf.dcc025.trabalho.controllerScreen.DesenhaCriarPersonagem;

/**
 *
 * @author Bonorino
 */
public class TelaPersonagem {
    // Construtor --------------------------------------------------------------
    public TelaPersonagem(){
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
        painel.setLayout(new GridLayout(2, 1));
        JPanel painel1 = new JPanel();
        painel1.setLayout(new GridLayout(2, 1));
        JPanel painel2 = new JPanel();
        painel2.setLayout(new FlowLayout());
        
        JLabel nomeJogador = new JLabel("Olá, " + "NomeJogador");
        
        JTable boxPersonagens = new JTable(3, 1);
        
        JButton criarPersonagem = new JButton("Criar");
        criarPersonagem.addActionListener(new DesenhaCriarPersonagem());
        
        JButton editarPersonagem = new JButton("Editar");
//        editarPersonagem.addActionListener(EditarPersonagem());
        
        JButton excluirPersonagem = new JButton("Excluir");
//        excluirPersonagem.addActionListener(ExcluirPersonagem());
        
        painel1.add(nomeJogador);
        painel1.add(boxPersonagens);
        painel2.add(criarPersonagem);
        painel2.add(editarPersonagem);
        painel2.add(excluirPersonagem);
        
        painel.add(painel1, BorderLayout.CENTER);
        painel.add(painel2, BorderLayout.CENTER);
        
        return painel;
    }
    
    // Chama --------------------------------------------------------------------
    public static JFrame chama(){
        
        JFrame tela = new JFrame("Personagens");
        TelaPersonagem telaPersonagem = new TelaPersonagem();
        
        tela.setSize(800, 500);
        
        tela.setLayout(new BorderLayout());
        
        tela.add(telaPersonagem.desenhaBotoes(), BorderLayout.CENTER);
        tela.add(telaPersonagem.desenha(), BorderLayout.SOUTH);
        
        tela.setVisible(true);
        tela.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        
        return tela;
    }
    
    // Fecha -------------------------------------------------------------------
    public void fecha(JFrame tela){
        tela.setVisible(false);
    }
}
