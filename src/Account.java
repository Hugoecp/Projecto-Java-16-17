
import java.util.ArrayList;

public class Account {
    
    // Class variavels
    
    private static long ACCOUNT_ID = 0;
    
    // Class Getters & Setters
    
    public static long getACCOUNT_ID() {
        return ACCOUNT_ID;
    }
    
    // Interface variavels
    
    private long id;
    private ArrayList<Device> DeviceList;
    //private HashMap<Device, Invoice> accInvoice;
    
    // Construtors
    
    public Account(){
        
        this.id = ++Account.ACCOUNT_ID;
        this.DeviceList = new ArrayList<Device>();
    }
    
    // Clone Construtor
    
    public Account(Account a){

    this.id = a.getID();
    this.DeviceList = a.getDevList();
    }
    
    // Instance Getters & Setters
    
    public long getID(){return this.id;}
    public ArrayList<Device> getDevList(){
        
        ArrayList<Device> temp = new ArrayList<Device>();
        for(Device d : this.DeviceList){
            temp.add(d.clone());
        }
        return temp;
    }
    
    
    // Methods
    public Account clone(){return new Account(this);}
    public boolean equals(Account a){
        
        if(this.id == a.getID()){
            return true;
        }
        return false;
    }
    
}
