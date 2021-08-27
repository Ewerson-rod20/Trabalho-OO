
package ufjf.dcc025.trabalho.viewUsers;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import ufjf.dcc025.trabalho.controllerScreen.Retroceder;
import ufjf.dcc025.trabalho.controllerUser.ExcluiOrganizador;
import ufjf.dcc025.trabalho.controllerUser.ValidaEdicaoOrganizador;
import ufjf.dcc025.trabalho.modelUsers.Jogador;
import ufjf.dcc025.trabalho.modelUsers.Organizador;

/**
 * @author  Daniel Muller Rezende
 * @@code   202065020A
 */

public class EditaOrganizador {
    
    private static Organizador organizador;
    private static JFrame telaPrincipal;
    private static JFrame telaOrganizador;
    private static JFrame tela;
    private JComboBox camposList;
    
    private JTextField jtText;
    
    // Construtor --------------------------------------------------------------
    public EditaOrganizador(){
        this.jtText = new JTextField(50);
    }
    
    // Desenha -----------------------------------------------------------------
    public JPanel desenha(){
        JPanel painel = new JPanel();
        JPanel painel1 = new JPanel();
        JPanel painel2 = new JPanel();
        
        JLabel label = new JLabel("Digite sua alteração: ");
        
        painel.setLayout(new GridLayout(0, 1));
        painel1.setLayout(new GridLayout(0, 1));
        painel2.setLayout(new GridLayout(0, 2));
        
        String[] campos = {"Nome", "Email", "Senha"};
        this.camposList = new JComboBox(campos);
        
        painel1.add(camposList);
        painel2.add(label);
        painel2.add(jtText);
        painel.add(painel1);
        painel.add(painel2);
        
        return painel;
    }
    
    // Desenha Botões ----------------------------------------------------------
    public JPanel desenhaBotoes(){
        JPanel painel = new JPanel();
        
        JButton botaoConfirmar = new JButton("Confirmar");
        botaoConfirmar.addActionListener(new ValidaEdicaoOrganizador(this, this.organizador, tela));
        
        JButton botaoExcluir = new JButton("Excluir conta");
        botaoExcluir.addActionListener(new ExcluiOrganizador(this.organizador, this.tela, this.telaOrganizador, this.telaPrincipal));
        
        JButton botaoCancelar = new JButton("Cancelar");
        botaoCancelar.addActionListener(new Retroceder(this.tela));
        
        painel.add(botaoConfirmar);
        painel.add(botaoExcluir);
        painel.add(botaoCancelar);
        
        return painel;
    }
    
    // Chama -------------------------------------------------------------------
    public void chama(Organizador organizador, JFrame telaOrganizador, JFrame telaPrincipal){
        
        this.organizador = organizador;
        this.telaPrincipal = telaPrincipal;
        this.telaOrganizador = telaOrganizador;
        
        this.tela = new JFrame("Editar Dados");
        
        EditaOrganizador edita = new EditaOrganizador();
        
        tela.setSize(600, 300);
        tela.setLayout(new BorderLayout());
        tela.add(edita.desenha(), BorderLayout.CENTER);
        tela.add(edita.desenhaBotoes(), BorderLayout.SOUTH);
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);
        
        tela.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }
    
    // Getteres ----------------------------------------------------------------
    public JComboBox getCamposList() {
        return camposList;
    }
    
    public JTextField getJtText() {
        return jtText;
    }
}
