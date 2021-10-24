package Model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;

public class Pizza {
    //propriedades
    private UUID pizzaID;
    private String nome;
    public HashSet<Ingrediente> ingredientes;

    //get/set
    public UUID getPizzaID() {return pizzaID;}
    public void setPizzaID(UUID pizzaID) {this.pizzaID = pizzaID;}

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public HashSet<Ingrediente> getIngredientes() {return ingredientes;}
    private void setIngredientes(HashSet<Ingrediente> ingredientes) {this.ingredientes = ingredientes;}
    
    //construtor
    public Pizza(UUID pizzaID, String nome, HashSet<Ingrediente> ingredientes) {
        this.pizzaID = (pizzaID == null)? UUID.randomUUID() : pizzaID;
        this.nome = nome;
        this.ingredientes = (ingredientes == null)? new HashSet() : ingredientes;
    }
        
    //metodos
    public void RegistrarIngrediente (Ingrediente ingrediente){
        ingredientes.add(ingrediente);
    }
    
    public Ingrediente ObterIngredientePorNome(String nome){   
        List<Ingrediente> list = new ArrayList<>(ingredientes);
                     
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getNome().equals(nome))
                return (Ingrediente) list.get(i);
        }
        return null;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Ingrediente))
            return false;
               
        try {
            if ((obj instanceof Ingrediente && this.pizzaID.equals(obj.getClass().getDeclaredFields()[0].get(obj))))
                return true;
        } catch (Exception e) {
            System.out.println(e);
        }      

        return false;
    }

    @Override
    public int hashCode() {
        return 11 * ((this.pizzaID == null)? 1 : pizzaID.hashCode());
    }
    
    
}
