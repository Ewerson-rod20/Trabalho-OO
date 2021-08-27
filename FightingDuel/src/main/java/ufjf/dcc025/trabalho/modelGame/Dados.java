
package ufjf.dcc025.trabalho.modelGame;

import ufjf.dcc025.trabalho.modelUsers.Organizador;
import ufjf.dcc025.trabalho.modelUsers.Jogador;
import ufjf.dcc025.trabalho.modelUsers.Administrador;
import java.util.ArrayList;
import java.util.List;
import ufjf.dcc025.trabalho.modelCharacter.Personagem;

/**
 * @author  Daniel Muller Rezende
 * @@code   202065020A
 */

public class Dados {
    
    public static List<Administrador> administradores;
    public static List<Jogador> jogadores;
    public static List<Organizador> organizadores;
    public static List<Personagem> oponentes;
    
    static{
        administradores = new ArrayList<>();
        jogadores = new ArrayList<>();
        organizadores = new ArrayList<>();
        oponentes = new ArrayList<>();
    }
}
