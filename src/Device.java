import java.io.Serializable;
import java.util.HashMap;
import java.util.TreeSet;
//classe dispositivo
public abstract class Device implements Serializable{
    
    // Class variavels
    
    // Class Getters & Setters
    
    // Interface variavels
    
    private long number;//numero do dispositivo
    private String networkType;//tipo de rede
    private HashMap<Long,Comunications> Logs;//registo de comunicações(recebido e enviados)
    private TreeSet<Contact> cList;//lista de contactos
    // Construtors
    
    public Device(long n, String nt){
        
        this.number = n;
        this.networkType = nt;
        this.Logs = new HashMap<Long,Comunications>();
        this.cList = new TreeSet<Contact>();
    }
    
    // Clone Construtor
    
        public Device(Device d){
        
        this.number = d.getNumber();
        this.networkType = d.getNetworkType();
        this.Logs = d.getLogs();
        this.cList = d.getContacts();
        
    }
     
    // Interface Getters & Setters
    
    public long getNumber(){return this.number;}
    public void setNumber(long number){this.number = number;}
    public String getNetworkType(){return this.networkType;}
    public void setNetworkType(String networkType){
        this.networkType = networkType;}
    public HashMap<Long,Comunications> getLogs(){
        
        HashMap<Long,Comunications> temp = new HashMap<Long, Comunications>();
        temp.putAll(this.Logs);
        return temp;
    }
    public TreeSet<Contact> getContacts(){
        
        TreeSet<Contact> temp = new TreeSet<Contact>();
        for(Contact aux : this.cList){
            temp.add(aux.clone());
        }
        return temp;
    
    }
    
    // Methods    
    public void addContact(Contact x){this.cList.add(x);}
    
    public boolean removeContact(Contact y){
        if(this.cList.contains(y)){
            this.cList.remove(y);
            return true;
        }
        return false;
    }
    
    public void addLog(Comunications c){this.Logs.put(c.getDestinyNumber(), c);}
    
    
    public abstract void printRlogs();
    public abstract void printSlogs();
    public abstract Device clone();
    public abstract boolean equals(Device d);
}
