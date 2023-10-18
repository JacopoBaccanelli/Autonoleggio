public class Biglietti {
    private String prezzo;
    private String classe;
    private String validità;
    
    public Biglietti(String prezzo, String classe, String validità){
        this.prezzo=prezzo;
        this.classe=classe;
        this.validità=validità;
    }
    
     public Biglietti(Biglietti that){
        this.prezzo=that.prezzo;
        this.classe=that.classe;
        this.validità=that.validità;
    }
    
    public Biglietti(){
        this.prezzo="";
        this.classe="";
        this.validità="";
    }
    
     public String getPrezzo(){
        return this.prezzo;
    }
    
    public String getClasse(){
        return this.classe;
    }
    
     public String getvalidità(){
        return this.validità;
    }
    
    public void setPrezzo(String prezzo){
         this.prezzo=prezzo;
    }
    
     public void setClasse(String classe){
         this.classe=classe;
    }
    
     public void setValidità(String validità){
         this.validità=validità;
    }
    
    public String toString(){
        return "il prezzo del biglietto è di "+this.prezzo+" per la "+this.classe+" e ha una validità di "+this.validità;
    }
}
