
import java.util.ArrayList;

public class D_Phone extends Device{
 
    private ArrayList<Contact> cList;
    private ArrayList<Comunications> logs;

    public D_Phone(long n, String nt){
        
        super(n,nt);
        this.cList = new ArrayList<>();
        this.logs = new ArrayList<>();
    }
    
    public D_Phone(D_Phone p){
        
        super(p.getNumber(), p.getNetworkType());
        
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
        for(Comunications c : this.logs){
            temp.add(c.clone());
        }
        return temp;
    }
    public D_Phone clone(){
        return new D_Phone(this);
    }
    public boolean equals(Device d){
        
        if(this.getClass().getName() == ((D_Phone)d).getClass().getName()){
            if(super.getNumber() == ((D_Phone)d).getNumber()){
                return true;
            }
        }
        return false;
    }
}
