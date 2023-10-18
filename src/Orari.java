public class Orari {
    private String tratta;
    
    public Orari(String tratta){
        this.tratta=tratta;
    }
    
    public Orari(Orari that){
        this.tratta=that.tratta;
    }
    
     public Orari(){
        this.tratta="";
    }
    
    public String getTratta(){
        return this.tratta;
    }
    
     public void setTratta(String tratta){
        this.tratta=tratta;
    }
    
    public String toString(){
        return "la tratta è "+this.tratta;
    }
}
