
public class D_Tablet extends Device{
    
    public D_Tablet (long n, String nt){
        
        super(n, nt);
        }
    
    public D_Tablet (D_Tablet t){
        
        super(t.getNumber(),t.getNetworkType());
    }
    
    
    public void printRlogs(){
        
        for(Comunications aux : super.getLogs().values()){
            if(aux.getControl() == 0)
                System.out.println("Numero: " + aux.getOriginNumber() + 
                        " - " + aux.getClass().getName());
        }
    }
    
    public void printSlogs(){
        
        for(Comunications aux : super.getLogs().values()){
            if(aux.getControl() == 1)
                System.out.println("Numero: " + aux.getDestinyNumber() + 
                        " - " + aux.getClass().getName());
        }
    }
    
    public boolean equals(Device t)
    {
        if(this.getClass().getName().equals(t.getClass().getName()))
            if(super.getNumber() == t.getNumber())
                return true;
        return false;
    }
    
    public D_Tablet clone(){return new D_Tablet(this);}
}