
import java.io.Serializable;
import java.util.ArrayList;

public class Account implements Serializable{//conta
    
    // Class variavels
    
    private static long ACCOUNT_ID = 330000;
    
    // Class Getters & Setters
    
    public static long getACC_ID(){return ACCOUNT_ID;}
    public static void setACC_ID(Long id){Account.ACCOUNT_ID = id;}
    
    // Interface variavels
    
    private long id;//numero da conta
    private ArrayList<Device> DeviceList;//array dispositivos
    
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
    public void setId(Long id){Account.ACCOUNT_ID = id;}
    
    public ArrayList<Device> getDevList(){return this.DeviceList;}
    
    // Methods
    public boolean addDevice(Device d){
        
        if(this.DeviceList.contains(d)){
            return false;
        }else{
            this.DeviceList.add(d.clone());
        }
        return true;
    }
    public boolean removeDevice(Device d){
        
        if(this.DeviceList.contains(d)){
            this.DeviceList.remove(d);
            return true;
        }
        return false;
    } 
    public long getAccIDbyDevNum(long num){
        
        for(Device aux : this.DeviceList){
            if(aux.getNumber() == num){
                return this.getID();
            }
        }
        return 0;
    }
    
    public boolean checkNum(long num){
        for(Device d : this.DeviceList){
            if(d.getNumber() == num)
                return true;
        }
        return false;
    }
    public String getTypeByNum(long n){
        
        for(Device d : this.DeviceList){
            if(d.getNumber() == n){
                if(d.getClass().getName().equals("D_Sender"))
                    return "Sender";
                if(d.getClass().getName().equals("D_Phone"))
                    return "Telemovel";
                if(d.getClass().getName().equals("D_Tablet"))
                    return "Tablet";
                
            }
        }
            return "Erro. Dispositivo nao existe";
    }
    public ArrayList<Device> getDevListbyID(long num){
        
        if(this.getAccIDbyDevNum(num) != 0){
            ArrayList<Device> temp = new ArrayList<Device>();
            for(Device aux : this.DeviceList){
                temp.add(aux.clone());
            }
            return temp;
        }
        return null;
    }
    public Account clone(){return new Account(this);}
    public boolean equals(Account a){return this.id == a.getID();}

    
        
    
}
