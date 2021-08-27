
package ufjf.dcc025.trabalho.controllerUser;

import ufjf.dcc025.trabalho.viewUsers.AdministradorGUI;
import ufjf.dcc025.trabalho.modelUsers.Administrador;
import ufjf.dcc025.trabalho.modelGame.Dados;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import ufjf.dcc025.trabalho.modelUsers.Jogador;
import ufjf.dcc025.trabalho.modelUsers.Organizador;

/**
 * @author  Daniel Muller Rezende
 * @@code   202065020A
 */

public class AdicionaAdministrador implements ActionListener {

    AdministradorGUI administradorGUI;
    JFrame tela;

    public AdicionaAdministrador(AdministradorGUI administradorGUI, JFrame tela) {
        this.administradorGUI = administradorGUI;
        this.tela = tela;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        int control = 0;

        for (Jogador jogador1 : Dados.jogadores) {
            if (administradorGUI.getTfNome().getText().equals(jogador1.getNome()) || administradorGUI.getTfEmail().getText().equals(jogador1.getEmail())) {
                control = 1;
                JOptionPane.showMessageDialog(null, "ERRO! Já existe um jogador com essas informações!\n Email ou nome já cadastrados.");
            }
        }

        for (Administrador administrador1 : Dados.administradores) {
            if (administradorGUI.getTfNome().getText().equals(administrador1.getNome()) || administradorGUI.getTfEmail().getText().equals(administrador1.getEmail()) || administradorGUI.getTfCpf().getText().equals(administrador1.getCpf())) {
                control = 1;
                JOptionPane.showMessageDialog(null, "ERRO! Já existe um administrador com essas informações!\n Email, cpf ou nome já cadastrados.");
            }
        }

        for (Organizador organizador1 : Dados.organizadores) {
            if (administradorGUI.getTfNome().getText().equals(organizador1.getNome()) || administradorGUI.getTfEmail().getText().equals(organizador1.getEmail()) || administradorGUI.getTfCpf().getText().equals(organizador1.getCpf())) {
                control = 1;
                JOptionPane.showMessageDialog(null, "ERRO! Já existe um organizador com essas informações!\n Email, cpf ou nome já cadastrados.");
            }
        }

        if (control == 0) {
            Administrador administrador = new Administrador();

            administrador.setCpf(administradorGUI.getTfCpf().getText());
            administrador.setEmail(administradorGUI.getTfEmail().getText());
            administrador.setDataNascimento(administradorGUI.getTfDataNascimento().getText());
            administrador.setNome(administradorGUI.getTfNome().getText());
            administrador.setSenha(administradorGUI.getTfSenha().getText());

            Dados.administradores.add(administrador);
            
            tela.dispose();
            JOptionPane.showMessageDialog(null, "Cadastro realizado.");

            for (Administrador administrador1 : Dados.administradores) {
                System.out.println(administrador1);
            }
        }

    }
}
