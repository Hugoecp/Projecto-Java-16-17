import java.io.Serializable;
import java.util.ArrayList;
//classe dispositivo
public abstract class Device implements Serializable{
    
    // Class variavels
    
    // Class Getters & Setters
    
    // Interface variavels
    
    private long number;//numero do dispositivo
    private String networkType;//tipo de rede
    private ArrayList<Comunications> Logs;//registo de comunicações(recebido e enviados)
    private ArrayList<Contact> cList;//lista de contactos
    // Construtors
    
    public Device(long n, String nt){
        
        this.number = n;
        this.networkType = nt;
        this.Logs = new ArrayList<Comunications>();
        this.cList = new ArrayList<Contact>();
    }
    
    // Clone Construtor
    
        public Device(Device d){
        
        this.number = d.getNumber();
        this.networkType = d.getNetworkType();
        this.Logs = d.getLogs();
        this.cList = d.getContact();
        
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
            temp.add(c.clone());
        }
        return temp;
    }
    public ArrayList<Contact> getContact(){
        
        ArrayList<Contact> temp = new ArrayList<Contact>();
        for(Contact aux : this.cList){
            temp.add(aux.clone());
        }
        return temp;
    }
    
    // Methods    
    public boolean addContact(Contact x){
        
        if(this.cList.contains(x))
            return false;
        else{
            this.cList.add(x.clone());
            return true;
        }
    }
    public boolean removeContact(Contact y){
        
        if(!this.cList.contains(y))
            return false;
        else{
            this.cList.remove(y);
            return true;
        }
        
    }
    public boolean addLog(Comunications c){return this.Logs.add(c.clone());}
    public boolean removeLog(Comunications c){
        if(!this.Logs.contains(c))
            return false;
        else{
            this.Logs.remove(c);
            return true;
        }
    }
    
    public abstract void printRlogs();
    public abstract void printSlogs();
    public abstract Device clone();
    public abstract boolean equals(Device d);
}
