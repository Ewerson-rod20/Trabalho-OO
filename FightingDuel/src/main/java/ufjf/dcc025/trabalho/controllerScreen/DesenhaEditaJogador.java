
package ufjf.dcc025.trabalho.controllerScreen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import ufjf.dcc025.trabalho.modelUsers.Jogador;
import ufjf.dcc025.trabalho.viewUsers.EditaJogador;

/**
 * @author  Daniel Muller Rezende
 * @@code   202065020A
 */

public class DesenhaEditaJogador implements ActionListener{
    
    EditaJogador edita;
    Jogador jogador;
    JFrame telaPrincipal;
    JFrame telaJogador;
    
    public DesenhaEditaJogador(Jogador jogador,JFrame telaJogador, JFrame telaPrincipal){
        this.edita = new EditaJogador();
        this.jogador = jogador;
        this.telaPrincipal = telaPrincipal;
        this.telaJogador = telaJogador;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        edita.chama(jogador, this.telaJogador, this.telaPrincipal);
    }
    
}
