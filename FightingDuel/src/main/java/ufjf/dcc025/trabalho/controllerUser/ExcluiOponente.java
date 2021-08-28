/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.trabalho.controllerUser;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import ufjf.dcc025.trabalho.modelGame.Dados;
import ufjf.dcc025.trabalho.modelUsers.Administrador;

/**
 *
 * @author Bonorino
 */
public class ExcluiOponente implements ActionListener{
    int indice;
    Administrador adm = null;
    
    public ExcluiOponente(Administrador adm, int indice) {
        this.adm = adm;
        this.indice = indice;
        System.out.println("indice passado - " + indice);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String nomePersonagemDeletado = Dados.oponentes.get(indice).getNome();
        System.out.println("Vai deletar o indice " + indice);
        Dados.oponentes.remove(indice);
        JOptionPane.showMessageDialog(null, "Oponente '" + nomePersonagemDeletado + "' deletado com sucesso!");
    }
}
