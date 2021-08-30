/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.trabalho.viewScreens;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import ufjf.dcc025.trabalho.modelGame.Dados;
import ufjf.dcc025.trabalho.modelUsers.Jogador;
import ufjf.dcc025.trabalho.modelCharacter.Personagem;
import ufjf.dcc025.trabalho.modelCharacter.Oponente;

/**
 *
 * @author danie
 */
public class TelaLuta extends JFrame {

    static JFrame tela;
    static Jogador jogador;
    static Personagem personagem;
    static Oponente oponente;

    public TelaLuta() {
        this.tela = new JFrame("Luta");
    }

    public JPanel desenhaBotoes() {
        JPanel painel = new JPanel();

        JButton ataque1 = new JButton("Ataque1");
        JButton ataque2 = new JButton("Ataque2");
        JButton ataque3 = new JButton("Ataque3");
        JButton desistir = new JButton("Desistir");

        painel.add(ataque1);
        painel.add(ataque2);
        painel.add(ataque3);
        painel.add(desistir);

        return painel;
    }

    public void chama(Personagem personagem, Oponente oponente) {
        this.personagem = personagem;
        this.oponente = oponente;
        
        TelaLuta luta = new TelaLuta();

        tela.setSize(1280, 720);
        
        tela.add(new Cenario(this.personagem), BorderLayout.CENTER);
        
        tela.add(luta.desenhaBotoes(), BorderLayout.SOUTH);

        tela.setLocationRelativeTo(null);

        tela.setVisible(true);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
