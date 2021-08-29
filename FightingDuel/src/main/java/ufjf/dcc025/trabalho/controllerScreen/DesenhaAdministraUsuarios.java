
package ufjf.dcc025.trabalho.controllerScreen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ufjf.dcc025.trabalho.viewUsers.AdministraUsuarios;

/**
 * @author Daniel Muller Rezende
 * @@code 202065020A
 */

public class DesenhaAdministraUsuarios implements ActionListener{
    
    AdministraUsuarios adm;

    public DesenhaAdministraUsuarios() {
        this.adm = new AdministraUsuarios();
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        adm.chama();
    }
    
}
