
package ufjf.dcc025.trabalho.controllerUser;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import ufjf.dcc025.trabalho.modelUsers.Administrador;

/**
 * @author  Daniel Muller Rezende
 * @@code   202065020A
 */

public class ExibeContaAdministrador implements ActionListener{
    Administrador adm;
    
    public ExibeContaAdministrador(Administrador adm){
        this.adm = adm;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        JOptionPane.showMessageDialog(null, "Nome: " + adm.getNome() +
                                            "\nCPF: " + adm.getCpf() + 
                                            "\nNascimento: " + adm.getDataNascimento() +
                                            "\nEmail: " + adm.getEmail() +
                                            "\nSenha: " + adm.getSenha());
    }
}
