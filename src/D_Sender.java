
import java.io.Serializable;
import java.util.ArrayList;


public class D_Sender extends Device implements Serializable{
    
    public D_Sender(long n, String nt){
        
        super(n,nt);
    }
    
    public D_Sender(D_Sender ds){
        
        super(ds.getNumber(), ds.getNetworkType());
    }
    
    public ArrayList<Comunications> printRlogs(){
        
        ArrayList<Comunications> temp = new ArrayList<Comunications>();
        for(Comunications aux : super.getLogs()){
            if(aux.getControl() == 0)
                temp.add(aux);
        }
        return temp;
    }
    
    public ArrayList<Comunications> printSlogs(){
        
        ArrayList<Comunications> temp = new ArrayList<Comunications>();
        for(Comunications aux : super.getLogs()){
            if(aux.getControl() == 1)
                temp.add(aux);
        }
        return temp;
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
    public String getType(){return "sender";}
    
    public boolean AcceptComs(Comunications c){
        
        if(c.getClass().getName().equals("C_SMS"))
            return true;
        return false;
    }

    public int compare(Contact c1, Contact c2){
        return (c1.getName().compareTo(c2.getName()));}
}
