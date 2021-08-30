/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.trabalho.viewScreens;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import ufjf.dcc025.trabalho.controllerScreen.Retroceder;

/**
 *
 * @author danie
 */
public class TelaInstrucoes {

    private static JFrame tela;
    
    // Construtor --------------------------------------------------------------
    public TelaInstrucoes(){
    }
    
    // Desenha -----------------------------------------------------------------
    public JPanel desenha(){
        JPanel painel = new JPanel();
        
        painel.setLayout(new GridLayout(0, 1));
        
        JLabel lbInstrucoes = new JLabel("<html><center><strong>BEM VINDO À FIGHTING DUEL!</strong></center><br> <br>"
                + "&ensp;Instruções: <br>"
                + "&ensp;<strong>ADMINISTRADOR:</strong><br>"
                + "&ensp;&emsp;-Responsável pela criação de oponentes e administração dos usuários;<br>"
                + "&ensp;&emsp;-Pode editar os personagens de forma livre, exceto pela classe que não pode ser alterada;<br>"
                + "&ensp;<strong>ORGANIZADOR:</strong><br>"
                + "&ensp;&emsp;-Responsável pela validação dos oponentes criados pelo administrador;<br>"
                + "&ensp;&emsp;-Oponentes não validados pelo organizador não podem ser enfrentados e devem ser editados pelo administrador;<br>"
                + "&ensp;<strong>JOGADOR:</strong><br>"
                + "&ensp;&emsp;-Cria seus personagens com um limite de 3;<br>"
                + "&ensp;&emsp;-Personagens podem ser de 3 classes(Cavaleiro, Ladrão, Mago);<br>"
                + "&ensp;&emsp;-Cavaleiros tem um dano mais alto em ataques de perto;<br>"
                + "&ensp;&emsp;-Ladrões tem um dano médio;<br>"
                + "&ensp;&emsp;-Magos tem um dano mais alto em ataques de longe;<br>"
                + "&ensp;&emsp;-Todos os ataques tem uma porcentagem de sorte que varia para cada ataque de cada classe;<br>"
                + "&ensp;&emsp;-A sorte afeta o dano causado no ataque;<br>"
                + "&ensp;&emsp;-Jogadores podem enfretar oponentes de nível igual ao dele e com margem de 2 níveis, acima e abaixo;<br>"
                + "&ensp;&emsp;-A cada vitória, seu personagem aumenta o nível e forcas de Ataque e Defesa;<br></html>"
        );
        
        JButton botaoVoltar = new JButton("Voltar");
        botaoVoltar.addActionListener(new Retroceder(tela));
        
        painel.add(lbInstrucoes);
        painel.add(botaoVoltar);
        
        return painel;
    }
    
    // Chama -------------------------------------------------------------------
    public void chama(){
        
        this.tela = new JFrame("Instruções");

        TelaInstrucoes telaInstrucoes = new TelaInstrucoes();
        
        tela.setSize(1000, 800);
        
        tela.setLayout(new BorderLayout());
        
        tela.add(telaInstrucoes.desenha(), BorderLayout.CENTER);
        
        tela.setLocationRelativeTo(null);
        
        tela.setVisible(true);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
