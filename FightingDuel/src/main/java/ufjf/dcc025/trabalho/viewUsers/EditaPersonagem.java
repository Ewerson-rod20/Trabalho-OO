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
import ufjf.dcc025.trabalho.controllerScreen.Retroceder;
import ufjf.dcc025.trabalho.controllerUser.ValidaEdicaoPersonagem;
import ufjf.dcc025.trabalho.modelUsers.Jogador;

/**
 *
 * @author Bonorino
 */
public class EditaPersonagem {
    private static Jogador jogador;
    private static JFrame tela;
    private String[] campos;
    
    private JTextField jtText;
    private JComboBox camposList;
    
    // Construtor --------------------------------------------------------------
    public EditaPersonagem(){
        this.jtText = new JTextField(50);
    }
    
    // Desenha -----------------------------------------------------------------
    public JPanel desenha(){
        JPanel painel = new JPanel();
        JPanel painel1 = new JPanel();
        JPanel painel2 = new JPanel();
        
        JLabel label = new JLabel("Digite o novo nome: ");
        
        painel.setLayout(new GridLayout(0, 1));
        painel1.setLayout(new GridLayout(0, 1));
        painel2.setLayout(new GridLayout(0, 2));
        
        campos = new String[jogador.getPersonagens().size()];
        preencheCampos();
        this.camposList = new JComboBox(campos);
        
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
        botaoConfirmar.addActionListener(new ValidaEdicaoPersonagem(this, this.jogador, tela));
        
        JButton botaoCancelar = new JButton("Cancelar");
        botaoCancelar.addActionListener(new Retroceder(this.tela));
        
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
    
    // Getteres ----------------------------------------------------------------
    public JComboBox getCamposList() {
        return camposList;
    }

    public JTextField getJtText() {
        return jtText;
    }
    
    public void preencheCampos(){
        for(int i = 0; i < jogador.getPersonagens().size(); i++){
            this.campos[i] = jogador.getPersonagem(i).getNome();
        }
    }
}
