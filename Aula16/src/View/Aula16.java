package View;

import Model.*;
import Enumerators.UnidadeDeMedidaENUM;
import java.util.Iterator;
import java.util.UUID;

public class Aula16 {

    public static void main(String[] args) {
        var calabresa = new Ingrediente(UUID.randomUUID(), "Calabresa", UnidadeDeMedidaENUM.Quilogramas);
        var calabresa2 = new Ingrediente(calabresa.getIngredienteID(), "Calabresa", UnidadeDeMedidaENUM.Quilogramas);
        var cebola = new Ingrediente(null, "Cebola", UnidadeDeMedidaENUM.Unidade);
        var pizzaCalabresa = new Pizza(null,"Pizza de Calabresa", null);
        
        pizzaCalabresa.RegistrarIngrediente(calabresa);
        pizzaCalabresa.RegistrarIngrediente(calabresa2);
        pizzaCalabresa.RegistrarIngrediente(cebola);
        
        
        Iterator<Ingrediente> itr = pizzaCalabresa.getIngredientes().iterator();
        while (itr.hasNext()) {
            Ingrediente i = itr.next();
            System.out.println("Nome:" + i.getNome() + " UUID:" + i.getIngredienteID());
        }       
        
        System.out.println("");
        
        System.out.println(pizzaCalabresa.ObterIngredientePorNome("Calabresa").getNome());
    }
}
