package View;

import Model.*;

public class Aula14 {
    public static void main(String[] args) {
        Marca marca = new Marca("Fiat");
        marca.RegistrarModelo(new Modelo("Uno"));
        marca.RegistrarModelo(new Modelo("Mobi"));
        System.out.println(marca.getNome());
        System.out.println(marca.Modelos());
    }
}
