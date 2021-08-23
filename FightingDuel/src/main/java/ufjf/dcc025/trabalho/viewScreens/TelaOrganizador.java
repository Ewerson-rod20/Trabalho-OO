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
import ufjf.dcc025.trabalho.controllerUser.Desconectar;
import ufjf.dcc025.trabalho.controllerUser.ExibeContaOrganizador;
import ufjf.dcc025.trabalho.modelGame.Dados;
import ufjf.dcc025.trabalho.modelUsers.Organizador;

/**
 *
 * @author danie
 */
public class TelaOrganizador {
    
    private static Organizador organizador;
    private static JFrame telaPrincipal;
    private static JFrame tela;
            
    // Construtor --------------------------------------------------------------
    public TelaOrganizador(JFrame telaPrincipal){
        this.telaPrincipal = telaPrincipal;
    }
    
    // Desenha -----------------------------------------------------------------
    public JPanel desenha(){
        JPanel painel = new JPanel();
        
        painel.setLayout(new GridLayout(0, 2));
        
        JButton botaoEventos = new JButton("Eventos");
        
        JButton botaoConta = new JButton("Conta");
        botaoConta.addActionListener(new ExibeContaOrganizador(this.organizador));
        
        JButton botaoEditar = new JButton("Editar Dados");
        
        JButton botaoSair = new JButton("Sair");
        botaoSair.addActionListener(new Desconectar(this.tela, this.telaPrincipal));
        
        painel.add(botaoEventos);
        painel.add(botaoConta);
        painel.add(botaoEditar);
        painel.add(botaoSair);
        
        return painel;
    }
    
    // Chama -------------------------------------------------------------------
    public void chama(Organizador organizador){
        
        this.organizador = organizador;
        
        this.tela = new JFrame("Organizador");
        TelaOrganizador telaOrganizador = new TelaOrganizador(this.telaPrincipal);
        
        tela.setSize(600, 300);
        
        tela.setLayout(new BorderLayout());
        
        tela.add(telaOrganizador.desenha(), BorderLayout.CENTER);
        
        tela.setLocationRelativeTo(null);
        
        tela.setVisible(true);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    // Getteres ----------------------------------------------------------------
    public Organizador getOrganizador() {
        return organizador;
    }
    
}
