
package ufjf.dcc025.trabalho.controllerUser;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import ufjf.dcc025.trabalho.modelGame.Dados;
import ufjf.dcc025.trabalho.modelUsers.Jogador;

/**
 * @author  Daniel Muller Rezende
 * @@code   202065020A
 */

public class ExcluiJogador implements ActionListener{
    
    private static JFrame telaPrincipal;
    private static JFrame telaJogador;
    private static JFrame tela;
    private static Jogador jogador;

    public ExcluiJogador(Jogador jogador, JFrame tela, JFrame telaJogador, JFrame telaPrincipal) {
        this.telaPrincipal = telaPrincipal;
        this.telaJogador = telaJogador;
        this.tela = tela;
        this.jogador = jogador;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Jogador aux = new Jogador();
        for(Jogador jogador1 : Dados.jogadores){
            if(jogador.getNome().equals(jogador1.getNome())){
                aux = jogador1;
                JOptionPane.showMessageDialog(null, "Jogador excluído com sucesso.");
                tela.dispose();
                telaJogador.dispose();
                telaPrincipal.setVisible(true);
            }
        }
        Dados.jogadores.remove(aux);
        aux.deletaJogador();
    }
}
