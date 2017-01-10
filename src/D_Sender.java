
import java.io.Serializable;


public class D_Sender extends Device implements Serializable{
    
    public D_Sender(long n, String nt){
        
        super(n,nt);
    }
    
    public D_Sender(D_Sender ds){
        
        super(ds.getNumber(), ds.getNetworkType());
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
        
        if(c.getClass().getName().equals("C_SMS"))
            return true;
        return false;
    }

    public int compare(Contact c1, Contact c2){
        return (c1.getName().compareTo(c2.getName()));}
}
