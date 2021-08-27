
package ufjf.dcc025.trabalho.viewScreens;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import ufjf.dcc025.trabalho.controllerScreen.Retroceder;
import ufjf.dcc025.trabalho.controllerUser.CancelaLogin;
import ufjf.dcc025.trabalho.controllerUser.ValidaLogin;

/**
 * @author  Daniel Muller Rezende
 * @@code   202065020A
 */

public class TelaLogin {
    
    private static JFrame tela;
    private JFrame telaPrincipal;
    private JTextField tfNome;
    private JTextField tfSenha;
        
    // Construtor --------------------------------------------------------------
    public TelaLogin(JFrame telaPrincipal){
        this.tfNome = new JTextField(50);
        this.tfSenha = new JTextField(50);
        this.telaPrincipal = telaPrincipal;
    }
    
    // Desenha -----------------------------------------------------------------
    public JPanel desenha(){
        
        JPanel painel = new JPanel();
        
        JLabel jlNome = new JLabel("Nome: ");
        JLabel jlSenha = new JLabel("Senha: ");
        
        painel.setLayout(new GridLayout(0, 2));
        
        painel.add(jlNome);
        painel.add(tfNome);
        
        painel.add(jlSenha);
        painel.add(tfSenha);
        
        return painel;
    }
    
    // Desenha botões ----------------------------------------------------------
    public JPanel desenhaBotoes(){
        
        JPanel painel = new JPanel();
        
        JButton botaoLogar = new JButton("Entrar");
        botaoLogar.addActionListener(new ValidaLogin(this, this.telaPrincipal, tela));
        
        JButton botaoCancelar = new JButton("Cancelar");
        botaoCancelar.addActionListener(new Retroceder(this.tela)); 
        
        painel.add(botaoLogar);
        painel.add(botaoCancelar);
        
        return painel;
    }
    
    // Chama -------------------------------------------------------------------
    public void chama(){
        
        this.tela = new JFrame("Tela Login");
        TelaLogin telaLogin = new TelaLogin(this.telaPrincipal);
        
        tela.setSize(600, 300);
        
        tela.setLayout(new BorderLayout());
        
        tela.add(telaLogin.desenha(), BorderLayout.CENTER);
        tela.add(telaLogin.desenhaBotoes(), BorderLayout.SOUTH);
        
        tela.setLocationRelativeTo(null);
        
        tela.setVisible(true);
        tela.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }
    
    // Fecha -------------------------------------------------------------------
    public static void fecha(JFrame tela){
        tela.setVisible(false);
    }
    
    // Getteres ----------------------------------------------------------------
    public JTextField getTfNome() {
        return tfNome;
    }

    public JTextField getTfSenha() {
        return tfSenha;
    }
    
}
