/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import ufjf.dcc025.trabalho.modelUsers.Administrador;
import ufjf.dcc025.trabalho.modelUsers.Jogador;

/**
 *
 * @author danie
 */
public class SalvarAdministrador {
    
    static File arquivo;
    BufferedReader br;
    
    public SalvarAdministrador() {
        this.arquivo = new File("Administradores.txt");
        this.br = null;
    }
    
    public void lerArquvio(){
        try {

            br = new BufferedReader(new FileReader(arquivo));
            
            String linha = null;
            
            while((linha = br.readLine())!= null){
                
                String[] campos = linha.split(";");
                
                String nome = campos[0].trim();
                String cpf = campos[1].trim();
                String data = campos[2].trim();
                String email = campos[3].trim();
                String senha = campos[4].trim();
                
                if(!nome.equals("")&&!cpf.equals("")&&!data.equals("")&&!email.equals("")&&!senha.equals("")){
                    
                    Administrador administrador = new Administrador();
                    administrador.setNome(nome);
                    administrador.setCpf(cpf);
                    administrador.setDataNascimento(data);
                    administrador.setEmail(email);
                    administrador.setSenha(senha);
                    
                    Dados.administradores.add(administrador);
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
    
    public void escreverArquivo(String nome, String cpf, String data, String email, String senha){
        
        Scanner sc = null;
        
        try{
            FileWriter arq = new FileWriter(this.arquivo, true);
            PrintWriter gravarArq = new PrintWriter(arq);
            
            gravarArq.println(nome+";"+ cpf+";"+data+";"+email+";"+senha+";");
            
            gravarArq.close();
            
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "ERRO! Não foi possível gravar as informações no arquivo.");
        }
    }
}
