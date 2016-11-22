

public class D_Sender extends Device{
    
    public D_Sender(long n, String nt){
        
        super(n,nt);
        
    }
    
    public D_Sender(D_Sender ds){
        
        super(ds.getNumber(), ds.getNetworkType());
        
    }
    
    public boolean addContact(Contact x){
        
        if(super.getContact().contains(x)){
            return false;
        }else{
            super.getContact().add(x.clone());
        }
        return true;
    }
     public boolean removeContact(Contact y){
        
        if(super.getContact().contains(y)){
            super.getContact().remove(y);
            return true;
        }
        return false;
    } 
   public void printRlogs(){
        
        for(Comunications aux : super.getLogs()){
            if(aux.getControl() == 0)
                System.out.println("Numero: " + aux.getOriginNumber() + 
                        " - " + aux.getClass().getName());
        }
    }
    
    public void printSlogs(){
        
        for(Comunications aux : super.getLogs()){
            if(aux.getControl() == 1)
                System.out.println("Numero: " + aux.getDestinyNumber() + 
                        " - " + aux.getClass().getName());
        }
    }
    public D_Sender clone(){
        return new D_Sender(super.getNumber(), super.getNetworkType());
    }
    public boolean equals(Device d){
        
        if(this.getClass().getName().equals(d.getClass().getName())){
            if(super.getNumber() == d.getNumber()){
                    return true;
            }
        }
        return false;
    }
    
    public boolean AcceptComs(Comunications c){
        
        C_SMS aux= null;
        
        if(aux.getClass().getName().equals(c.getClass().getName()))
            return true;
        else return false;
    }
}
