package Model;

public class Academico {
    //propriedades
    private String RA;
    private String Nome;

    //get/set
    public String getRA() {return RA;}  
    public void setRA(String RA) {this.RA = RA;}
    
    public String getNome() {return Nome;}
    public void setNome(String Nome) {this.Nome = Nome;}

    //metodos
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Academico))return false;
      
        try {
            if ((obj instanceof Academico && this.RA.equals(obj.getClass().getDeclaredFields()[0].get(obj))))
                return true;
        } catch (Exception e) {
            System.out.println(e);
        }      
        return false;
    }

    @Override
    public int hashCode() {
        return 11 * ((this.RA == null)? 1 : RA.hashCode());
    }
    
    
}
