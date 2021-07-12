package ufjf.dcc025.trabalho.fightingduel;

import java.util.Scanner;
/**
 * @author Vitor Fernandes Reis (202065096A)
 */
public class Jogador {
    
    private Scanner teclado = new Scanner(System.in);
    
    private String nomeJogador,  // variável que armazena o nome do jogador
                   senhaJogador; // variável que armazena a senha do jogador
    
    private static int numPersonagens;  // variável que armazena o número de personagens que o jogador já possui
        
    
    public Jogador(){ // Construtor da classe Jogador:
        
        numPersonagens = 0;
                
        System.out.println("Informe o nome do jogador: ");
        this.nomeJogador = teclado.nextLine();
        
        System.out.println("Informe a senha: ");
        this.senhaJogador = teclado.nextLine();
        
        
    }
    
    public void criarPersonagem(){ // Método para criar um personagem
                
        if (numPersonagens == 3) {
            System.out.println("Você possui o número máximo de personagens.");
            return;
        }
        else if (numPersonagens == 0) {
            Personagem p1;
            numPersonagens++;
        }
        else if (numPersonagens == 1) {
            Personagem p2;
            numPersonagens++;
        }
        else if (numPersonagens == 2) {
            Personagem p3;
            numPersonagens++;
        }
    }
    
    public void excluirPersonagem() { // Método para excluir um personagem
        
        if (numPersonagens == 0) {
            System.out.println("Você não possui nenhum personagem.");
        }
        else if (numPersonagens == 3) {
            numPersonagens--;
        }
        else if (numPersonagens == 2) {
            numPersonagens--;
        }
        else if (numPersonagens == 1) {
            numPersonagens--;
        }
            
    }
}
