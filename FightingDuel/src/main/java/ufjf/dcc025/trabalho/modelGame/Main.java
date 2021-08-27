
package ufjf.dcc025.trabalho.modelGame;

import ufjf.dcc025.trabalho.util.SalvarAdministrador;
import ufjf.dcc025.trabalho.util.SalvarJogador;
import ufjf.dcc025.trabalho.util.SalvarOrganizador;
import ufjf.dcc025.trabalho.viewScreens.TelaPrincipal;

/**
 * @author  Daniel Muller Rezende
 * @@code   202065020A
 */

public class Main {
    public static void main(String[] args){
        TelaPrincipal tela = new TelaPrincipal();
        
        SalvarJogador lerJogadores = new SalvarJogador();
        SalvarAdministrador lerAdministradores = new SalvarAdministrador();
        SalvarOrganizador lerOrganizadores = new SalvarOrganizador();
        
        lerJogadores.lerArquvio();
        lerAdministradores.lerArquvio();
        lerOrganizadores.lerArquvio();
        
        tela.chama(tela);
    }
}
