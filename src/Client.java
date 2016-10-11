
import java.util.ArrayList;

public class Client {
    
    //Class variavels
    
    private static long CLT_ID = 0;
    
    public static long getCLT_ID() {
        return CLT_ID;
    }

    public static void setCLT_ID(long CLT_ID) {
        Client.CLT_ID = CLT_ID;
    }
    
    // Interface variavels
    
    private long id;
    private String name;
    private ArrayList<Account> accs;
    
    // Construtors
    
    public Client(String n){
        
        this.id = ++Client.CLT_ID;
        this.name = n;
        this.accs = new ArrayList<Account>();
    }
    
    public Client(){
        
        this.id = ++Client.CLT_ID;
        this.name = "";
        this.accs = new ArrayList<Account>();
    }
    
    // Clone Construtor
    
    public Client(Client c){
        
        c.id = this.id;
        c.name = this.name;
        c.accs = this.accs;
        
    }
    
    // Getter & Setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Account> getAccs() {
        return accs;
    }

    public void setAccs(ArrayList<Account> accs) {
        this.accs = accs;
    }
    
    // Methods
    
    public boolean equals(Client e){
        
        if(e.id == this.id)
            return true;
        
        return false;
    }

    public String toString() {
        return "Client{" + "id=" + id + ", name=" + name + ", accs=" + accs + '}';
    }
    
    public Client clone(){
        
        return new Client(this);
    }

  }