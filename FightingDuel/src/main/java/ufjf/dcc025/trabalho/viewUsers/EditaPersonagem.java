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
import javax.swing.JList;
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
        
        EditaPersonagem edita = new EditaPersonagem();
        
        tela.setSize(600, 300);
        tela.setLayout(new BorderLayout());
        tela.add(edita.desenha(), BorderLayout.CENTER);
        tela.add(edita.desenhaBotoes(), BorderLayout.SOUTH);
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);
        
        tela.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }
}
