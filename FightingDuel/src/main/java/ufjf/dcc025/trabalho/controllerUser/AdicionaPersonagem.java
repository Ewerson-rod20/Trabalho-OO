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
import ufjf.dcc025.trabalho.modelCharacter.Personagem;
import ufjf.dcc025.trabalho.modelGame.Dados;
import ufjf.dcc025.trabalho.modelUsers.Jogador;
import ufjf.dcc025.trabalho.viewUsers.PersonagemGUI;

/**
 *
 * @author Bonorino
 */
public class AdicionaPersonagem implements ActionListener{
    PersonagemGUI personagemGUI;
    Jogador jogador = null;

    public AdicionaPersonagem(PersonagemGUI personagemGUI, Jogador jogador) {
        this.personagemGUI = personagemGUI;
        this.jogador = jogador;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        int control = 0;
        ClassePersonagem classeSelecionada = null;
        
        try {
            switch (personagemGUI.getTfClasse().getSelectedIndex()) {
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
            }
        } catch (HeadlessException e) {
            control = 1;
        }
        
                
        for (String personagem : this.jogador.getPersonagens().keySet()) { //AJEITAR PRO JOGADOR CERTO
            if(personagem.equals(personagemGUI.getTfNome().toString())){
                JOptionPane.showMessageDialog(null, "ERRO! Já existe um personagem com esse nome!");
                control = 1;
                break;
            }
        }

        if (control == 0) {
            Personagem personagem = new Personagem(personagemGUI.getTfNome().toString(), classeSelecionada, 5);
            this.jogador.addPersonagem(personagem);
            JOptionPane.showMessageDialog(null, "Personagem criado com sucesso!");
        }
    }
}
