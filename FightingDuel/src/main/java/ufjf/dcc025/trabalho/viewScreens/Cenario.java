/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.trabalho.viewScreens;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import ufjf.dcc025.trabalho.modelCharacter.Personagem;

/**
 *
 * @author danie
 */
public class Cenario extends JPanel {

    private Image fundo;

    public Cenario(Personagem personagem) {
        if (personagem.getClasse().getNomeClasse().equals("Cavaleiro")) {
            ImageIcon referencia = new ImageIcon("C:\\Users\\danie\\Documents\\NetBeansProjects\\DCC025\\Trabalho-OO\\FightingDuel\\src\\main\\java\\ufjf\\dcc025\\trabalho\\viewScreens\\cenarioCavaleiro.png");
            this.fundo = referencia.getImage();
        }
        
        if (personagem.getClasse().getNomeClasse().equals("Ladrão")) {
            ImageIcon referencia = new ImageIcon("C:\\Users\\danie\\Documents\\NetBeansProjects\\DCC025\\Trabalho-OO\\FightingDuel\\src\\main\\java\\ufjf\\dcc025\\trabalho\\viewScreens\\cenarioLadrão.png");
            this.fundo = referencia.getImage();
        }
        
        if (personagem.getClasse().getNomeClasse().equals("Mago")) {
            ImageIcon referencia = new ImageIcon("C:\\Users\\danie\\Documents\\NetBeansProjects\\DCC025\\Trabalho-OO\\FightingDuel\\src\\main\\java\\ufjf\\dcc025\\trabalho\\viewScreens\\cenarioMago2.png");
            this.fundo = referencia.getImage();
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(this.fundo, 0, 0, null);
    }
}
