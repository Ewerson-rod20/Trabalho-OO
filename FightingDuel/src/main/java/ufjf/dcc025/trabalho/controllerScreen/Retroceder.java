
package ufjf.dcc025.trabalho.controllerScreen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 * @author  Daniel Muller Rezende
 * @@code   202065020A
 */

public class Retroceder implements ActionListener{
    
    private JFrame tela;
    
    public Retroceder(JFrame tela){
        this.tela = tela;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        this.tela.dispose();
    }
}
