
package ufjf.dcc025.trabalho.controllerUser;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import ufjf.dcc025.trabalho.modelGame.Dados;
import ufjf.dcc025.trabalho.modelUsers.Administrador;
import ufjf.dcc025.trabalho.modelUsers.Jogador;
import ufjf.dcc025.trabalho.modelUsers.Organizador;
import ufjf.dcc025.trabalho.util.SalvarOrganizador;
import ufjf.dcc025.trabalho.viewUsers.EditaJogador;
import ufjf.dcc025.trabalho.viewUsers.EditaOrganizador;

/**
 * @author  Daniel Muller Rezende
 * @@code   202065020A
 */

public class ValidaEdicaoOrganizador implements ActionListener{
    
    EditaOrganizador edita;
    Organizador organizador;
    JFrame tela;
    SalvarOrganizador salvar;
    
    public ValidaEdicaoOrganizador(EditaOrganizador edita, Organizador organizador, JFrame tela){
        this.edita = edita;
        this.organizador = organizador;
        this.tela = tela;
        this.salvar = new SalvarOrganizador();
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        
        int control = edita.getCamposList().getSelectedIndex();
        int cont= 0;
        
        switch(control){
            
            case 0:
                for(Jogador jogador1 : Dados.jogadores){
                    if(jogador1.getNome().equals(edita.getJtText().getText())){
                        JOptionPane.showMessageDialog(null, "ERRO! Já existe um jogador com esse nome.");
                        cont = 1;
                    }
                }
                
                for(Administrador administrador1 : Dados.administradores){
                    if(administrador1.getNome().equals(edita.getJtText().getText())){
                        JOptionPane.showMessageDialog(null, "ERRO! Já existe um administrador com esse nome.");
                        cont = 2;
                    }
                }
                
                for(Organizador organizador1 : Dados.organizadores){
                    if(organizador1.getNome().equals(edita.getJtText().getText())){
                        JOptionPane.showMessageDialog(null, "ERRO! Já existe um organizador com esse nome.");
                        cont = 3;
                    }
                }
                
                if(cont == 0){
                    this.organizador.setNome(edita.getJtText().getText());
                    tela.dispose();
                    salvar.excluirArquivo();
                    JOptionPane.showMessageDialog(null, "Nome alterado com sucesso.");
                }
                break;
            
            case 1:
                for(Jogador jogador1 : Dados.jogadores){
                    if(jogador1.getEmail().equals(edita.getJtText().getText())){
                        JOptionPane.showMessageDialog(null, "ERRO! Já existe um jogador com esse email.");
                        cont = 1;
                    }
                }
                
                for(Administrador administrador1 : Dados.administradores){
                    if(administrador1.getEmail().equals(edita.getJtText().getText())){
                        JOptionPane.showMessageDialog(null, "ERRO! Já existe um administrador com esse email.");
                        cont = 2;
                    }
                }
                
                for(Organizador organizador1 : Dados.organizadores){
                    if(organizador1.getEmail().equals(edita.getJtText().getText())){
                        JOptionPane.showMessageDialog(null, "ERRO! Já existe um organizador com esse email.");
                        cont = 3;
                    }
                }
                
                if(cont == 0){
                    this.organizador.setEmail(edita.getJtText().getText());
                    tela.dispose();
                    salvar.excluirArquivo();
                    JOptionPane.showMessageDialog(null, "Email alterado com sucesso.");
                }
                break;
            
            case 2:
                this.organizador.setSenha(edita.getJtText().getText());
                tela.dispose();
                salvar.excluirArquivo();
                JOptionPane.showMessageDialog(null, "Senha alterada com sucesso.");
                break;
        }
    }
}
