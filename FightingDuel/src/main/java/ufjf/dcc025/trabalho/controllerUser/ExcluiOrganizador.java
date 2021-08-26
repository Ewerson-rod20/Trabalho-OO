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
import ufjf.dcc025.trabalho.modelGame.Dados;
import ufjf.dcc025.trabalho.modelUsers.Jogador;
import ufjf.dcc025.trabalho.modelUsers.Organizador;

/**
 *
 * @author danie
 */
public class ExcluiOrganizador implements ActionListener{
    
    private static JFrame telaPrincipal;
    private static JFrame telaOrganizador;
    private static JFrame tela;
    private static Organizador organizador;

    public ExcluiOrganizador(Organizador organizador, JFrame tela, JFrame telaOrganizador, JFrame telaPrincipal) {
        this.telaPrincipal = telaPrincipal;
        this.telaOrganizador = telaOrganizador;
        this.tela = tela;
        this.organizador = organizador;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        for(Organizador organizador1 : Dados.organizadores){
            if(organizador.getNome().equals(organizador1.getNome())){
                Dados.organizadores.remove(organizador1);
                JOptionPane.showMessageDialog(null, "Organizador excluído com sucesso.");
                tela.dispose();
                telaOrganizador.dispose();
                organizador.deletaOrganizador();
                telaPrincipal.setVisible(true);
            }
        }
    }
}
