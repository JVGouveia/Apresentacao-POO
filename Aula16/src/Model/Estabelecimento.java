package Model;

public class Estabelecimento {
    //propriedades
    private String nome;
    private Endereco endereco;

    //get/set
    public String getNome() { return nome;}
    private void setNome(String nome) { this.nome = nome;}

    public Endereco getEndereco() { return endereco;}
    private void setEndereco(Endereco endereco) { this.endereco = endereco;}

    //contrutor
    public Estabelecimento(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }
    
    //metodos
    public void AtualizarEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    
    public void Dispose() {
        nome = null;
        endereco = null;
    }
}

