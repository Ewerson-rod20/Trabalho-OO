/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.trabalho.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author danie
 */
public class CancelaAdministrador implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent ae) {
        JOptionPane.showMessageDialog(null, "Cadastro cancelado!");
    }
}
