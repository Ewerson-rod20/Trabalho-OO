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
import ufjf.dcc025.trabalho.modelCharacter.Personagem;
import ufjf.dcc025.trabalho.modelUsers.Jogador;
import ufjf.dcc025.trabalho.viewUsers.EditaPersonagem;

/**
 *
 * @author Bonorino
 */
public class ValidaEdicaoPersonagem implements ActionListener{
    EditaPersonagem edita;
    Jogador jogador;
    JFrame tela;
//    SalvarJogador salvar;
    
    public ValidaEdicaoPersonagem(EditaPersonagem edita, Jogador jogador, JFrame tela){
        this.edita = edita;
        this.jogador = jogador;
        this.tela = tela;
//        this.salvar = new SalvarJogador();
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        
        int cont= 0;
        int i = edita.getCamposList().getSelectedIndex();
        
        String nomePersonagem = edita.getJtText().getText();
        
        for (Personagem personagem : jogador.getPersonagens()) {
            if(personagem.getNome().equals(edita.getJtText().getText())){
                JOptionPane.showMessageDialog(null, "Já existe um personagem com esse nome...");
                cont = 1;
                break;
            }
        }
        
        if(cont == 0){
            this.jogador.getPersonagem(i).setNome(nomePersonagem);
            tela.dispose();
//            this.salvar.excluirArquivo();
            JOptionPane.showMessageDialog(null, "Nome alterado com sucesso.");
        }
    }
    
}
