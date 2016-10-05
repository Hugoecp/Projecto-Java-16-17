
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
    private ArrayList<String> Logs;
    
    // Construtors
    
    public Device(long n, String nt){
        
        this.number = n;
        this.networkType = nt;
        this.Logs = new ArrayList<String>();
    }
    
    public Device(){
        
        this.number = 0;
        this.networkType = "";
        this.Logs = new ArrayList<String>();
    }
    
    // Clone Construtor
    
        public Device(Device d){
        
        d.number = this.number;
        d.networkType = this.networkType;
        d.Logs = this.Logs;
    }
    
    // Interface Getters & Setters
    
    
        
    // Methods
}
