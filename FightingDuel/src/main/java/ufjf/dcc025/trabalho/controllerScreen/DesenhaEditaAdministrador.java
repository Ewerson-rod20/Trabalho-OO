
package ufjf.dcc025.trabalho.controllerScreen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import ufjf.dcc025.trabalho.modelUsers.Administrador;
import ufjf.dcc025.trabalho.modelUsers.Jogador;
import ufjf.dcc025.trabalho.viewUsers.EditaAdministrador;
import ufjf.dcc025.trabalho.viewUsers.EditaJogador;

/**
 * @author  Daniel Muller Rezende
 * @@code   202065020A
 */

public class DesenhaEditaAdministrador implements ActionListener{
    
    EditaAdministrador edita;
    Administrador administrador;
    JFrame telaPrincipal;
    JFrame telaAdministrador;
    
    public DesenhaEditaAdministrador(Administrador administrador, JFrame telaAdministrador, JFrame telaPrincipal){
        this.edita = new EditaAdministrador();
        this.administrador = administrador;
        this.telaPrincipal = telaPrincipal;
        this.telaAdministrador = telaAdministrador;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        edita.chama(administrador, this.telaAdministrador, this.telaPrincipal);
    }
}
