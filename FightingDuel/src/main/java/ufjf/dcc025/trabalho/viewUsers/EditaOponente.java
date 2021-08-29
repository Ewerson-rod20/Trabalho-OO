/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.trabalho.viewUsers;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import ufjf.dcc025.trabalho.controllerScreen.Retroceder;
import ufjf.dcc025.trabalho.controllerUser.ValidaEdicaoOponente;
import ufjf.dcc025.trabalho.modelGame.Dados;
import ufjf.dcc025.trabalho.modelUsers.Administrador;

/**
 *
 * @author Bonorino
 */
public class EditaOponente {
    private static Administrador adm;
    private static JFrame tela;
    private String[] oponentes;
    private String[] valores;
    
    private final JTextField jtText;
    private JList camposList;
    private JList oponentesList;
    private JList valoresList;
    
    // Construtor --------------------------------------------------------------
    public EditaOponente(){
        this.jtText = new JTextField(50);
    }
    
    // Desenha -----------------------------------------------------------------
    public JPanel desenha(){
        JPanel painel = new JPanel();
        JPanel painel1 = new JPanel();
        JPanel painel2 = new JPanel();
        JPanel painelInstrucoes = new JPanel();
        
        JLabel label = new JLabel("Digite o novo valor/nome: ");
        
        painel.setLayout(new GridLayout(0, 1));
        painel1.setLayout(new GridLayout(0, 3));
        painel2.setLayout(new GridLayout(0, 2));
        
        oponentes = new String[Dados.oponentes.size()];
        preencheOponentes();
        this.oponentesList = new JList(oponentes);
        this.oponentesList.setEnabled(true);
        
        String[] campos = {"Nome", "Classe", "Nível", "Vida", "Ataque 1", "Ataque 2", "Ataque 3", "Forca de Ataque", "Forca de Defesa"};
        this.camposList = new JList(campos);
        this.camposList.setEnabled(true);
        
        valores = new String[9];
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
        
        JLabel instrucoes = new JLabel("Clique 2 vezes no personagem para ver os valores e selecioná-lo e clique no atributo para editar");
        painelInstrucoes.add(instrucoes);
        
        painel1.add(oponentesList);
        painel1.add(camposList);
        painel1.add(valoresList);
        painel2.add(label);
        painel2.add(jtText);
        painel.add(painelInstrucoes);
        painel.add(painel1);
        painel.add(painel2);

        return painel;
    }
    
    // Desenha Botões ----------------------------------------------------------
    public JPanel desenhaBotoes(){
        JPanel painel = new JPanel();
        
        JButton botaoConfirmar = new JButton("Confirmar");
        botaoConfirmar.addActionListener(new ValidaEdicaoOponente(this, tela));
        botaoConfirmar.addActionListener(new Retroceder(this.tela));
        
        JButton botaoCancelar = new JButton("Cancelar");
        botaoCancelar.addActionListener(new Retroceder(this.tela));
        
        painel.add(botaoConfirmar);
        painel.add(botaoCancelar);
        
        return painel;
    }
    
    // Chama -------------------------------------------------------------------
    public void chama(Administrador adm){
        
        this.adm = adm;
        
        this.tela = new JFrame("Editar Oponentes");
        
        EditaOponente edita = new EditaOponente();
        
        tela.setSize(1000, 800);
        tela.setLayout(new BorderLayout());
        tela.add(edita.desenha(), BorderLayout.CENTER);
        tela.add(edita.desenhaBotoes(), BorderLayout.SOUTH);
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);
        
        tela.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }
    
    // Getteres ----------------------------------------------------------------
    public JList getCamposList() {
        return camposList;
    }

    public JTextField getJtText() {
        return jtText;
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
        valores[7] = Float.toString( Dados.oponentes.get(i).getClasse().getForcaAtk());
        valores[8] = Float.toString(Dados.oponentes.get(i).getClasse().getForcaDef());
    }

    public JList getOponentesList() {
        return oponentesList;
    }

    public JList getValoresList() {
        return valoresList;
    }
    
    
}
