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
import javax.swing.JPanel;
import ufjf.dcc025.trabalho.controllerScreen.DesenhaPersonagem;
import ufjf.dcc025.trabalho.controllerUser.Desconectar;
import ufjf.dcc025.trabalho.controllerUser.ExibeContaJogador;
import ufjf.dcc025.trabalho.modelUsers.Jogador;

/**
 *
 * @author danie
 */
public class TelaJogador {
    
    private Jogador jogador = null;
    private JFrame tela;
    
    // Construtor --------------------------------------------------------------
    public TelaJogador(Jogador jogador){
        this.jogador = jogador;
    }
    
    // Desenha -----------------------------------------------------------------
    public JPanel desenha(){
        JPanel painel = new JPanel();
        
        painel.setLayout(new GridLayout(0, 2));
        
        JButton botaoJogar = new JButton("Jogar");
        
        JButton botaoEventos = new JButton("Personagem");
        System.out.println(jogador);
        botaoEventos.addActionListener(new DesenhaPersonagem(this.jogador));
        
        JButton botaoConta = new JButton("Conta");
        botaoConta.addActionListener(new ExibeContaJogador(this.jogador));
        
        JButton botaoEditar = new JButton("Editar Dados");
        
        JButton botaoSair = new JButton("Sair");
        botaoSair.addActionListener(new Desconectar(this.tela));
        
        painel.add(botaoJogar);
        painel.add(botaoEventos);
        painel.add(botaoConta);
        painel.add(botaoEditar);
        painel.add(botaoSair);
        
        return painel;
    }
    
    // Chama -------------------------------------------------------------------
    public void chama(Jogador jogador){
        
        this.jogador = jogador;
        
        this.tela = new JFrame("Jogador");
        TelaJogador telaJogador = new TelaJogador(jogador);
        
        tela.setSize(600, 300);
        
        tela.setLayout(new BorderLayout());
        
        tela.add(telaJogador.desenha(), BorderLayout.CENTER);
        
        tela.setVisible(true);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    // Getteres ----------------------------------------------------------------
    public Jogador getJogador() {
        return jogador;
    }
    
}
