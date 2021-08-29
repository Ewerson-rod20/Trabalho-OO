/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.trabalho.viewScreens;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import ufjf.dcc025.trabalho.controllerUser.OponenteValido;
import ufjf.dcc025.trabalho.modelGame.Dados;
import ufjf.dcc025.trabalho.modelUsers.Organizador;

/**
 *
 * @author Bonorino
 */
public class TelaValidaOponentes {
    
    static JFrame tela;
    private final Organizador organizador;
    String[] oponentes;
    private JList oponentesList;
    private JList camposList;
    private String[] valores;
    private JList valoresList;

    public TelaValidaOponentes(Organizador organizador) {
        this.organizador = organizador;
    }
    
    
    // Desenha -----------------------------------------------------------------
    public JPanel desenha(){
        JPanel painel = new JPanel();
        JPanel painel1 = new JPanel();
        JPanel painelInstrucoes = new JPanel();
        
        painel.setLayout(new GridLayout(0, 1));
        painel1.setLayout(new GridLayout(0, 3));
        
        oponentes = new String[Dados.oponentes.size()];
        preencheOponentes();
        this.oponentesList = new JList(oponentes);
        this.oponentesList.setEnabled(true);
        
        String[] campos = {"Nome", "Classe", "Nível", "Vida", "Ataque 1", "Ataque 2", "Ataque 3", "Forca de Ataque", "Forca de Defesa", "Válido"};
        this.camposList = new JList(campos);
        this.camposList.setEnabled(false);
        
        valores = new String[campos.length];
        preencheValores(0);
        this.valoresList = new JList(valores);
        this.valoresList.setEnabled(false);
        
        oponentesList.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                oponentesList = (JList)evt.getSource();
                if(evt.getClickCount() == 2) {
                    int index = oponentesList.locationToIndex(evt.getPoint());
                    valoresList = null;
                    painel1.remove(2);
                    preencheValores(index);
                    valoresList = new JList(valores);
                    valoresList.setEnabled(false);
                    painel1.add(valoresList);
                    painel.updateUI();
                }
            }
        });
        
        JLabel instrucoes = new JLabel("Clique 2 vezes no personagem para ver os valores e selecioná-lo!");
        painelInstrucoes.add(instrucoes);
        
        painel1.add(oponentesList);
        painel1.add(camposList);
        painel1.add(valoresList);
        painel.add(painelInstrucoes);
        painel.add(painel1);

        return painel;
    }
    
    // Desenha Botões ----------------------------------------------------------
    public JPanel desenhaBotoes(){
        JPanel painel = new JPanel();
        
        JButton botaoValidar = new JButton("Validar");
        botaoValidar.addActionListener(new OponenteValido(this, true));
        painel.updateUI();
        
        JButton botaoDesvalidar = new JButton("Desvalidar");
        botaoDesvalidar.addActionListener(new OponenteValido(this, false));
        
        painel.add(botaoValidar);
        painel.add(botaoDesvalidar);
        
        return painel;
    }
    
    // Chama -------------------------------------------------------------------
    public void chama(Organizador organizador){
        
        this.tela = new JFrame("Validar Oponentes");
        
        TelaValidaOponentes valida = new TelaValidaOponentes(organizador);
        
        tela.setSize(700, 500);
        tela.setLayout(new BorderLayout());
        tela.add(valida.desenha(), BorderLayout.CENTER);
        tela.add(valida.desenhaBotoes(), BorderLayout.SOUTH);
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);
        
        tela.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }
    
    // Getteres ----------------------------------------------------------------
    public JList getCamposList() {
        return camposList;
    }

    private void preencheOponentes() {
        for(int i = 0; i < Dados.oponentes.size(); i++){
            this.oponentes[i] = Dados.oponentes.get(i).getNome();
        }
    }

    private void preencheValores(int i) {
        valores[0] = Dados.oponentes.get(i).getNome();
        valores[1] = Dados.oponentes.get(i).getClasse().getNomeClasse();
        valores[2] = Integer.toString(Dados.oponentes.get(i).getNivel());
        valores[3] = Integer.toString(Dados.oponentes.get(i).getVida());
        valores[4] = Integer.toString(Dados.oponentes.get(i).getClasse().getAtaque1());
        valores[5] = Integer.toString(Dados.oponentes.get(i).getClasse().getAtaque2());
        valores[6] = Integer.toString(Dados.oponentes.get(i).getClasse().getAtaque3());
        valores[7] = Float.toString(Dados.oponentes.get(i).getClasse().getForcaAtk());
        valores[8] = Float.toString(Dados.oponentes.get(i).getClasse().getForcaDef());
        if(Dados.oponentes.get(i).isJogavel()){
            valores[9] = "Jogável";
        } else {
            valores[9] = "Não Jogável";
        }
    }

    public JList getOponentesList() {
        return oponentesList;
    }

    public JList getValoresList() {
        return valoresList;
    }
}
