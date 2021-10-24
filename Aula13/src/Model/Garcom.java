package Model;

import java.util.Date;

public class Garcom {
    //propriedades
    private String nome;
    private Date dataContratacao; 

    //get/set
    public String getNome() { return nome;}
    public void setNome(String nome) { this.nome = nome;}

    public Date getDataContratacao() { return dataContratacao;}
    public void setDataContratacao(Date dataContratacao) { this.dataContratacao = dataContratacao;}
    
    //metodos
    public boolean IsValid() {
        return  nome != null && !nome.isBlank();
    }
}
