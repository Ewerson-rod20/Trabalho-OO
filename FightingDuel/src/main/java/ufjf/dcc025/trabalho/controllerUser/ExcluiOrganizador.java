
package ufjf.dcc025.trabalho.controllerUser;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import ufjf.dcc025.trabalho.modelGame.Dados;
import ufjf.dcc025.trabalho.modelUsers.Jogador;
import ufjf.dcc025.trabalho.modelUsers.Organizador;

/**
 * @author  Daniel Muller Rezende
 * @@code   202065020A
 */

public class ExcluiOrganizador implements ActionListener{
    
    private static JFrame telaPrincipal;
    private static JFrame telaOrganizador;
    private static JFrame tela;
    private static Organizador organizador;

    public ExcluiOrganizador(Organizador organizador, JFrame tela, JFrame telaOrganizador, JFrame telaPrincipal) {
        this.telaPrincipal = telaPrincipal;
        this.telaOrganizador = telaOrganizador;
        this.tela = tela;
        this.organizador = organizador;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Organizador aux = new Organizador();
        for(Organizador organizador1 : Dados.organizadores){
            if(organizador.getNome().equals(organizador1.getNome())){
                aux = organizador1;
                JOptionPane.showMessageDialog(null, "Organizador excluído com sucesso.");
                tela.dispose();
                telaOrganizador.dispose();
                telaPrincipal.setVisible(true);
            }
        }
        Dados.organizadores.remove(aux);
        aux.deletaOrganizador();
    }
}
