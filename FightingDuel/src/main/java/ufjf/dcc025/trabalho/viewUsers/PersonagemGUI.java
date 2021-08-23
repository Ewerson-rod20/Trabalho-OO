/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.trabalho.viewUsers;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import ufjf.dcc025.trabalho.controllerUser.AdicionaPersonagem;
import ufjf.dcc025.trabalho.controllerUser.CancelaPersonagem;

/**
 *
 * @author danie
 */
public class PersonagemGUI{
    private final JTextField tfNome;
    private final JList tfClasse;
    private final String classesDisponiveis[] = {"Cavaleiro", "Ladrao", "Mago"};
    
    // Construtor --------------------------------------------------------------
    public PersonagemGUI(){
        this.tfNome = new JTextField(50);
        this.tfClasse = new JList(classesDisponiveis);
        this.tfClasse.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
    
    // Desenha campos ----------------------------------------------------------
    public JPanel desenha(){
        JPanel painel = new JPanel();
        
        JLabel jlNome = new JLabel("Nome: ");
                
        JLabel jlClasse = new JLabel("Classe: ");
        
        painel.setLayout(new GridLayout(0, 2));
        
        painel.add(jlNome);
        painel.add(tfNome);
        
        painel.add(jlClasse);
        painel.add(tfClasse);
        
        return painel;
    }
    
    // Desenha botões ----------------------------------------------------------
    public JPanel desenhaBotoes() {

        JPanel painel = new JPanel();

        JButton botaoFinalizar = new JButton("Finalizar");
        botaoFinalizar.addActionListener(new AdicionaPersonagem(this));
        
        JButton botaoCancelar = new JButton("Cancelar");
        botaoCancelar.addActionListener(new CancelaPersonagem());

        painel.add(botaoFinalizar);

        painel.add(botaoCancelar);

        return painel;

    }
    
    // Main --------------------------------------------------------------------
    public static void chama() {

        JFrame tela = new JFrame("Criação de Personagem");
        PersonagemGUI personagemGUI = new PersonagemGUI();
        
        tela.setSize(600, 300);

        tela.setLayout(new BorderLayout());

        tela.add(personagemGUI.desenha(), BorderLayout.CENTER);

        tela.add(personagemGUI.desenhaBotoes(), BorderLayout.SOUTH);

        tela.setVisible(true);
        tela.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

    }

    // Getteres ----------------------------------------------------------------

    public JTextField getTfNome() {
        return tfNome;
    }

    public JList getTfClasse() {
        return tfClasse;
    }
    
}
