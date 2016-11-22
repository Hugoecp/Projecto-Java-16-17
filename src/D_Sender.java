
import java.util.ArrayList;

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
     // private ArrayList<Comunications> Logs;
    public boolean printLogs()
     {
         if(super.getLogs().isEmpty())
             return false;
         for(Comunications c : super.getLogs()){
            System.out.println("DE " + c.getOriginNumber() +
                    " PARA " + c.getDestinyNumber());
         }
         return true;
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
