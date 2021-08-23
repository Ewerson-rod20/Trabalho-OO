/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.trabalho.controllerUser;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import ufjf.dcc025.trabalho.modelUsers.Administrador;

/**
 *
 * @author danie
 */
public class ExibeContaAdministrador implements ActionListener{
    Administrador adm;
    
    public ExibeContaAdministrador(Administrador adm){
        this.adm = adm;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        JOptionPane.showMessageDialog(null, "Nome: " + adm.getNome() +
                                            "\nCPF/CNPJ: " + adm.getCpf() + 
                                            "\nNascimento: " + adm.getDataNascimento() +
                                            "\nEmail: " + adm.getEmail());
    }
}
