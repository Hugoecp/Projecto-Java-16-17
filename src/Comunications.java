/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FallenAngel
 */
public abstract class Comunications {
    
    private long originNumber;
    private long destinyNumber;
    
    
    public Comunications(long on, long dn){
        
        this.originNumber = on;
        this.destinyNumber = dn;
    }
    
    public Comunications(Comunications c){
        
        this.originNumber = c.getOriginNumber();
        this.destinyNumber = c.getDestinyNumber();
    }
    
    public long getOriginNumber(){return this.originNumber;}
    public void setOriginNumber(long n){this.originNumber = n;} 
    public long getDestinyNumber(){return this.destinyNumber;}
    public void setDestinyNumber(long n){this.destinyNumber = n;}
    
    public abstract boolean equals(Comunications c);
    public abstract Comunications clone();
}
