package Model;

public class Mesa {
    //propriedades
    final int MAX_ITENS = 10;
    private int quantidadeItensVendidos = 0;
    private int numero;
    private Item[] Itens = new Item[MAX_ITENS];

    //get/set
    public int getNumero() { return this.numero; }
    private void setNumero(int numero) { this.numero = numero; }
    
    public Item[] getItens() { return this.Itens; }

    //construtor
    public Mesa(int numero) {
        this.numero = numero;
    }
    
    //metodos
    public double ObterTotal(){
        double total = 0;
        for (int i = 0; i < ObterQuantidadeItens(); i++) {
           total += getItens()[i].getValorUnitario();
        }
        return total;
    }
    
    public void RegistrarItem(Item item){
        if (quantidadeItensVendidos < MAX_ITENS) {
            Itens[quantidadeItensVendidos++] = item;
        }
    }
    
    public int ObterQuantidadeItens() {
        return quantidadeItensVendidos;
    }

    @Override
    public String toString() {
        return "Quantidade de itens da mesa " + getNumero() + " é de: " + ObterQuantidadeItens() + " itens";
    }
    
    
}
