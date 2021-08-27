
package ufjf.dcc025.trabalho.viewScreens;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import ufjf.dcc025.trabalho.controllerScreen.Retroceder;
import ufjf.dcc025.trabalho.modelCharacter.Personagem;
import ufjf.dcc025.trabalho.modelUsers.Administrador;
import ufjf.dcc025.trabalho.modelUsers.Jogador;

/**
 * @author  Daniel Muller Rezende
 * @@code   202065020A
 */

public class TelaSelecaoPersonagem {
    
    private static JFrame tela;
    private static Jogador jogador;
    private static Administrador administrador;
    private JComboBox listPersonagem;
    private JComboBox listInimigo;
    
    public TelaSelecaoPersonagem(Jogador jogador){
        this.jogador = jogador;
    }
    
    public JPanel desenha(){
        JPanel painel = new JPanel();
        
        painel.setLayout(new GridLayout(2,2));
        
        JLabel label1 = new JLabel("Selecione o personagem: ");
        JLabel label2 = new JLabel("Selecione o inimigo: ");
        
        String[] personagens = new String[jogador.getcontPersonagem()];
        
        for(int i=0; i<jogador.getcontPersonagem(); i++){
            personagens[i] = jogador.getPersonagem(i).getNome();
        }
        listPersonagem = new JComboBox(personagens);
        
        // Adicionar listInimigos -----------------------------
        
        
        painel.add(label1);
        painel.add(label2);
        painel.add(listPersonagem);
        //painel.add(listInimigo);
        
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
        
        TelaSelecaoPersonagem seleciona = new TelaSelecaoPersonagem(this.jogador);
    
        tela.setSize(600, 300);
        tela.setLayout(new BorderLayout());
        tela.add(seleciona.desenha(), BorderLayout.CENTER);
        tela.add(seleciona.desenhaBotoes(), BorderLayout.SOUTH);
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);
        
        tela.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }
    
}
