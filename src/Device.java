

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
    
    // Construtors
    
    public Device(long n, String nt){
        
        this.number = n;
        this.networkType = nt;
    }
    
    public Device(){
        
        this.number = 0;
        this.networkType = "";
    }
    
    // Clone Construtor
    
        public Device(Device d){
        
        d.number = this.number;
        d.networkType = this.networkType;
    }
    
    // Interface Getters & Setters
    
    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getNetworkType() {
        return networkType;
    }

    public void setNetworkType(String networkType) {
        this.networkType = networkType;
    }

        
    // Methods    

    public abstract String toString();
    public abstract Device clone();
    public abstract boolean equals(Device d);
    //public abstract ArrayList<Comunications> ReceivedCalls();
}
