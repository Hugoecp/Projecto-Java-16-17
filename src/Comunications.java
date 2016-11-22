public abstract class Comunications {
    
    private long originNumber;
    private long destinyNumber;
    
    
    public Comunications(long on, long dn){
        
        this.originNumber = on;//numero de dispositivo
        this.destinyNumber = dn;//destino do dispositivo
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
