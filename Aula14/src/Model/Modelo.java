package Model;

public class Modelo implements Cloneable{ 
    private String nome;

    //get/set
    public String getNome() { return nome;}
    private void setNome(String nome) { this.nome = nome;}
    
    //contrutor
    public Modelo(String nome) {
        this.nome = nome;
    }    
    
    //metodos
    public Object Clone(){
        return new Modelo(nome);
    }

    @Override
    public String toString() {
        return nome;
    }
    
    
}
