
package ufjf.dcc025.trabalho.controllerUser;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import ufjf.dcc025.trabalho.modelGame.Dados;
import ufjf.dcc025.trabalho.modelUsers.Jogador;
import ufjf.dcc025.trabalho.util.SalvarJogador;
import ufjf.dcc025.trabalho.viewUsers.AdministraUsuarios;

/**
 * @author Daniel Muller Rezende
 * @@code 202065020A
 */

public class ExcluiUsuario implements ActionListener{
    
    AdministraUsuarios adm;
    
    public ExcluiUsuario(AdministraUsuarios adm){
        this.adm = adm;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        Jogador aux = new Jogador();
        int control = adm.getList().getSelectedIndex();
        
        for(Jogador jogador1 : Dados.jogadores){
            if(jogador1.getNome().equals(Dados.jogadores.get(control).getNome())){
                aux = jogador1;
                JOptionPane.showMessageDialog(null, "Jogador excluído com sucesso.");
            }
        }
        aux.deletaJogador();
        Dados.jogadores.remove(control);
        
        SalvarJogador salvar = new SalvarJogador();
        salvar.excluirArquivo();
    }
}
