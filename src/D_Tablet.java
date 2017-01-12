
import java.io.Serializable;
import java.util.ArrayList;


public class D_Tablet extends Device implements Serializable{
    
    private int capacity = 0;
    
    public D_Tablet (long n, String nt, int c){
        
        super(n, nt);
        this.capacity = c;
        }
    
    public D_Tablet (D_Tablet t){
        
        super(t.getNumber(),t.getNetworkType());
    }
    
    public int getCap(){return this.capacity;}
    
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
    
    public String getType(){return "tablet";}
    
    public boolean equals(Device t)
    {
        if(this.getClass().getName().equals(t.getClass().getName()))
            if(super.getNumber() == t.getNumber())
                return true;
        return false;
    }
    
    public D_Tablet clone(){return new D_Tablet(this);}
    public int compare(Contact c1, Contact c2){
        return (c1.getName().compareTo(c2.getName()));}
}