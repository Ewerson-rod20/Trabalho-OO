/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.trabalho.viewUsers;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import ufjf.dcc025.trabalho.controllerScreen.DesenhaOponente;
import ufjf.dcc025.trabalho.controllerScreen.Retroceder;
import ufjf.dcc025.trabalho.controllerUser.CancelaPersonagem;
import ufjf.dcc025.trabalho.controllerUser.ExcluiOponente;
import ufjf.dcc025.trabalho.modelGame.Dados;
import ufjf.dcc025.trabalho.modelUsers.Administrador;

/**
 *
 * @author Bonorino
 */
public class ExcluiOponenteGUI {
    private static Administrador adm;
    private static JFrame tela;
    private final JList tfPersonagem;
    String listaOponentes [];
    private int indiceSelecionado;
    
    // Construtor --------------------------------------------------------------
    public ExcluiOponenteGUI(Administrador adm){
        this.adm = adm;
        tela = new JFrame("Excluir Oponente");
        listaOponentes = completaListaOponentes();
        tfPersonagem = new JList(listaOponentes);
        this.tfPersonagem.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
    
    // Desenha campos ----------------------------------------------------------
    public JPanel desenha(){
        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(0,2));
        
        JLabel jlNome = new JLabel("Oponente: ");
        
        painel.add(jlNome);
        painel.add(tfPersonagem);
        
        return painel;
    }
    
    // Desenha botões ----------------------------------------------------------
    public JPanel desenhaBotoes() {

        JPanel painel = new JPanel();

        JButton botaoConfirmar = new JButton("Confirmar");
        botaoConfirmar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                indiceSelecionado = tfPersonagem.getSelectedIndex();
                botaoConfirmar.addActionListener(new ExcluiOponente(adm, indiceSelecionado));
                botaoConfirmar.addActionListener(new DesenhaOponente(adm));
                botaoConfirmar.addActionListener(new Retroceder(tela));
            }
            
        });
        
        JButton botaoCancelar = new JButton("Cancelar");
        botaoCancelar.addActionListener(new CancelaPersonagem());
        botaoCancelar.addActionListener(new DesenhaOponente(adm));
        botaoCancelar.addActionListener(new Retroceder(this.tela)); 

        painel.add(botaoConfirmar);

        painel.add(botaoCancelar);

        return painel;

    }
    
    // Main --------------------------------------------------------------------
    public static void chama(Administrador adm) {
        
        ExcluiOponenteGUI excluiOponenteGUI= new ExcluiOponenteGUI(adm);
        
        tela.setSize(600, 300);

        tela.setLayout(new BorderLayout());

        tela.add(excluiOponenteGUI.desenha(), BorderLayout.CENTER);

        tela.add(excluiOponenteGUI.desenhaBotoes(), BorderLayout.SOUTH);

        tela.setVisible(true);
        tela.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        
        tela.setLocationRelativeTo(null);

    }
    
    // Fecha -------------------------------------------------------------------
    public void fecha(JFrame tela){
        tela.setVisible(false);
    }

    // Getteres ----------------------------------------------------------------

    private String[] completaListaOponentes() {
        String[] personagens = new String[Dados.oponentes.size()];
        for(int i = 0; i < Dados.oponentes.size(); i++){
            personagens[i] = Dados.oponentes.get(i).getNome();
        }
        return personagens;
    }
}
