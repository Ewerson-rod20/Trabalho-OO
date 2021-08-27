
package ufjf.dcc025.trabalho.controllerScreen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import ufjf.dcc025.trabalho.viewUsers.OrganizadorGUI;

/**
 * @author  Daniel Muller Rezende
 * @@code   202065020A
 */

public class DesenhaOrganizador implements ActionListener{
    
    OrganizadorGUI tela;
    JFrame tela1;
    
    public DesenhaOrganizador(JFrame tela1){
        tela = new OrganizadorGUI();
        this.tela1 = tela1;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        tela.chama();
        tela1.dispose();
    }
}
