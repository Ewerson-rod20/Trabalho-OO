/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.trabalho.modelGame;

import ufjf.dcc025.trabalho.modelUsers.Organizador;
import ufjf.dcc025.trabalho.modelUsers.Jogador;
import ufjf.dcc025.trabalho.modelUsers.Administrador;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author danie
 */
public class Dados {
    
    public static List<Administrador> administradores;
    public static List<Jogador> jogadores;
    public static List<Organizador> organizadores;
    
    static{
        administradores = new ArrayList<>();
        jogadores = new ArrayList<>();
        organizadores = new ArrayList<>();
    }
}
