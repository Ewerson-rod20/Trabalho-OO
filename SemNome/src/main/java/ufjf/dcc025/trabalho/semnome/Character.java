
package ufjf.dcc025.trabalho.semnome;

public class Character {
    
    private int classe; // Classe do guerreiro;
    private int atkR;   // Ataque rápido;
    private int atkL;   // Ataque lento;
    private int def;    // Defesa;
    
    public Character(){
        
    }
    
    protected int getClasse(){
        return this.classe;
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
    
    protected void setClasse(int classe){
        this.classe = classe;
    }
    
    protected void setAtkR(int atkR){
        this.atkR = atkR;
    }
    
    protected void setAtkL(int atkL){
        this.atkL = atkL;
    }
    
    protected void setDef(int def){
        this.def = def;
    }
}
