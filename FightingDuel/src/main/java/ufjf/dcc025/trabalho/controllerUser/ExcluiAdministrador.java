
package ufjf.dcc025.trabalho.controllerUser;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import ufjf.dcc025.trabalho.modelGame.Dados;
import ufjf.dcc025.trabalho.modelUsers.Administrador;
import ufjf.dcc025.trabalho.modelUsers.Jogador;

/**
 * @author  Daniel Muller Rezende
 * @@code   202065020A
 */

public class ExcluiAdministrador implements ActionListener{

    private static JFrame telaPrincipal;
    private static JFrame telaAdministrador;
    private static JFrame tela;
    private static Administrador administrador;
    
    
    public ExcluiAdministrador(Administrador administrador, JFrame tela, JFrame telaAdministrador, JFrame telaPrincipal) {
        this.telaPrincipal = telaPrincipal;
        this.telaAdministrador = telaAdministrador;
        this.tela = tela;
        this.administrador = administrador;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        for(Administrador administrador1 : Dados.administradores){
            if(administrador.getNome().equals(administrador1.getNome())){
                Dados.administradores.remove(administrador1);
                JOptionPane.showMessageDialog(null, "Administrador excluído com sucesso.");
                tela.dispose();
                telaAdministrador.dispose();
                administrador.deletaAdministrador();
                telaPrincipal.setVisible(true);
            }
        }
    }
}
