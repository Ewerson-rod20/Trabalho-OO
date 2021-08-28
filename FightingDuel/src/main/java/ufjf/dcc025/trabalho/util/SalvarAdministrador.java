
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
 * @author Daniel Muller Rezende
 * @code   202065020A
 */

public class SalvarAdministrador {
    
    static File arquivo;
    BufferedReader br;
    
    public SalvarAdministrador() {
        //Instanciando arquivo a ser manipulado.
        // Para executar o programa pelo cmd, especifique corretamente o caminho do arquivo .txt de acordo com o diretório de sua máquina.
        this.arquivo = new File("Administradores.txt");
        this.br = null;
    }
    
    // Função para leitura dos arquivo
    public void lerArquvio(){
        try {

            br = new BufferedReader(new FileReader(arquivo));
            
            String linha = null;
            
            while((linha = br.readLine())!= null){
                
                // Criação de um vetor de Strings para salvar as informações lidas
                // A linha é quebrada ao se ler ";".
                String[] campos = linha.split(";");
                
                // Salvando as informações lidas em Strings
                String nome = campos[0].trim();
                String cpf = campos[1].trim();
                String data = campos[2].trim();
                String email = campos[3].trim();
                String senha = campos[4].trim();
                
                if(!nome.equals("")&&!cpf.equals("")&&!data.equals("")&&!email.equals("")&&!senha.equals("")){
                    
                    // Ciando objeto do tipo Administrador
                    Administrador administrador = new Administrador();
                    administrador.setNome(nome);
                    administrador.setCpf(cpf);
                    administrador.setDataNascimento(data);
                    administrador.setEmail(email);
                    administrador.setSenha(senha);
                    
                    // Adicionando usuário à lista de administradores
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
    
    // Função para escrita no arquivo
    public void escreverArquivo(String nome, String cpf, String data, String email, String senha){
        
        Scanner sc = null;
        
        try{
            FileWriter arq = new FileWriter(this.arquivo, true);
            PrintWriter gravarArq = new PrintWriter(arq);
            
            // Escrevendo no arquivo separando cada campo por ";".
            gravarArq.println(nome+";"+ cpf+";"+data+";"+email+";"+senha+";");
            
            // Fechando leitura do arquivo
            gravarArq.close();
            arq.close();
            
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "ERRO! Não foi possível gravar as informações no arquivo.");
        }
    }
    
    // Função para reescrever o arquivo salvando as alterações feitas na lista de usuários
    public void excluirArquivo(){
        
        File aux = new File("aux");
        
        try{
            FileWriter arq1 = new FileWriter(this.arquivo);
            FileWriter arq2 = new FileWriter(this.arquivo, true);
            PrintWriter gravarArq = new PrintWriter(arq2);
            
            // Limpando o arquivo
            arq1.write("");
            
            for(Administrador administrador1 : Dados.administradores){
                
                // Reescrevendo as insformações dos usuários no arquivo
                gravarArq.println(administrador1.getNome()+";"+administrador1.getCpf()+";"+administrador1.getDataNascimento()+";"+administrador1.getEmail()+";"+administrador1.getSenha()+";");
            
            }
            
            // Fechando leitura do arquivo;
            gravarArq.close();
            arq1.close();
            arq2.close();
            
        }catch(IOException e){
            e.getMessage();
        }
    }
}
