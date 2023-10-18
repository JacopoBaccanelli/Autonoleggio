public class Patente extends Cliente{
    private String emissione;
    private String scadenza;

    public Patente(String nome, String cognome, int età, String emissione, String scadenza){
        super(nome, cognome, età);
        this.emissione=emissione;
        this.scadenza=scadenza;
    }

    public Patente(Patente that){
        super(that);
        this.emissione=that.emissione;
        this.scadenza=that.scadenza;
    }

    public Patente(){
        super();
        this.emissione="";
        this.scadenza="";
    }

    public String getEmissione(){
        return this.emissione;
    }

    public String getScadenza(){
        return this.scadenza;
    }

    public void setEmissione(String emissione){
        this.emissione=emissione;
    }

    public void setScadenza(String scadenza){
        this.scadenza=scadenza;
    }

    public String toString(){
        return super.toString()+" data di emissione:"+this.emissione+" data di scadenza:"+this.scadenza;
    }

    public boolean equals(Patente that){
        boolean r=false;
        if( this.emissione==that.emissione && this.scadenza==that.scadenza){
            r=true;
        }
        return r;
    }
}
