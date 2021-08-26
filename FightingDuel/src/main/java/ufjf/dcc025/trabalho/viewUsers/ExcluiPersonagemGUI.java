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
import javax.swing.ListSelectionModel;
import ufjf.dcc025.trabalho.controllerScreen.DesenhaPersonagem;
import ufjf.dcc025.trabalho.controllerScreen.Retroceder;
import ufjf.dcc025.trabalho.controllerUser.CancelaPersonagem;
import ufjf.dcc025.trabalho.controllerUser.ExcluiPersonagem;
import ufjf.dcc025.trabalho.modelUsers.Jogador;

/**
 *
 * @author Bonorino
 */
public class ExcluiPersonagemGUI {
    
    private Jogador jogador = null;
    private static JFrame tela;
    private final JList tfPersonagem;
    String listaPersonagens [];
    private int indiceSelecionado;
    
    // Construtor --------------------------------------------------------------
    public ExcluiPersonagemGUI(Jogador jogador){
        this.jogador = jogador;
        tela = new JFrame("Excluir Personagem");
        listaPersonagens = completaListaPersonagens();
        tfPersonagem = new JList(listaPersonagens);
        this.tfPersonagem.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
    
    // Desenha campos ----------------------------------------------------------
    public JPanel desenha(){
        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(0,2));
        
        JLabel jlNome = new JLabel("Personagem: ");
        
        painel.add(jlNome);
        painel.add(tfPersonagem);
        
        return painel;
    }
    
    // Desenha botões ----------------------------------------------------------
    public JPanel desenhaBotoes() {

        JPanel painel = new JPanel();

        JButton botaoConfirmar = new JButton("Confirmar");
        this.indiceSelecionado = tfPersonagem.getSelectedIndex();
        botaoConfirmar.addActionListener(new ExcluiPersonagem(this.jogador, indiceSelecionado+1));
        botaoConfirmar.addActionListener(new DesenhaPersonagem(jogador));
        botaoConfirmar.addActionListener(new Retroceder(this.tela)); 

        
        JButton botaoCancelar = new JButton("Cancelar");
        botaoCancelar.addActionListener(new CancelaPersonagem());
        botaoCancelar.addActionListener(new DesenhaPersonagem(jogador));
        botaoCancelar.addActionListener(new Retroceder(this.tela)); 

        painel.add(botaoConfirmar);

        painel.add(botaoCancelar);

        return painel;

    }
    
    // Main --------------------------------------------------------------------
    public static void chama(Jogador jogador) {
        
        ExcluiPersonagemGUI excluiPersonagemGUI= new ExcluiPersonagemGUI(jogador);
        
        tela.setSize(600, 300);

        tela.setLayout(new BorderLayout());

        tela.add(excluiPersonagemGUI.desenha(), BorderLayout.CENTER);

        tela.add(excluiPersonagemGUI.desenhaBotoes(), BorderLayout.SOUTH);

        tela.setVisible(true);
        tela.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        
        tela.setLocationRelativeTo(null);

    }
    
    // Fecha -------------------------------------------------------------------
    public void fecha(JFrame tela){
        tela.setVisible(false);
    }

    // Getteres ----------------------------------------------------------------
    
    public Jogador getJogador(){
        return this.jogador;
    }

    private String[] completaListaPersonagens() {
        String[] personagens = new String[jogador.getPersonagens().size()];
        for(int i = 0; i < jogador.getPersonagens().size(); i++){
            personagens[i] = jogador.getPersonagens().get(i).getNome();
        }
        return personagens;
    }
}
