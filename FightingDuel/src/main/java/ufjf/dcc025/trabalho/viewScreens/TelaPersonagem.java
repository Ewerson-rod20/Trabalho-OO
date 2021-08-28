/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.trabalho.viewScreens;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import ufjf.dcc025.trabalho.controllerScreen.DesenhaCriarPersonagem;
import ufjf.dcc025.trabalho.controllerScreen.DesenhaEditarPersonagem;
import ufjf.dcc025.trabalho.controllerScreen.DesenhaExcluirPersonagem;
import ufjf.dcc025.trabalho.controllerScreen.Retroceder;
import ufjf.dcc025.trabalho.modelCharacter.Personagem;
import ufjf.dcc025.trabalho.modelUsers.Jogador;

/**
 *
 * @author Bonorino
 */
public class TelaPersonagem {
    
    private static JFrame tela;
    private Jogador jogador;
    // Construtor --------------------------------------------------------------
    public TelaPersonagem(Jogador jogador){
        this.jogador = jogador;
        this.tela = new JFrame("Personagens");
    }
    
    // Desenha -----------------------------------------------------------------
    public JPanel desenha(){
        JPanel painel = new JPanel();
        
        JLabel jlID = new JLabel("Identificação dos desenvolvedores.");
        
        painel.setLayout(new GridLayout(0, 1));
        
        painel.add(jlID);
        
        return painel;
    }
    
    // Desenha Botões ----------------------------------------------------------
    public JPanel desenhaBotoes(Jogador jogador){
        
        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(2, 1));
        
        JPanel painel1 = new JPanel();
        painel1.setLayout(new GridLayout(2, 1));
        
        JPanel painel2 = new JPanel();
        painel2.setLayout(new FlowLayout());
        
//        JPanel painel3 = new JPanel();
//        painel3.setLayout(new FlowLayout());
        
        JLabel nomeJogador = new JLabel("Olá, " + jogador.getNome());
        
        JButton criarPersonagem = new JButton("Criar");
        criarPersonagem.addActionListener(new DesenhaCriarPersonagem(jogador));
        criarPersonagem.addActionListener(new Retroceder(tela));
        
        JButton editarPersonagem = new JButton("Editar");
        editarPersonagem.addActionListener(new DesenhaEditarPersonagem(jogador));
        editarPersonagem.addActionListener(new Retroceder(tela));
        
        JButton excluirPersonagem = new JButton("Excluir");
        excluirPersonagem.addActionListener(new DesenhaExcluirPersonagem(jogador));
        excluirPersonagem.addActionListener(new Retroceder(tela));

        JButton botaoVoltar = new JButton("Voltar");
        botaoVoltar.addActionListener(new Retroceder(this.tela));
        
        JTable boxPersonagens;

        String[] tituloBoxPersonagens = {"Personagem" , "Classe", "Nível", "Vida"};
        String[][] personagensTabela = new String[4][tituloBoxPersonagens.length];
        
        completaTabelaPersonagens(jogador.getPersonagens(), personagensTabela);
        
        boxPersonagens = new JTable(personagensTabela, tituloBoxPersonagens){@Override
        public boolean isCellEditable(int row, int column) {return false;}};
        
        JScrollPane tabelaPersonagens = new JScrollPane(boxPersonagens);
        tela.add(tabelaPersonagens);

        painel1.add(nomeJogador);
        painel1.add(boxPersonagens);
        painel2.add(criarPersonagem);
        painel2.add(editarPersonagem);
        painel2.add(excluirPersonagem);
        
        painel.add(painel1, BorderLayout.CENTER);
        painel.add(painel2, BorderLayout.CENTER);
        
        return painel;
    }
    
    // Chama --------------------------------------------------------------------
        public static JFrame chama(Jogador jogador){
            
        TelaPersonagem telaPersonagem = new TelaPersonagem(jogador);
        
        tela.setSize(800, 500);
        
        tela.setLayout(new BorderLayout());
        
        tela.add(telaPersonagem.desenhaBotoes(jogador), BorderLayout.CENTER);
        tela.add(telaPersonagem.desenha(), BorderLayout.SOUTH);
        
        tela.setVisible(true);
        tela.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        
        tela.setLocationRelativeTo(null);
        
        return tela;
    }
    
    // Fecha -------------------------------------------------------------------
    public void fecha(JFrame tela){
        tela.setVisible(false);
    }
    
    public void completaTabelaPersonagens(List<Personagem> personagens, String[][] personagensTabela){
        personagensTabela[0][0] = "PERSONAGEM";
        personagensTabela[0][1] = "CLASSE";
        personagensTabela[0][2] = "NÍVEL";
        personagensTabela[0][3] = "VIDA";
        
        for(int i = 1, j = 0; i <= personagens.size(); i++, j++){
            personagensTabela[i][0] = personagens.get(j).getNome();
            personagensTabela[i][1] = personagens.get(j).getClasse().getNomeClasse();
            personagensTabela[i][2] = Integer.toString(personagens.get(j).getNivel());
            personagensTabela[i][3] = Integer.toString(personagens.get(j).getVida());
        }
    }
}
