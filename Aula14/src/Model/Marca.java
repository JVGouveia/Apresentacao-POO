package Model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Marca {
    //propriedades
    private String nome;
    private List<Modelo> modelos;
    private int quantidadeModelos;
       
    //define o List como ReadOnly
    public List<Modelo> Modelos() {
        modelos = Collections.unmodifiableList(modelos);
        return modelos;
    }
    
    // gets/sets
    public String getNome() { return nome;}
    public void setNome(String nome) { this.nome = nome;}   

    //construtor
    public Marca(String nome) {
        this.nome = nome;
        modelos = new ArrayList();
    }
    
    //metodos
    public void RegistrarModelo(Modelo modelo) {
        modelos.add(modelo);
    }
    
    public Modelo ObterModeloPorIndice(int i){
        return (Modelo) modelos.get(i - 1).Clone();
    }
}