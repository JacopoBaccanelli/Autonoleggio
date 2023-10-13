public class Patente {
    private String nome;
    private String cognome;
    private String emissione;
    private String scadenza;

    public Patente(String nome, String cognome, String emissione, String scadenza){
        this.nome=nome;
        this.cognome=cognome;
        this.emissione=emissione;
        this.scadenza=scadenza;
    }

    public Patente(Patente that){
        this.nome=that.nome;
        this.cognome=that.cognome;
        this.emissione=that.emissione;
        this.scadenza=that.scadenza;
    }

    public Patente(){
        this.nome="";
        this.cognome="";
        this.emissione="";
        this.scadenza="";
    }

    public String getNome(){
        return this.nome;
    }

    public String getCognome(){
        return this.cognome;
    }

    public String getEmissione(){
        return this.emissione;
    }

    public String getScadenza(){
        return this.scadenza;
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public void setCognome(String cognome){
        this.cognome=cognome;
    }

    public void setEmissione(String emissione){
        this.emissione=emissione;
    }

    public void setScadenza(String scadenza){
        this.scadenza=scadenza;
    }

    public String toString(){
        return "nome:"+this.nome+" cognome:"+this.cognome+" data di emissione:"+this.emissione+" data di scadenza:"+this.scadenza;
    }

    public boolean equals(Patente that){
        boolean r=false;
        if(this.nome==that.nome && this.cognome==that.cognome && this.emissione==that.emissione && this.scadenza==that.scadenza){
            r=true;
        }
        return r;
    }
}
