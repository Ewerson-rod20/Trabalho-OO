
package ufjf.dcc025.trabalho.controllerUser;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import ufjf.dcc025.trabalho.modelUsers.Jogador;

/**
 * @author  Daniel Muller Rezende
 * @@code   202065020A
 */

public class ExibeContaJogador implements ActionListener{
    Jogador jgd;
    
    public ExibeContaJogador(Jogador jgd){
        this.jgd = jgd;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        JOptionPane.showMessageDialog(null, "Nome: " + jgd.getNome() + 
                                            "\nNascimento: " + jgd.getDataNascimento() +
                                            "\nEmail: " + jgd.getEmail() + 
                                            "\nSenha: " + jgd.getSenha());
    }
}
