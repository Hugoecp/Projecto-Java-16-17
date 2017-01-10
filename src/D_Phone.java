
import java.io.Serializable;

public class D_Phone extends Device implements Serializable{
 
        
    public D_Phone(long n, String nt){
        
        super(n,nt);//numero do dispositivo e tipo de rede
    }
    
    public D_Phone(D_Phone p){
        
        super(p.getNumber(), p.getNetworkType());
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
    
    public D_Phone clone(){
        return new D_Phone(this);
    }
    
    public boolean equals(Device d){
        
        if(this.getClass().getName().equals(d.getClass().getName())){
            if(super.getNumber() == d.getNumber()){
                return true;
            }
        }
        return false;
    }
    public int compare(Contact c1, Contact c2){
        return (c1.getName().compareTo(c2.getName()));}
}
