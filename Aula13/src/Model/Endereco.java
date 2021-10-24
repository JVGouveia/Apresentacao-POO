package Model;

public class Endereco {
    //propriedades
    private String rua;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;

    //get/set
    public String getRua() { return rua;}
    private void setRua(String rua) { this.rua = rua;}

    public String getNumero() { return numero;}
    private void setNumero(String numero) { this.numero = numero;}

    public String getBairro() { return bairro;}
    private void setBairro(String bairro) { this.bairro = bairro;}

    public String getCidade() { return cidade;}
    private void setCidade(String cidade) { this.cidade = cidade;}

    public String getEstado() { return estado;}
    private void setEstado(String estado) { this.estado = estado;}

    public String getCep() { return cep;}
    private void setCep(String cep) { this.cep = cep;}

    //contrutor
    public Endereco(String rua, String numero, String bairro, String cidade, String estado, String cep) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }
    
    //metodos
    @Override
    public String toString() {
        return "Rua " + rua + ", " + numero + " - " + bairro + ", " + cidade + " - " + estado;
    }   
}
