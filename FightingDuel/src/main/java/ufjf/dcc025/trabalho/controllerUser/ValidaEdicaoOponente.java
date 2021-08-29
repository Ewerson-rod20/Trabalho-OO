/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.trabalho.controllerUser;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import ufjf.dcc025.trabalho.modelCharacter.Oponente;
import ufjf.dcc025.trabalho.modelGame.Dados;
import ufjf.dcc025.trabalho.viewUsers.EditaOponente;

/**
 *
 * @author Bonorino
 */
public class ValidaEdicaoOponente implements ActionListener{
    EditaOponente edita;
    JFrame tela;
    
    public ValidaEdicaoOponente(EditaOponente edita, JFrame tela){
        this.edita = edita;
        this.tela = tela;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        
        int valido = 0;
        int personagem = edita.getOponentesList().getSelectedIndex();
        int campo = edita.getCamposList().getSelectedIndex();
        String valor = edita.getJtText().getText();
        
        switch(campo){
            case 0:
//                Nome
                for (Oponente oponente : Dados.oponentes) {
                    if(oponente.getNome().equals(edita.getJtText().getText())){
                        JOptionPane.showMessageDialog(null, "Já existe um oponente com esse nome...");
                        valido = 1;
                        break;
                    }
                }
                if(valido == 0){
                    Dados.oponentes.get(personagem).setNome(valor);
                    JOptionPane.showMessageDialog(null, "Nome alterado com sucesso!");
                }
                break;
            case 1:
//                Classe
                JOptionPane.showMessageDialog(null, "Não é possível alterar a classe do Oponente");
                break;
            case 2:
//                nivel
                Dados.oponentes.get(personagem).setNivel(Integer.parseInt(valor.trim()));
                JOptionPane.showMessageDialog(null, "Nível alterado com sucesso!");
                break;
            case 3:
//                vida
                Dados.oponentes.get(personagem).setVida(Integer.parseInt(valor.trim()));
                JOptionPane.showMessageDialog(null, "Vida alterada com sucesso!");
                break;
            case 4:
//                atk1
                Dados.oponentes.get(personagem).getClasse().setAtaque1(Integer.parseInt(valor.trim()));
                JOptionPane.showMessageDialog(null, "Ataque 1 alterado com sucesso!");
                break;
            case 5:
//                atk2
                Dados.oponentes.get(personagem).getClasse().setAtaque2(Integer.parseInt(valor.trim()));
                JOptionPane.showMessageDialog(null, "Ataque 2 alterado com sucesso!");
                break;
            case 6:
//                atk3
                Dados.oponentes.get(personagem).getClasse().setAtaque3(Integer.parseInt(valor.trim()));
                JOptionPane.showMessageDialog(null, "Ataque 3 alterado com sucesso!");
                break;
            case 7:
//                ForcaATK
                Dados.oponentes.get(personagem).getClasse().setForcaAtk(Float.parseFloat(valor.trim()));
                JOptionPane.showMessageDialog(null, "Força de Ataque alterado com sucesso!");
                break;
            case 8:
//                ForcaDFS
                Dados.oponentes.get(personagem).getClasse().setForcaDef(Float.parseFloat(valor.trim()));
                JOptionPane.showMessageDialog(null, "Força de Defesa alterado com sucesso!");
                break;
            default: 
                JOptionPane.showMessageDialog(null, "Algo deu errado :(");
                break;
        }
    }
    
}
