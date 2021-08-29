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
import ufjf.dcc025.trabalho.controllerUser.ExcluiAdministrador;
import ufjf.dcc025.trabalho.controllerUser.ExcluiJogador;
import ufjf.dcc025.trabalho.controllerUser.ExcluiUsuario;
import ufjf.dcc025.trabalho.controllerUser.ExibeDados;
import ufjf.dcc025.trabalho.controllerUser.ValidaEdicaoAdministrador;
import ufjf.dcc025.trabalho.modelGame.Dados;
import ufjf.dcc025.trabalho.modelUsers.Administrador;
import ufjf.dcc025.trabalho.modelUsers.Jogador;

/**
 *
 * @author danie
 */
public class AdministraUsuarios {
    
    private static Jogador jogador;
    private static JFrame tela;
    private static JComboBox list;
    private JTextField jtText;
    
    public AdministraUsuarios(){
        this.jtText = new JTextField(50);
    }
    
    // Desenha -----------------------------------------------------------------
    public JPanel desenha(){
        JPanel painel = new JPanel();
        JPanel painel1 = new JPanel();
        JPanel painel2 = new JPanel();
        
        JLabel label = new JLabel("Selecione o jogador: ");
        
        painel.setLayout(new GridLayout(0, 1));
        painel1.setLayout(new GridLayout(0, 1));
        painel2.setLayout(new GridLayout(0, 2));
        
        String[] lista = new String[Dados.jogadores.size()];
        int i = 0;
        
        for(Jogador jogador1 : Dados.jogadores){
            lista[i] = jogador1.getNome();
            i++;
        }

        this.list = new JComboBox(lista);
        
        painel1.add(list);
        painel2.add(label);
        painel2.add(jtText);
        painel.add(painel1);
        painel.add(painel2);
        
        return painel;
    }
    
    // Desenha Botões ----------------------------------------------------------
    public JPanel desenhaBotoes(){
        JPanel painel = new JPanel();
        
        JButton botaoDados = new JButton("Dados");
        botaoDados.addActionListener(new ExibeDados(this));
        
        JButton botaoExcluir = new JButton("Excluir Jogador");
        botaoExcluir.addActionListener(new ExcluiUsuario(this));
        
        JButton botaoCancelar = new JButton("Cancelar");
        botaoCancelar.addActionListener(new Retroceder(this.tela));
        
        painel.add(botaoDados);
        painel.add(botaoExcluir);
        painel.add(botaoCancelar);
        
        return painel;
    }
    
    // Chama -------------------------------------------------------------------
    public void chama(){
        
        this.tela = new JFrame("Administrar Jogadores");
        
        AdministraUsuarios adm = new AdministraUsuarios();
        
        tela.setSize(600, 300);
        tela.setLayout(new BorderLayout());
        tela.add(adm.desenha(), BorderLayout.CENTER);
        tela.add(adm.desenhaBotoes(), BorderLayout.SOUTH);
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);
        
        tela.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }
    
    // Getteres ----------------------------------------------------------------
    public JComboBox getList() {
        return list;
    }
    
    public JTextField getJtText() {
        return jtText;
    }
}
