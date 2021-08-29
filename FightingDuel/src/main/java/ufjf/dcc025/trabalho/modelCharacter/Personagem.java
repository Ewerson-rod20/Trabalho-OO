
package ufjf.dcc025.trabalho.modelCharacter;

/**
 * @author Daniel Muller Rezende (202065020A)
 */
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
}
