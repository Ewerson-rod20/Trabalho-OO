
package ufjf.dcc025.trabalho.controllerScreen;

import ufjf.dcc025.trabalho.viewScreens.TelaCadastro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author  Daniel Muller Rezende
 * @@code   202065020A
 */

public class DesenhaCadastro implements ActionListener{
    TelaCadastro tela;
    
    public DesenhaCadastro(){
        this.tela = new TelaCadastro();
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        tela.chama();
    }
}
