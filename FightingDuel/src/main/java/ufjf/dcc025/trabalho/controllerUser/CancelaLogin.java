
package ufjf.dcc025.trabalho.controllerUser;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import ufjf.dcc025.trabalho.viewScreens.TelaLogin;

/**
 * @author  Daniel Muller Rezende
 * @@code   202065020A
 */

public class CancelaLogin implements ActionListener{
    TelaLogin telaLogin;
    
    public CancelaLogin (TelaLogin telaLogin){
        this.telaLogin = telaLogin;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        JOptionPane.showMessageDialog(null, "Login cancelado!");
    }
}
