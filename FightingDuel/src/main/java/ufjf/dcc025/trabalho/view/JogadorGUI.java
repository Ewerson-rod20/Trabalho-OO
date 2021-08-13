/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.trabalho.view;

import ufjf.dcc025.trabalho.userController.AdicionaJogador;
import ufjf.dcc025.trabalho.userController.CancelaJogador;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author danie
 */
public class JogadorGUI {
    
    private JTextField tfNome;
    private JTextField tfDataNascimento;
    private JTextField tfEmail;
    private JTextField tfSenha;
    
    // Construtor --------------------------------------------------------------
    public JogadorGUI(){
        this.tfNome = new JTextField(50);
        this.tfDataNascimento = new JTextField(50);
        this.tfEmail = new JTextField(50);
        this.tfSenha = new JTextField(50);
    }
    
    // Desenha campos ----------------------------------------------------------
    public JPanel desenha(){
        JPanel painel = new JPanel();
        
        JLabel jlNome = new JLabel("Nome: ");
        JLabel jlDataNascimento = new JLabel("Data de Nascimento (dd/mm/aa): ");
        JLabel jlEmail = new JLabel("Email: ");
        JLabel jlTelefone = new JLabel("Senha: ");
        
        painel.setLayout(new GridLayout(0, 2));
        
        painel.add(jlNome);
        painel.add(tfNome);
        
        painel.add(jlDataNascimento);
        painel.add(tfDataNascimento);
        
        painel.add(jlEmail);
        painel.add(tfEmail);
        
        painel.add(jlTelefone);
        painel.add(tfSenha);
        
        return painel;
    }
    
    // Desenha botões ----------------------------------------------------------
    public JPanel desenhaBotoes() {

        JPanel painel = new JPanel();

        JButton botaoCadastrar = new JButton("Cadastrar");
        botaoCadastrar.addActionListener(new AdicionaJogador(this));

        JButton botaoCancelar = new JButton("Cancelar");
        botaoCancelar.addActionListener(new CancelaJogador());

        painel.add(botaoCadastrar);

        painel.add(botaoCancelar);

        return painel;

    }
    
    // Main --------------------------------------------------------------------
    public static void chama() {

        JFrame tela = new JFrame("Cadastra Jogador");
        AdministradorGUI administradorGUI = new AdministradorGUI();
        
        tela.setSize(600, 300);

        tela.setLayout(new BorderLayout());

        tela.add(administradorGUI.desenha(), BorderLayout.CENTER);

        tela.add(administradorGUI.desenhaBotoes(), BorderLayout.SOUTH);

        tela.setVisible(true);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    // Getteres ----------------------------------------------------------------
    public JTextField getTfNome() {
        return tfNome;
    }

    public JTextField getTfDataNascimento() {
        return tfDataNascimento;
    }

    public JTextField getTfEmail() {
        return tfEmail;
    }

    public JTextField getTfSenha() {
        return tfSenha;
    }
}
