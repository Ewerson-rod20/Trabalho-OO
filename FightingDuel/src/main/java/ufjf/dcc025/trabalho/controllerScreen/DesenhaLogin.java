
package ufjf.dcc025.trabalho.controllerScreen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import ufjf.dcc025.trabalho.viewScreens.TelaLogin;

/**
 * @author  Daniel Muller Rezende
 * @@code   202065020A
 */

public class DesenhaLogin implements ActionListener{
    TelaLogin tela;
    
    public DesenhaLogin(JFrame telaPrincipal){
        this.tela = new TelaLogin(telaPrincipal);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        tela.chama();
    }
    
    
}
