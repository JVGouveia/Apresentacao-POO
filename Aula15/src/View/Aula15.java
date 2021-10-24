package View;

import Model.Academico;
import java.util.ArrayList;
import java.util.List;

public class Aula15 {

    public static void main(String[] args) {
        /*
        int a = 1;
        int b = 1;
        
        System.out.println((a == b));
        System.out.println((Integer.compare(a, b) == 0));
        */
        
        /*
        String a = "UTFPR";
        String b = "UTFPR";
        
        System.out.println(a.equals(b));        
        */
        
        
        Academico a = new Academico();
        a.setRA("1234");
        a.setNome("joao");
        
        Academico b = new Academico();
        b.setRA("12345");
        b.setNome("joao vitor");
           
        System.out.println("a é igual b? " + a.equals(b));
        
        List<Academico> academicos = new ArrayList<>();
        
        academicos.add(a);
        if (!academicos.contains(b))
            academicos.add(b);
        
        System.out.println("Quantidade academicos: " + academicos.size());

    }
}