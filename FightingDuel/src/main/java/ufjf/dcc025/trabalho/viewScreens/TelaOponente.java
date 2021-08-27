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
import ufjf.dcc025.trabalho.controllerScreen.DesenhaCriaOponentes;
import ufjf.dcc025.trabalho.controllerScreen.Retroceder;
import ufjf.dcc025.trabalho.modelCharacter.Oponente;
import ufjf.dcc025.trabalho.modelGame.Dados;
import ufjf.dcc025.trabalho.modelUsers.Administrador;

/**
 *
 * @author Bonorino
 */
public class TelaOponente {
    private static JFrame tela;
    private final Administrador adm;
    
    // Construtor --------------------------------------------------------------
    public TelaOponente(Administrador adm){
        this.tela = new JFrame("Oponentes");
        this.adm = adm;
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
    public JPanel desenhaBotoes(Administrador adm){
        
        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(2, 1));
        
        JPanel painel1 = new JPanel();
        painel1.setLayout(new GridLayout(2, 1));
        
        JPanel painel2 = new JPanel();
        painel2.setLayout(new FlowLayout());
        
        JLabel nomeJogador = new JLabel("Olá, " + adm.getNome());
        
        JButton criarPersonagem = new JButton("Criar");
        criarPersonagem.addActionListener(new DesenhaCriaOponentes(adm));
        criarPersonagem.addActionListener(new Retroceder(tela));
        
        JButton editarPersonagem = new JButton("Editar");
//        editarPersonagem.addActionListener(new DesenhaEditarPersonagem(jogador));
        
        JButton excluirPersonagem = new JButton("Excluir");
//        excluirPersonagem.addActionListener(new DesenhaExcluirPersonagem());
//        excluirPersonagem.addActionListener(new Retroceder(tela));

        JButton botaoVoltar = new JButton("Voltar");
        botaoVoltar.addActionListener(new Retroceder(this.tela));;
        
        JTable boxOponentes;

        String[] tituloBoxOponentes = {"Oponente" , "Classe", "Nível", "Vida"};
        String[][] oponentesTabela = new String[Dados.oponentes.size() + 1][4];
        
        completaTabelaOponentes(Dados.oponentes, oponentesTabela);
        
        boxOponentes = new JTable(oponentesTabela, tituloBoxOponentes){@Override
        public boolean isCellEditable(int row, int column) {return false;}};
        
        JScrollPane tabelaPersonagens = new JScrollPane(boxOponentes);
        tela.add(tabelaPersonagens);

        painel1.add(nomeJogador);
        painel1.add(boxOponentes);
        painel2.add(criarPersonagem);
        painel2.add(editarPersonagem);
        painel2.add(excluirPersonagem);
        
        painel.add(painel1, BorderLayout.CENTER);
        painel.add(painel2, BorderLayout.CENTER);
        
        return painel;
    }
    
    // Chama --------------------------------------------------------------------
        public static JFrame chama(Administrador adm){
            
        TelaOponente telaOponente = new TelaOponente(adm);
        
        tela.setSize(800, 500);
        
        tela.setLayout(new BorderLayout());
        
        tela.add(telaOponente.desenhaBotoes(adm), BorderLayout.CENTER);
        tela.add(telaOponente.desenha(), BorderLayout.SOUTH);
        
        tela.setVisible(true);
        tela.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        
        tela.setLocationRelativeTo(null);
        
        return tela;
    }
    
    // Fecha -------------------------------------------------------------------
    public void fecha(JFrame tela){
        tela.setVisible(false);
    }

    private void completaTabelaOponentes(List<Oponente> oponentes, String[][] oponentesTabela) {
        oponentesTabela[0][0] = "OPONENTES";
        oponentesTabela[0][1] = "CLASSE";
        oponentesTabela[0][2] = "NÍVEL";
        oponentesTabela[0][3] = "VIDA";
        for (int i = 1, j = 0; i < oponentes.size() + 1; i++, j++){
            oponentesTabela[i][0] = oponentes.get(j).getNome();
            oponentesTabela[i][1] = oponentes.get(j).getClasse().getNomeClasse();
            oponentesTabela[i][2] = Integer.toString(oponentes.get(j).getNivel());
            oponentesTabela[i][3] = Integer.toString(oponentes.get(j).getVida());
        }
    }
}
