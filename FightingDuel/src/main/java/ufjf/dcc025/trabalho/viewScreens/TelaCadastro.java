
package ufjf.dcc025.trabalho.viewScreens;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import ufjf.dcc025.trabalho.controllerScreen.DesenhaAdministrador;
import ufjf.dcc025.trabalho.controllerScreen.DesenhaJogador;
import ufjf.dcc025.trabalho.controllerScreen.DesenhaOrganizador;
import ufjf.dcc025.trabalho.controllerScreen.Retroceder;

/**
 * @author  Daniel Muller Rezende
 * @@code   202065020A
 */

public class TelaCadastro {
    
    private static JFrame tela;
    
    // Construtor --------------------------------------------------------------
    public TelaCadastro(){
    }
    
    // Desenha -----------------------------------------------------------------
    public JPanel desenha(){
        JPanel painel = new JPanel();
        
        JLabel jlID = new JLabel("Identificação dos desenvolvedores.");
        
        painel.setLayout(new GridLayout(0, 1));
        
        painel.add(jlID);
        
        return painel;
    }
    
    // Desenha Botões ----------------------------------------------------------
    public JPanel desenhaBotoes(){
        
        JPanel painel = new JPanel();
        
        JButton botaoJogador = new JButton("Jogador");
        botaoJogador.addActionListener(new DesenhaJogador(tela));
        
        JButton botaoAdministrador = new JButton("Administrador");
        botaoAdministrador.addActionListener(new DesenhaAdministrador(tela));
        
        JButton botaoOrganizador = new JButton("Organizador");
        botaoOrganizador.addActionListener(new DesenhaOrganizador(tela));
        
        JButton botaoVoltar = new JButton("Voltar");
        botaoVoltar.addActionListener(new Retroceder(this.tela)); 
        
        painel.add(botaoJogador);
        painel.add(botaoAdministrador);
        painel.add(botaoOrganizador);
        painel.add(botaoVoltar);
        
        return painel;
    }
    
    // Chama --------------------------------------------------------------------
    public void chama(){
        
        this.tela = new JFrame("Seleção de Cadastro");
        TelaCadastro telaCadastro = new TelaCadastro();
        
        tela.setSize(600, 300);
        
        tela.setLayout(new BorderLayout());
        
        tela.add(telaCadastro.desenhaBotoes(), BorderLayout.CENTER);
        tela.add(telaCadastro.desenha(), BorderLayout.SOUTH);
        
        tela.setLocationRelativeTo(null);
        
        tela.setVisible(true);
        tela.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);        
    }
    
    // Fecha -------------------------------------------------------------------
    public void fecha(JFrame tela){
        tela.setVisible(false);
    }
}
