
package ufjf.dcc025.trabalho.modelCharacter;

/**
 * @author Daniel Muller Rezende (202065020A)
 */

import java.util.Random;

public class Personagem {
    
    private String nome;             // Nome do personagem;
    private ClassePersonagem classe; // Classe do personagem;
    private int vida;                // Vida do personagem;
    private int nivel;               // Nível do personagem;    
    
    // Construtor --------------------------------------------------------------
    public Personagem(String nome, ClassePersonagem classe, int nivel){
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        iniciaVida();
    }
    
    // Métodos geteres ---------------------------------------------------------
    public String getNome() {
        return nome;
    }

    public ClassePersonagem getClasse() {
        return classe;
    }

    public int getVida() {
        return vida;
    }

    public int getNivel() {
        return nivel;
    }
    
    // Setteres ----------------------------------------------------------------
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setClasse(ClassePersonagem classe) {
        this.classe = classe;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }   

    private void iniciaVida() {
        if("Cavaleiro".equals(classe.getNomeClasse())){
            vida = 120;
        } else if("Ladrão".equals(classe.getNomeClasse())){
            vida = 150;
        } else {
            vida = 185;
        }
    }
    
    private float sorteCavaleiro(int ataque){
        Random sorte = new Random();
        int valor = sorte.nextInt(100) + 1;
        switch(ataque){
            case 1:
                if(valor < 77){
                    return (sorte.nextInt(20) + 81)/100;
                } else {
                    return (sorte.nextInt(20) + 61)/100;
                }
            case 2:
                if(valor < 18){
                    return (sorte.nextInt(20) + 81)/100;
                } else {
                    return (sorte.nextInt(20) + 61)/100;
                }
            case 3:
                if(valor < 91){
                    return (sorte.nextInt(20) + 81)/100;
                } else {
                    return (sorte.nextInt(20) + 61)/100;
                }
        }
        return 0;
    }
    
    private float sorteLadrao(int ataque){
        Random sorte = new Random();
        int valor = sorte.nextInt(100) + 1;
        switch(ataque){
            case 1:
                if(valor < 73){
                    return (sorte.nextInt(20) + 81)/100;
                } else {
                    return (sorte.nextInt(20) + 61)/100;
                }
            case 2:
                if(valor < 31){
                    return (sorte.nextInt(20) + 81)/100;
                } else {
                    return (sorte.nextInt(20) + 61)/100;
                }
            case 3:
                if(valor < 55){
                    return (sorte.nextInt(20) + 81)/100;
                } else {
                    return (sorte.nextInt(20) + 61)/100;
                }
        }
        return 0;
    }
    
    private float sorteMago(int ataque){
        Random sorte = new Random();
        int valor = sorte.nextInt(100) + 1;
        switch(ataque){
            case 1:
                if(valor < 92){
                    return (sorte.nextInt(20) + 81)/100;
                } else {
                    return (sorte.nextInt(20) + 61)/100;
                }
            case 2:
                if(valor < 65){
                    return (sorte.nextInt(20) + 81)/100;
                } else {
                    return (sorte.nextInt(20) + 61)/100;
                }
            case 3:
                if(valor < 25){
                    return (sorte.nextInt(20) + 81)/100;
                } else {
                    return (sorte.nextInt(20) + 61)/100;
                }
        }
        return 0;
    }
    
    public float calculaDano(int ataque){
        switch(classe.getNomeClasse()){
            case "Cavaleiro":
                switch(ataque){
                    case 1:
                        return nivel*getClasse().getAtaque1()*getClasse().getForcaAtk()*sorteCavaleiro(1);
                    case 2:
                        return nivel*getClasse().getAtaque2()*getClasse().getForcaAtk()*sorteCavaleiro(2);
                    case 3:
                        return nivel*getClasse().getAtaque1()*getClasse().getForcaAtk()*sorteCavaleiro(3);
                }
                break;
                
            case "Ladrão":
                switch(ataque){
                    case 1:
                        return nivel*getClasse().getAtaque1()*getClasse().getForcaAtk()*sorteLadrao(1);
                    case 2:
                        return nivel*getClasse().getAtaque2()*getClasse().getForcaAtk()*sorteLadrao(2);
                    case 3:
                        return nivel*getClasse().getAtaque1()*getClasse().getForcaAtk()*sorteLadrao(3);
                }
                break;
                
            case "Mago":
                switch(ataque){
                    case 1:
                        return nivel*getClasse().getAtaque1()*getClasse().getForcaAtk()*sorteMago(1);
                    case 2:
                        return nivel*getClasse().getAtaque2()*getClasse().getForcaAtk()*sorteMago(2);
                    case 3:
                        return nivel*getClasse().getAtaque1()*getClasse().getForcaAtk()*sorteMago(3);
                }
                break;
        }
        return 0;
    }
}
