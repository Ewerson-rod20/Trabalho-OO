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
import ufjf.dcc025.trabalho.controllerScreen.DesenhaEditaAdministrador;
import ufjf.dcc025.trabalho.controllerUser.Desconectar;
import ufjf.dcc025.trabalho.controllerUser.ExibeContaAdministrador;
import ufjf.dcc025.trabalho.modelGame.Dados;
import ufjf.dcc025.trabalho.modelUsers.Administrador;

/**
 *
 * @author danie
 */
public class TelaAdministrador {
    
    private static Administrador administrador;
    private static JFrame telaPrincipal;
    private static JFrame tela;
    
    // Construtor --------------------------------------------------------------
    public TelaAdministrador(JFrame telaPrincipal){
        this.telaPrincipal = telaPrincipal;
    }
    
    // Desenha -----------------------------------------------------------------
    public JPanel desenha(){
        JPanel painel = new JPanel();
        
        painel.setLayout(new GridLayout(0, 2));
        
        JButton botaoPersonagem = new JButton("Personagem");
        
        JButton botaoConta = new JButton("Conta");
        botaoConta.addActionListener(new ExibeContaAdministrador(this.administrador));
        
        JButton botaoEditar = new JButton("Editar Dados");
        botaoEditar.addActionListener(new DesenhaEditaAdministrador(this.administrador, this.tela, this.telaPrincipal));
        
        JButton botaoAdministrar = new JButton("Administrar Usuários");
        
        JButton botaoSair = new JButton("Sair");
        botaoSair.addActionListener(new Desconectar(this.tela, this.telaPrincipal));
        
        painel.add(botaoAdministrar);
        painel.add(botaoPersonagem);
        painel.add(botaoConta);
        painel.add(botaoEditar);
        painel.add(botaoSair);
        
        return painel;
    }
    
    // Chama -------------------------------------------------------------------
    public void chama(Administrador administrador){
        
        this.administrador = administrador;
        
        this.tela = new JFrame("Administrador");
        TelaAdministrador telaAdministrador = new TelaAdministrador(this.telaPrincipal);
        
        tela.setSize(600, 300);
        
        tela.setLayout(new BorderLayout());
        
        tela.add(telaAdministrador.desenha(), BorderLayout.CENTER);
        
        tela.setLocationRelativeTo(null);
        
        tela.setVisible(true);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    // Getteres ----------------------------------------------------------------
    public Administrador getAdministrador() {
        return administrador;
    }
    
}
