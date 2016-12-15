
import java.io.Serializable;
import java.util.HashMap;

public class Client implements Serializable {
    
    //Class variavels
    
    private static long CLT_ID = 999;//codigo unico de cad cliente
    
    public static long getCLT_ID(){return CLT_ID;}
    public static void setCLT_ID(long CLT_ID){Client.CLT_ID = CLT_ID;}
    
    // Interface variavels
    
    private long id;//numero do cliente
    private String name;//nome do cliente
    private HashMap<Long, Account> accs;//array com lista de conta
    
    // Construtors
    
    public Client(String n){
        
        this.id = ++Client.CLT_ID;
        this.name = n;
        this.accs = new HashMap<Long,Account>();
    }
    
    // Clone Construtor
    
    public Client(Client c){
        
        this.id = c.getId();
        this.name = c.getName();
        this.accs = c.getAccs();
        
    }
    
    // Getter & Setters

    public long getId(){return id;}
    public void setId(long i){this.id = i;}
    public String getName(){return name;}
    public void setName(String n){this.name = n;}
    public HashMap<Long,Account> getAccs(){//get do mapa
        
        HashMap<Long,Account> temp = new HashMap<Long,Account>();
        temp.putAll(this.accs);
        
        return temp;
    }
    
    // Methods
    
    public boolean addAccount(Account a){//metodo adicionar conta
        this.accs.put(a.getID(), a);
        if(this.accs.containsKey(a.getID())){
            return true;
        }else 
            return false;
    }
        
        
    
    public boolean removeAccount(Account a){//remover conta
        
        if(this.accs.containsKey(a.getID())){
            this.accs.remove(a.getID(), a);
            return true;
        }
        return false;
    }
        
    public boolean equals(Client e){return e.id == this.id;}//metodo equals

    public String toString() {
        return ("Client{" + "id=" + id + ", name=" + 
                name + ", accs=" + accs + '}');
    }
    @Override
    public Client clone(){return new Client(this);}

  }
