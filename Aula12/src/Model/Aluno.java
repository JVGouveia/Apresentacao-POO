package Model;

public class Aluno {
    //propriedades
    String Nome;
    int Idade;
    String Categoria;

    //get/set
    public String getNome() { return Nome;}
    public void setNome(String nome) { this.Nome = nome;}

    public int getIdade() { return Idade;}
    public void setIdade(int idade) { this.Idade = idade;}

    public String getCategoria() {
        if (Idade > 4 && Idade <= 7) return "Infantil A";
        else if (Idade > 7 && Idade <= 10) return "Infatil B";
        else if (Idade > 10 && Idade <= 13) return "Juvenil A";
        else if (Idade > 13 && Idade <= 17) return "Juvenil B";
        else if (Idade > 17) return "Adulto";
        else return "Nao ha categoria";
    }

    //contrutor
    public Aluno(String Nome, int Idade) {
        this.Nome = Nome;
        this.Idade = Idade;
    }
    
    //metodos
    @Override
    public String toString() {
        return "Nome:" + Nome + "\nIdade:" + Idade + "\nCategoria:" + getCategoria();
    }    
}
