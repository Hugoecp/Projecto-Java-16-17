
import java.util.ArrayList;

public class D_Sender extends Device{
    
    private ArrayList<Contact> cList;
    private ArrayList<Comunications> Logs;
    
    
    public D_Sender(long n, String nt){
        
        super(n,nt);
        this.cList = new ArrayList<Contact>();
        this.Logs = new ArrayList<Comunications>();
    }
    
    public D_Sender(D_Sender ds){
        
        super(ds.getNumber(), ds.getNetworkType());
        this.cList = ds.getCList();
        this.Logs = ds.getLogs();
    }
    
    public ArrayList<Contact> getCList(){
        
        ArrayList<Contact> temp = new ArrayList<Contact>();
        for(Contact c : this.cList){
            temp.add(c.clone());
        }
        return temp;
    }
    
    public ArrayList<Comunications> getLogs(){
        
        ArrayList<Comunications> temp = new ArrayList<Comunications>();
        for(Comunications c : this.Logs){
            temp.add(c.clone());
        }
        return temp;
    }
    
    public D_Sender clone(){
        return new D_Sender(super.getNumber(), super.getNetworkType());
    }
    public boolean equals(Device d){
        
        if(this.getClass().getName() == d.getClass().getName()){
            if(super.getNumber() == d.getNumber()){
                    return true;
            }
        }
        return false;
    }
    
    public boolean AcceptComs(Comunications c){
        
        C_SMS aux= null;
        
        if(aux.getClass().getName() == c.getClass().getName())
            return true;
        else return false;
    }
}
