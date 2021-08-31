/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.trabalho.viewScreens;

import java.awt.Graphics;
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
            ImageIcon referencia = new ImageIcon("cenarioCavaleiro.png");
            this.fundo = referencia.getImage();
        }
        
        if (personagem.getClasse().getNomeClasse().equals("Ladrão")) {
            ImageIcon referencia = new ImageIcon("cenarioLadrao.png");
            this.fundo = referencia.getImage();
        }
        
        if (personagem.getClasse().getNomeClasse().equals("Mago")) {
            ImageIcon referencia = new ImageIcon("cenarioMago.png");
            this.fundo = referencia.getImage();
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(this.fundo, 0, 0, null);
    }
}
