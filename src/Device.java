
import java.util.ArrayList;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FallenAngel
 */
public abstract class Device {
    
    // Class variavels
    
    // Class Getters & Setters
    
    // Interface variavels
    
    private long number;
    private String networkType;
    private ArrayList<Comunications> Logs;
    
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
    
    public long getNumber(){return number;}
    public void setNumber(long number){this.number = number;}
    public String getNetworkType(){return networkType;}
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

    public abstract Device clone();
    public abstract boolean equals(Device d);
}
