import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;
//classe dispositivo
public abstract class Device implements Serializable, Comparator<Contact>{
    
    // Class variavels
    
    // Class Getters & Setters
    
    // Interface variavels
    
    private long number;//numero do dispositivo
    private String networkType;//tipo de rede
    private ArrayList<Comunications> Logs;//registo de comunicações(recebido e enviados)
    private TreeSet<Contact> cList;//lista de contactos
    // Construtors
    
    public Device(long n, String nt){
        
        this.number = n;
        this.networkType = nt;
        this.Logs = new ArrayList<Comunications>();
        this.cList = new TreeSet<Contact>(new TreeOrder());
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
    public ArrayList<Comunications> getLogs(){
        
        ArrayList<Comunications> temp = new ArrayList<Comunications>();
        for(Comunications c : this.Logs){
            temp.add(c);
        }
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
    public void addContact(Contact x){this.cList.add(x.clone());}
    
    public boolean removeContact(Contact y){
        if(this.cList.contains(y)){
            this.cList.remove(y);
            return true;
        }
        return false;
    }
    public void addLog(Comunications c){this.Logs.add(c.clone());}
    public abstract String getType();
    public abstract ArrayList<Comunications> printRlogs();
    public abstract ArrayList<Comunications> printSlogs();
    public abstract Device clone();
    public abstract boolean equals(Device d);
}
