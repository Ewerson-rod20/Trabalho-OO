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
import ufjf.dcc025.trabalho.controllerScreen.DesenhaAtaque;
import ufjf.dcc025.trabalho.controllerUser.Desistir;
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
    
    public JPanel desenha(){
        JPanel painel = new JPanel();
        
        JLabel vidaJ = new JLabel("Vida Jogador: " + personagem.getVida());
        JLabel vidaO = new JLabel("Vida Oponente: " + oponente.getVida());
        
        painel.setLayout(new GridLayout(0,2));
        
        painel.add(vidaJ);
        painel.add(vidaO);
        
        return painel;
    }

    public JPanel desenhaBotoes() {
        JPanel painel = new JPanel();
        JPanel painel1 = new JPanel();
        JPanel painel2 = new JPanel();

        JButton ataque1 = new JButton(personagem.getClasse().getNome1());
        ataque1.addActionListener(new DesenhaAtaque(personagem, oponente, 1, this.tela));
        
        JButton ataque2 = new JButton(personagem.getClasse().getNome2());
        ataque2.addActionListener(new DesenhaAtaque(personagem, oponente, 2, this.tela));
        
        JButton ataque3 = new JButton(personagem.getClasse().getNome3());
        ataque3.addActionListener(new DesenhaAtaque(personagem, oponente, 3, this.tela));
        
        JButton desistir = new JButton("Desistir");
        desistir.addActionListener(new Desistir(this.tela));
        
        JLabel vidaJ = new JLabel("Vida Jogador: " + personagem.getVida());
        JLabel vidaO = new JLabel("Vida Oponente: " + oponente.getVida());

        painel1.add(vidaJ);
        painel1.add(vidaO);
        painel2.add(ataque1);
        painel2.add(ataque2);
        painel2.add(ataque3);
        painel2.add(desistir);
        painel.add(painel1);
        painel.add(painel2);

        return painel;
    }

    public void chama(Personagem personagem, Oponente oponente) {
        this.personagem = personagem;
        this.oponente = oponente;
        
        personagem.resetaStatus();
        oponente.resetaStatus();
        
        TelaLuta luta = new TelaLuta();

        tela.setSize(1280, 720);
        
        tela.add(new Cenario(this.personagem), BorderLayout.CENTER);
        tela.add(luta.desenhaBotoes(), BorderLayout.SOUTH);

        tela.setLocationRelativeTo(null);

        tela.setVisible(true);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
