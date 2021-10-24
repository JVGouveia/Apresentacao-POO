package View;

import Model.Aluno;
import java.util.Scanner;

public class Aula12 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite seu nome:");
        String nome = teclado.nextLine();
        
        System.out.print("Digite sua idade:");
        int idade = teclado.nextInt();
        
        Aluno a = new Aluno(nome, idade);
        
        System.out.println(a);
    }
}
