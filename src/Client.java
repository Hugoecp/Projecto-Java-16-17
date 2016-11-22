
import java.util.ArrayList;

public class Client {
    
    //Class variavels
    
    private static long CLT_ID = 0;//codigo unico de cad cliente
    
    public static long getCLT_ID(){return CLT_ID;}
    public static void setCLT_ID(long CLT_ID){Client.CLT_ID = CLT_ID;}
    
    // Interface variavels
    
    private long id;//numero do cliente
    private String name;//nome do cliente
    private ArrayList<Account> accs;//array com lista de conta
    
    // Construtors
    
    public Client(String n){
        
        this.id = ++Client.CLT_ID;
        this.name = n;
        this.accs = new ArrayList<Account>();
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
    public ArrayList<Account> getAccs(){//get do array
        
        ArrayList<Account> temp = new ArrayList<Account>();
        for(Account c : this.accs){
            temp.add(c.clone());
        }
        return temp;
    }
    
    // Methods
    
    public boolean addAccount(Account a){//metodo adicionar conta
        
        if(!this.accs.contains(a)){
            this.accs.add(a.clone());
            return true;
        }
        return false;
    }
    public boolean removeAccount(Account a){//remover conta
        
        if(this.accs.contains(a)){
            this.accs.remove(a);
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