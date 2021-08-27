package ufjf.dcc025.trabalho.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;
import ufjf.dcc025.trabalho.modelGame.Dados;
import ufjf.dcc025.trabalho.modelUsers.Jogador;

/**
 *
 * @author danie
 */
public class SalvarJogador {

    static File arquivo;
    BufferedReader br;
    
    public SalvarJogador() {
        this.arquivo = new File("Jogadores.txt");
        this.br = null;
    }
    
    public void lerArquvio(){
        try {

            br = new BufferedReader(new FileReader(arquivo));
            
            String linha = null;
            
            while((linha = br.readLine())!= null){
                
                String[] campos = linha.split(";");
                
                String nome = campos[0].trim();
                String data = campos[1].trim();
                String email = campos[2].trim();
                String senha = campos[3].trim();
                
                if(!nome.equals("")&&!data.equals("")&&!email.equals("")&&!senha.equals("")){
                    
                    Jogador jogador = new Jogador();
                    jogador.setNome(nome);
                    jogador.setDataNascimento(data);
                    jogador.setEmail(email);
                    jogador.setSenha(senha);
                    
                    Dados.jogadores.add(jogador);
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        } finally{
            if(br!=null){
                try{
                    br.close();
                }catch(Exception e){  
                };
            }
        }
    }
    
    public void escreverArquivo(String nome, String data, String email, String senha){
        
        Scanner sc = null;
        
        try{
            FileWriter arq = new FileWriter(this.arquivo, true);
            PrintWriter gravarArq = new PrintWriter(arq);
            
            gravarArq.println(nome+";"+data+";"+email+";"+senha+";");
            
            gravarArq.close();
            
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "ERRO! Não foi possível gravar as informações no arquivo.");
        }
    }
}
