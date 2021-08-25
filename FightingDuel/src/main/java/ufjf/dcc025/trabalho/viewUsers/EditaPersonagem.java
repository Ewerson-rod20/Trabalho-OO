/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.trabalho.viewUsers;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import ufjf.dcc025.trabalho.modelUsers.Jogador;

/**
 *
 * @author Bonorino
 */
public class EditaPersonagem {
    private static Jogador jogador;
    private static JFrame tela;
    
    private JTextField jtText;
    
    // Construtor --------------------------------------------------------------
    public EditaPersonagem(){
        this.jtText = new JTextField(50);
    }
    
    // Desenha -----------------------------------------------------------------
    public JPanel desenha(){
        JPanel painel = new JPanel();
        JPanel painel1 = new JPanel();
        JPanel painel2 = new JPanel();
        
        JLabel label = new JLabel("Digite sua alteração: ");
        
        painel.setLayout(new GridLayout(0, 1));
        painel1.setLayout(new GridLayout(0, 1));
        painel2.setLayout(new GridLayout(0, 2));
        
        String[] campos = {"Personagem", "Campo"};
        JComboBox camposList = new JComboBox(campos);
        
        painel1.add(camposList);
        painel2.add(label);
        painel2.add(jtText);
        painel.add(painel1);
        painel.add(painel2);
        
        return painel;
    }
    
    // Desenha Botões ----------------------------------------------------------
    public JPanel desenhaBotoes(){
        JPanel painel = new JPanel();
        
        JButton botaoConfirmar = new JButton("Confirmar");
        
        JButton botaoCancelar = new JButton("Cancelar");
        
        painel.add(botaoConfirmar);
        painel.add(botaoCancelar);
        
        return painel;
    }
    
    // Chama -------------------------------------------------------------------
    public void chama(Jogador jogador){
        
        this.jogador = jogador;
        
        this.tela = new JFrame("Editar Personagem");
        
        EditaJogador edita = new EditaJogador();
        
        tela.setSize(600, 300);
        tela.setLayout(new BorderLayout());
        tela.add(edita.desenha(), BorderLayout.CENTER);
        tela.add(edita.desenhaBotoes(), BorderLayout.SOUTH);
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);
        
        tela.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }
}
