/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.trabalho.controllerUser;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import ufjf.dcc025.trabalho.modelUsers.Organizador;

/**
 * @author  Daniel Muller Rezende
 * @@code   202065020A
 */

public class ExibeContaOrganizador implements ActionListener{
    Organizador org;
    
    public ExibeContaOrganizador(Organizador org){
        this.org = org;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        JOptionPane.showMessageDialog(null, "Nome: " + org.getNome() +
                                            "\nCPF: " + org.getCpf() + 
                                            "\nNascimento: " + org.getDataNascimento() +
                                            "\nEmail: " + org.getEmail() +
                                            "\nSenha: " + org.getSenha());
    }
}
