public class Treno{
    private int posti;
    private int numero_vagoni;
    
    public Treno(int posti, int numero_vagoni){
        this.posti=posti;
        this.numero_vagoni=numero_vagoni;
    }
    
    public Treno(Treno that){
        this.posti=that.posti;
        this.numero_vagoni=that.numero_vagoni;
    }
    
    public Treno(){
        this.posti=0;
        this.numero_vagoni=0;
    }
    
    public int getPosti(){
        return this.posti;
    }
    
    public int getNumvag(){
        return this.numero_vagoni;
    }
    
    public void setPosti(int posti){
        this.posti=posti;
    }
    
    public void setNumvag(int numero_vagoni){
        this.numero_vagoni=numero_vagoni;
    }
    
    public String toString(){
        return "n. posti: "+this.posti+" n. vagoni: "+this.numero_vagoni;
    }
}
