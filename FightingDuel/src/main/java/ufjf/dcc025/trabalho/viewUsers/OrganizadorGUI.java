/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.trabalho.viewUsers;

import javax.swing.JTextField;

import ufjf.dcc025.trabalho.controllerUser.AdicionaOrganizador;
import ufjf.dcc025.trabalho.controllerUser.CancelaOrganizador;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import ufjf.dcc025.trabalho.controllerScreen.Retroceder;
/**
 *
 * @author danie
 */
public class OrganizadorGUI {
    
    private static JFrame tela;
    
    private JTextField tfNome;
    private JTextField tfCpf;
    private JTextField tfDataNascimento;
    private JTextField tfEmail;
    private JTextField tfSenha;
    
    // Construtor --------------------------------------------------------------
    public OrganizadorGUI(){
        this.tfNome = new JTextField(50);
        this.tfCpf = new JTextField(11);
        this.tfDataNascimento = new JTextField(50);
        this.tfEmail = new JTextField(50);
        this.tfSenha = new JTextField(50);
    }
    
    // Desenha campos ----------------------------------------------------------
    public JPanel desenha(){
        JPanel painel = new JPanel();
        
        JLabel jlNome = new JLabel("Nome: ");
        JLabel jlCpf = new JLabel("CPF/CNPJ: ");
        JLabel jlDataNascimento = new JLabel("Data de Nascimento (dd/mm/aa): ");
        JLabel jlEmail = new JLabel("Email: ");
        JLabel jlTelefone = new JLabel("Senha: ");
        
        painel.setLayout(new GridLayout(0, 2));
        
        painel.add(jlNome);
        painel.add(tfNome);
        
        painel.add(jlCpf);
        painel.add(tfCpf);
        
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
        botaoCadastrar.addActionListener(new AdicionaOrganizador(this));

        JButton botaoCancelar = new JButton("Cancelar");
        botaoCancelar.addActionListener(new Retroceder(this.tela));

        painel.add(botaoCadastrar);

        painel.add(botaoCancelar);

        return painel;

    }
    
    // Main --------------------------------------------------------------------
    public void chama() {

        this.tela = new JFrame("Cadastra Organizador");
        OrganizadorGUI organizadorGUI = new OrganizadorGUI();
        
        tela.setSize(600, 300);

        tela.setLayout(new BorderLayout());

        tela.add(organizadorGUI.desenha(), BorderLayout.CENTER);

        tela.add(organizadorGUI.desenhaBotoes(), BorderLayout.SOUTH);

        tela.setVisible(true);
        tela.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

    }

    // Getteres ----------------------------------------------------------------
    public JTextField getTfNome() {
        return tfNome;
    }

    public JTextField getTfCpf() {
        return tfCpf;
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
