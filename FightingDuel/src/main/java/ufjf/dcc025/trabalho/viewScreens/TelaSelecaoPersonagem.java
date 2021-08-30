package ufjf.dcc025.trabalho.viewScreens;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import ufjf.dcc025.trabalho.controllerScreen.DesenhaTelaLuta;
import ufjf.dcc025.trabalho.controllerScreen.Retroceder;
import ufjf.dcc025.trabalho.modelGame.Dados;
import ufjf.dcc025.trabalho.modelUsers.Jogador;

/**
 * @author Daniel Muller Rezende
 * @@code 202065020A
 */
public class TelaSelecaoPersonagem {

    private static JFrame tela;
    private static Jogador jogador;
    private JList listPersonagem;
    private JList listInimigo;
    String[] personagens;
    String[] oponentes;

    public TelaSelecaoPersonagem(Jogador jogador) {
        this.jogador = jogador;
        personagens = new String[3];
        oponentes = new String[10];
    }

    public JPanel desenha() {

        JPanel painel = new JPanel();

        painel.setLayout(new GridLayout(2, 2));

        JLabel label1 = new JLabel("Selecione o personagem: ");
        JLabel label2 = new JLabel("Selecione o inimigo: ");

        completaPersonagens();
        listPersonagem = new JList(personagens);
        System.out.println("Quantidade: " + personagens.length);
        listPersonagem.setSelectedIndex(0);
        listInimigo.setSelectedIndex(0);
        
        completaOponentes(listPersonagem);
        listInimigo = new JList(oponentes);
        
        listPersonagem.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent evt) {
                listPersonagem = (JList) evt.getSource();
                if (evt.getClickCount() == 2) {
                    listInimigo = null;
                    painel.remove(listInimigo);

                    completaOponentes(listPersonagem);

                    listInimigo = new JList(oponentes);
                    painel.add(listInimigo);
                    painel.updateUI();
                }
            }
        });
 
        painel.add(label1);
        painel.add(label2);
        painel.add(listPersonagem);
        painel.add(listInimigo);

        return painel;
    }

    public JPanel desenhaBotoes() {

        JPanel painel = new JPanel();

        painel.setLayout(new BorderLayout());

        JButton botaoJogar = new JButton("Jogar");
        if(listPersonagem == null || listInimigo == null){
            JOptionPane.showMessageDialog(null, "ERRO! Não há personagens ou inimigos o suficiente.");
        }
        else{
           botaoJogar.addActionListener(new DesenhaTelaLuta(jogador.getPersonagem(listPersonagem.getSelectedIndex()), Dados.oponentes.get(listInimigo.getSelectedIndex())));
        }
        JButton botaoCancelar = new JButton("Cancelar");
        botaoCancelar.addActionListener(new Retroceder(this.tela));

        painel.add(botaoJogar, BorderLayout.WEST);
        painel.add(botaoCancelar, BorderLayout.EAST);

        return painel;
    }

    public void chama() {

        this.tela = new JFrame("Seleção de Personagem");

        TelaSelecaoPersonagem seleciona = new TelaSelecaoPersonagem(this.jogador);

        tela.setSize(600, 300);
        tela.setLayout(new BorderLayout());
        tela.add(seleciona.desenha(), BorderLayout.CENTER);
        tela.add(seleciona.desenhaBotoes(), BorderLayout.SOUTH);
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);

        tela.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }

    private void completaPersonagens() {
        if (jogador.getcontPersonagem() != 0) {
            for (int i = 0; i < jogador.getcontPersonagem(); i++) {
                personagens[i] = jogador.getPersonagem(i).getNome();
            }
        }
    }

    private void completaOponentes(JList listaPersonagem) {
        if (Dados.oponentes.size() != 0) {
            for (int i = 0; i < Dados.oponentes.size(); i++) {
                if ((Dados.oponentes.get(i).getNivel() >= jogador.getPersonagem(listaPersonagem.getSelectedIndex()).getNivel() - 2) && (Dados.oponentes.get(i).getNivel() <= jogador.getPersonagem(listaPersonagem.getSelectedIndex()).getNivel() + 2)) {
                    if (Dados.oponentes.get(i).isJogavel()) {
                        oponentes[i] = Dados.oponentes.get(i).getNome();
                    }
                }
            }
        }
    }

}
