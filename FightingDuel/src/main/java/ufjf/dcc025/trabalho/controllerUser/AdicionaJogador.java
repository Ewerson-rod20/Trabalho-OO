
package ufjf.dcc025.trabalho.controllerUser;

import ufjf.dcc025.trabalho.viewUsers.JogadorGUI;
import ufjf.dcc025.trabalho.modelUsers.Jogador;
import ufjf.dcc025.trabalho.modelGame.Dados;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import ufjf.dcc025.trabalho.modelUsers.Administrador;
import ufjf.dcc025.trabalho.modelUsers.Organizador;
import ufjf.dcc025.trabalho.util.SalvarJogador;

/**
 * @author  Daniel Muller Rezende
 * @@code   202065020A
 */

public class AdicionaJogador implements ActionListener {

    JogadorGUI jogadorGUI;
    JFrame tela;

    public AdicionaJogador(JogadorGUI jogadorGUI, JFrame tela) {
        this.jogadorGUI = jogadorGUI;
        this.tela = tela;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        int control = 0;

        for (Jogador jogador1 : Dados.jogadores) {
            if (jogadorGUI.getTfNome().getText().equals(jogador1.getNome()) || jogadorGUI.getTfEmail().getText().equals(jogador1.getEmail())) {
                control = 1;
                JOptionPane.showMessageDialog(null, "ERRO! Já existe um jogador com essas informações!\n Email ou nome já cadastrados.");
            }
        }

        for (Administrador administrador1 : Dados.administradores) {
            if (jogadorGUI.getTfNome().getText().equals(administrador1.getNome()) || jogadorGUI.getTfEmail().getText().equals(administrador1.getEmail())){
                control = 1;
                JOptionPane.showMessageDialog(null, "ERRO! Já existe um administrador com essas informações!\n Email ou nome já cadastrados.");
            }
        }

        for (Organizador organizador1 : Dados.organizadores) {
            if (jogadorGUI.getTfNome().getText().equals(organizador1.getNome()) || jogadorGUI.getTfEmail().getText().equals(organizador1.getEmail())) {
                control = 1;
                JOptionPane.showMessageDialog(null, "ERRO! Já existe um organizador com essas informações!\n Email ou nome já cadastrados.");
            }
        }

        if (control == 0) {
            Jogador jogador = new Jogador();

            jogador.setEmail(jogadorGUI.getTfEmail().getText());
            jogador.setDataNascimento(jogadorGUI.getTfDataNascimento().getText());
            jogador.setNome(jogadorGUI.getTfNome().getText());
            jogador.setSenha(jogadorGUI.getTfSenha().getText());

            Dados.jogadores.add(jogador);
            
            SalvarJogador salvar = new SalvarJogador();
            
            salvar.escreverArquivo(jogadorGUI.getTfNome().getText(), jogadorGUI.getTfDataNascimento().getText(), jogadorGUI.getTfEmail().getText(), jogadorGUI.getTfSenha().getText());

            tela.dispose();
            JOptionPane.showMessageDialog(null, "Cadastro realizado.");
            
            for (Jogador jogador1 : Dados.jogadores) {
                System.out.println(jogador1);
            }
        }
    }
}
