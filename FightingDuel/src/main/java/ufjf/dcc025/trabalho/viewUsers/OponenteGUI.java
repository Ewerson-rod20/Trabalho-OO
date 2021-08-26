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
import ufjf.dcc025.trabalho.controllerScreen.DesenhaOponente;
import ufjf.dcc025.trabalho.controllerScreen.Retroceder;
import ufjf.dcc025.trabalho.controllerUser.AdicionaOponente;
import ufjf.dcc025.trabalho.controllerUser.CancelaPersonagem;
import ufjf.dcc025.trabalho.modelUsers.Administrador;

/**
 *
 * @author Bonorino
 */
public class OponenteGUI {
    private final JTextField tfNome;
    private final JList tfClasse;
    private final String classesDisponiveis[] = {"Cavaleiro", "Ladrao", "Mago"};
    private static JFrame tela;
    
    // Construtor --------------------------------------------------------------
    public OponenteGUI(){
        this.tfNome = new JTextField(50);
        this.tfClasse = new JList(classesDisponiveis);
        this.tfClasse.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tela = new JFrame("Criação de Oponentes");
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
    public JPanel desenhaBotoes(Administrador adm) {

        JPanel painel = new JPanel();

        JButton botaoFinalizar = new JButton("Finalizar");
        botaoFinalizar.addActionListener(new AdicionaOponente(this));
        botaoFinalizar.addActionListener(new Retroceder(this.tela)); 
        botaoFinalizar.addActionListener(new DesenhaOponente(adm));
        
        JButton botaoCancelar = new JButton("Cancelar");
        botaoCancelar.addActionListener(new CancelaPersonagem());
        botaoCancelar.addActionListener(new DesenhaOponente(adm));
        botaoCancelar.addActionListener(new Retroceder(this.tela)); 

        painel.add(botaoFinalizar);

        painel.add(botaoCancelar);

        return painel;

    }
    
    // Main --------------------------------------------------------------------
    public static void chama(Administrador adm) {
        
        OponenteGUI oponenteGUI = new OponenteGUI();
        
        tela.setSize(600, 300);

        tela.setLayout(new BorderLayout());

        tela.add(oponenteGUI.desenha(), BorderLayout.CENTER);

        tela.add(oponenteGUI.desenhaBotoes(adm), BorderLayout.SOUTH);

        tela.setVisible(true);
        tela.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        
        tela.setLocationRelativeTo(null);

    }
    
    // Fecha -------------------------------------------------------------------
    public void fecha(JFrame tela){
        tela.setVisible(false);
    }

    // Getteres ----------------------------------------------------------------

    public JTextField getTfNome() {
        return tfNome;
    }

    public JList getTfClasse() {
        return tfClasse;
    }
}
