public class Auto {
    private int codice;
    private String targa;
    private String marca;
    private String modello;
    private int numero_posti;

    public Auto(int codice, String targa, String marca, String modello, int numero_posti){
        this.codice=codice;
        this.targa=targa;
        this.marca=marca;
        this.modello=modello;
        this.numero_posti=numero_posti;
    }

    public Auto(Auto that){
        this.codice=that.codice;
        this.targa=that.targa;
        this.marca=that.marca;
        this.modello=that.modello;
        this.numero_posti=that.numero_posti;        
    }

    public Auto(){
        this.codice=0;
        this.targa="";
        this.marca="";
        this.modello="";
        this.numero_posti=0;
    }

    public int getCodice(){
        return this.codice;
    }

    public String getTarga(){
        return this.targa;
    }

    public String getMarca(){
        return this.marca;
    }

    public String getModello(){
        return this.modello;
    }

    public int getNumPosti(){
        return this.numero_posti;
    }

    public void setCodice(int codice){
        this.codice=codice;
    }

    public void setTarga(String targa){
        this.targa=targa;
    }

    public void setMarca(String marca){
        this.marca=marca;
    }

    public void setModello(String modello){
        this.modello=modello;
    }

    public void setNumPosti(int numero_posti){
        this.numero_posti=numero_posti;
    }

    public String toString(){
        return "codice:"+this.codice+" targa:"+this.targa+" marca:"+this.marca+" modello:"+this.modello+" numero di posti:"+this.numero_posti;
    }

    public boolean equals(Auto that){
        boolean r=false;
        if(this.codice==that.codice && this.targa==that.targa && this.marca==that.marca && this.modello==that.modello && this.numero_posti==that.numero_posti){
            r=true;
        }
        return r;
    }
}
