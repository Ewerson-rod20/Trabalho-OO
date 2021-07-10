
package ufjf.dcc025.trabalho.semnome;

public class Personagem {
    
    private String nome;         // Nome do personagem;
    private int classe;          // Classe do personagem;
    private int vida;            // Vida do personagem;
    private int atkR;            // Ataque rápido/fraco;
    private int atkL;            // Ataque lento/forte;
    private int def;             // Defesa;
    private int conhecimento;    // Pontos de conhecimento;
    private int pontosAtributos; // Pontos para aumentar os atributos (vida, atk, def e conhecimento) do personagem;
    
//-----------------------------------------------------------------------------------------------------------------
// Constructor;
    
    public Personagem(int classe){
        this.classe = classe;
    }
    
//-----------------------------------------------------------------------------------------------------------------
// Métodos geteres;
    
    protected String getNome(){
        return this.nome;
    }
    
    protected int getClasse(){
        return this.classe;
    }
    
    protected int getVida(){
        return this.vida;
    }
    
    protected int getAtkR(){
        return this.atkR;
    }
    
    protected int getAtkL(){
        return this.atkL;
    }
    
    protected int getDef(){
        return this.def;
    }
    
    protected int getConhecimento(){
        return this.conhecimento;
    }
    
     protected int getPntsAtributos(){
        return this.pontosAtributos;
    }
}
