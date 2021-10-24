package Model;

public class Item {
    //propriedades
    private String nome;
    private int quantidade;
    private double valorUnitario;
    private double subTotal;
   
    //get/set
    public String getNome() { return this.nome; }
    private void setNome(String nome) { this.nome = nome; }
    
    public int getQuantidade() { return this.quantidade; }
    private void setQuantidade(int quantidade) { this.quantidade = quantidade; }
    
    public double getValorUnitario() { return this.valorUnitario; }
    private void setValorUnitario(double valorUnitario) { this.valorUnitario = valorUnitario; }
    
    public double getSubtotal() { return valorUnitario * quantidade; }

    //construtor
    public Item(String nome, int quantidade, double valorUnitario) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }   
}
