
import java.io.Serializable;
import java.util.HashMap;


public class Invoice implements Serializable {

    // Class variavels
    
    // Class Getters & Setters
    
    // Interface variavels
    private long idConta;
    private HashMap<String,Comunications> fac;
    // Construtors
    
    public Invoice(long id){
        this.idConta = id;
        this.fac = new HashMap<String,Comunications>();
    }
    
    // Clone Construtor
    
    public Invoice(Invoice i){this.idConta = this.getIDc();}
    // Interface Getters & Setters
    public long getIDc(){return this.idConta;}    
    
    // Methods
    
    
    public Invoice clone(){return new Invoice(this);}
    
}
