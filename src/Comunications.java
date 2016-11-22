public abstract class Comunications {
    
    private long originNumber; //numero de dispositivo
    private long destinyNumber; //numero destino do dispositivo
    private int control; //Controlo de comunicacao enviada(= 1) ou recebida(= 0)

    public Comunications(long on, long dn, int c){
        
        this.originNumber = on;
        this.destinyNumber = dn;
        this.control = c; 
    }
    
    public Comunications(Comunications c){
        
        this.originNumber = c.getOriginNumber();
        this.destinyNumber = c.getDestinyNumber();
        this.control = c.getControl();
    }
    
    public long getOriginNumber(){return this.originNumber;}
    public void setOriginNumber(long n){this.originNumber = n;} 
    public long getDestinyNumber(){return this.destinyNumber;}
    public void setDestinyNumber(long n){this.destinyNumber = n;}
    public int getControl(){return this.control;}
    
    public abstract boolean equals(Comunications c);
    public abstract Comunications clone();
}
