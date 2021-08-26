/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.trabalho.controllerUser;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import ufjf.dcc025.trabalho.modelCharacter.Cavaleiro;
import ufjf.dcc025.trabalho.modelCharacter.ClassePersonagem;
import ufjf.dcc025.trabalho.modelCharacter.Ladrao;
import ufjf.dcc025.trabalho.modelCharacter.Mago;
import ufjf.dcc025.trabalho.modelCharacter.Oponente;
import ufjf.dcc025.trabalho.modelCharacter.Personagem;
import ufjf.dcc025.trabalho.modelGame.Dados;
import ufjf.dcc025.trabalho.viewUsers.OponenteGUI;

/**
 *
 * @author Bonorino
 */
public class AdicionaOponente implements ActionListener{
    OponenteGUI oponenteGUI;

    public AdicionaOponente(OponenteGUI oponenteGUI) {
        this.oponenteGUI = oponenteGUI;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        int control = 0;
        ClassePersonagem classeSelecionada = null;
        
        for(Personagem personagem : Dados.oponentes){
            if(personagem.getNome().equals(oponenteGUI.getTfNome().getText())){
                JOptionPane.showMessageDialog(null, "ERRO! Já existe um oponente com esse nome!");
                control = 1;
                break;
            }
        }
        
        try {
            switch (oponenteGUI.getTfClasse().getSelectedIndex()) {
            case 0:
                classeSelecionada = new Cavaleiro(1, 2, 3); //VERIFICAR VALORES
                break;
            case 1:
                classeSelecionada = new Ladrao(1, 2, 3);
                break;
            case 2:
                classeSelecionada = new Mago(1, 2, 3);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Algo de errado aconteceu na criação...");
                control = 1;
                break;
            }
        } catch (HeadlessException e) {
            control = 1;
        }

        if (control == 0) {
            Oponente oponente = new Oponente(oponenteGUI.getTfNome().getText(), classeSelecionada, 5);
            Dados.oponentes.add(oponente);
        }
    }
}
