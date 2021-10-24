package Model;

import java.util.UUID;
import Enumerators.UnidadeDeMedidaENUM;

public class Ingrediente {
    //propriedades
    private UUID ingredienteID;
    private String nome;
    private UnidadeDeMedidaENUM UnidadeMedida; 

    //get/set
    public UUID getIngredienteID() {return ingredienteID;}
    public void setIngredienteID(UUID ingredienteID) {this.ingredienteID = ingredienteID;}

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public UnidadeDeMedidaENUM getUnidadeMedida() {return UnidadeMedida;}
    public void setUnidadeMedida(UnidadeDeMedidaENUM UnidadeMedida) {this.UnidadeMedida = UnidadeMedida;}

    //construtor
    public Ingrediente(UUID ingredienteID, String nome, UnidadeDeMedidaENUM UnidadeMedida) {
        this.ingredienteID = (ingredienteID == null)? UUID.randomUUID() : ingredienteID;
        this.nome = nome;
    }  
   
    //metodos
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Ingrediente))return false;
               
        try {
            if ((obj instanceof Ingrediente && this.ingredienteID.equals(obj.getClass().getDeclaredFields()[0].get(obj))))
                return true;
        } catch (Exception e) {
            System.out.println(e);
        }      

        return false;
    }

    @Override
    public int hashCode() {
        return 11 * ((this.ingredienteID == null)? 1 : ingredienteID.hashCode());
    }
}