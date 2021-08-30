
package ufjf.dcc025.trabalho.viewScreens;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import ufjf.dcc025.trabalho.controllerScreen.Retroceder;
import ufjf.dcc025.trabalho.modelCharacter.Oponente;
import ufjf.dcc025.trabalho.modelCharacter.Personagem;
import ufjf.dcc025.trabalho.modelGame.Dados;
import ufjf.dcc025.trabalho.modelUsers.Jogador;

/**
 * @author  Daniel Muller Rezende
 * @@code   202065020A
 */

public class TelaSelecaoPersonagem {
    
    private static JFrame tela;
    private static Jogador jogador;
    private static Dados oponente;
    private JComboBox listPersonagem;
    private JComboBox listInimigo;
    
    public TelaSelecaoPersonagem(Jogador jogador, Dados oponente){
        this.jogador = jogador;
        this.oponente = oponente;
    }
    
    public JPanel desenha(){
        
        JPanel painel = new JPanel();
        
        painel.setLayout(new GridLayout(2,2));
        
        JLabel label1 = new JLabel("Selecione o personagem: ");
        JLabel label2 = new JLabel("Selecione o inimigo: ");
        
        String[] personagens = new String[jogador.getcontPersonagem()];
        String[] oponentes = new String[Dados.oponentes.size()];
        
        for(int i=0; i<jogador.getcontPersonagem(); i++){
            personagens[i] = jogador.getPersonagem(i).getNome();
        }
        
        for (int i = 0; i < Dados.oponentes.size(); i++){
            oponentes[i] = Dados.oponentes.get(i).getNome();
        }
        
        listPersonagem = new JComboBox(personagens);
        listInimigo = new JComboBox (oponentes);
    
        /*
        
        OBS: Tinha transformado 'listPersonagem' e 'listInimigo' em Jlist
         
        listPersonagem.addMouseListener(new MouseAdapter() {
        
            @Override
            public void mouseClicked(MouseEvent evt) {
                //listPersonagem = (JList)evt.getSource();
                if(evt.getClickCount() == 1) {
                    int index = listPersonagem.locationToIndex(evt.getPoint());
                    listPersonagem = null;
                    
                    for (int i = 0; i < Dados.oponentes.size(); i++){
                        if ((Math.abs(jogador.getPersonagem(listPersonagem.getSelectedIndex()).getNivel() - Dados.oponentes.get(i).getNivel()) <= 2) && (Math.abs(jogador.getPersonagem(listPersonagem.getSelectedIndex()).getNivel() - Dados.oponentes.get(i).getNivel()) == 0)){
                            oponentes[i] = Dados.oponentes.get(i).getNome();
                        }
                    }
                    
                    listInimigo = new JList(oponentes);
                    listInimigo.setEnabled(false);
                    painel.add(listInimigo);
                    painel.updateUI();
                }
        
            }
        });*/    
        
        // Adicionar listInimigos -----------------------------
        
        
        painel.add(label1);
        painel.add(label2);
        painel.add(listPersonagem);
        painel.add(listInimigo);
        
        return painel;
    }
    
    
    public JPanel desenhaBotoes(){
        
        JPanel painel = new JPanel();
        
        painel.setLayout(new BorderLayout());
        
        JButton botaoJogar = new JButton("Jogar");
        
        JButton botaoCancelar = new JButton("Cancelar");
        botaoCancelar.addActionListener(new Retroceder(this.tela));
        
        painel.add(botaoJogar, BorderLayout.WEST);
        painel.add(botaoCancelar, BorderLayout.EAST);
        
        return painel;
    }
    
    
    public void chama(){
        
        this.tela = new JFrame("Seleção de Personagem");
        
        TelaSelecaoPersonagem seleciona = new TelaSelecaoPersonagem(this.jogador, this.oponente);
    
        tela.setSize(600, 300);
        tela.setLayout(new BorderLayout());
        tela.add(seleciona.desenha(), BorderLayout.CENTER);
        tela.add(seleciona.desenhaBotoes(), BorderLayout.SOUTH);
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);
        
        tela.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }

    
}
