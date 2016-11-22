
import java.util.ArrayList;
//classe dispositivo
public abstract class Device {
    
    // Class variavels
    
    // Class Getters & Setters
    
    // Interface variavels
    
    private long number;//numero do dispositivo
    private String networkType;//tipo de rede
    private ArrayList<Comunications> Logs;//registo de comunicações(recebido e enviados)
    private ArrayList<Contact> list;//lista de contactos
    // Construtors
    
    public Device(long n, String nt){
        
        this.number = n;
        this.networkType = nt;
        this.Logs = new ArrayList<Comunications>();
    }
    
    public Device(){
        
        this.number = 0;
        this.networkType = "";
        this.Logs = new ArrayList<Comunications>();
    }
    
    // Clone Construtor
    
        public Device(Device d){
        
        this.number = d.getNumber();
        this.networkType = d.getNetworkType();
        //this.Logs = d.getLogs();
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
    
    // Methods    

    public abstract boolean addContact(Contact x);
    public abstract boolean removeContact(Contact y);
    public abstract Device clone();
    public abstract boolean equals(Device d);
}
