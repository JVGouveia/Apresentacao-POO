package View;

import Model.*;
import java.time.Instant;
import java.util.Date;

public class Aula13 {

    public static void main(String[] args) {
        
        var mesa01 = new Mesa(1);
        
        var item01 = new Item("Suco", 1, 5.50);
        var item02 = new Item("X-Tudo", 1, 19.99);
        
        mesa01.RegistrarItem(item01);
        mesa01.RegistrarItem(item02);
        
        System.out.println(mesa01);
        for (int i = 0; i < mesa01.ObterQuantidadeItens(); i++) {
            System.out.println("Item: " + mesa01.getItens()[i].getNome() 
                    + " | Quantidade: " + mesa01.getItens()[i].getQuantidade() 
                    + " | Valor unitario: R$" + mesa01.getItens()[i].getValorUnitario());
            
        }
        System.out.println("Total: " + mesa01.ObterTotal());

        var loja = new Estabelecimento("Delivery do zé", 
        new Endereco("Beija-Flor", "2937", "Jd. Sao Marcos", "Umuarama", "PR", "87501450"));
        
        System.out.println(loja.getNome() + " | Local: " + loja.getEndereco());

        
        var garcom = new Garcom();
        
        garcom.setNome("Joao");
        garcom.setDataContratacao(Date.from(Instant.now()));
               
        //System.out.println("Nome: " + garcom.getNome() + " | Data contratacao: " + garcom.getDataContratacao());
    
        System.out.println("Valido?" + garcom.IsValid());
    }
}
