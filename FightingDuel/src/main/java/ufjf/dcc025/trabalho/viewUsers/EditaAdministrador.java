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
import ufjf.dcc025.trabalho.controllerUser.ValidaEdicaoAdministrador;
import ufjf.dcc025.trabalho.modelUsers.Administrador;
import ufjf.dcc025.trabalho.modelUsers.Jogador;

/**
 *
 * @author danie
 */
public class EditaAdministrador {
    private static Administrador administrador;
    private static JFrame telaPrincipal;
    private static JFrame telaAdministrador;
    private static JFrame tela;
    private JComboBox camposList;
    
    private JTextField jtText;
    
    // Construtor --------------------------------------------------------------
    public EditaAdministrador(){
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
        
        String[] campos = {"Nome", "Email", "Senha"};
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
        botaoConfirmar.addActionListener(new ValidaEdicaoAdministrador(this, this.administrador, tela));
        
        JButton botaoExcluir = new JButton("Excluir conta");
        botaoExcluir.addActionListener(new ExcluiAdministrador(this.administrador, this.tela, this.telaAdministrador, this.telaPrincipal));
        
        JButton botaoCancelar = new JButton("Cancelar");
        botaoCancelar.addActionListener(new Retroceder(this.tela));
        
        painel.add(botaoConfirmar);
        painel.add(botaoExcluir);
        painel.add(botaoCancelar);
        
        return painel;
    }
    
    // Chama -------------------------------------------------------------------
    public void chama(Administrador administrador, JFrame telaAdministrador, JFrame telaPrincipal){
        
        this.administrador = administrador;
        this.telaPrincipal = telaPrincipal;
        this.telaAdministrador = telaAdministrador;
        
        this.tela = new JFrame("Editar Dados");
        
        EditaAdministrador edita = new EditaAdministrador();
        
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
}
