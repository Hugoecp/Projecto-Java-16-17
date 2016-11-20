
import java.util.ArrayList;

public class D_Phone extends Device{
 
    private ArrayList<Contact> cList;
    private ArrayList<Comunications> logs;

    public D_Phone(long n, String nt){
        
        super(n,nt);
        this.cList = new ArrayList<Contact>();
        this.logs = new ArrayList<Comunications>();
    }
    
    public D_Phone(D_Phone p){
        
        super(p.getNumber(), p.getNetworkType());
        this.cList = p.getCList();
        this.logs = p.getLogs();
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
    @Override
    public D_Phone clone(){
        return new D_Phone(this);
    }
    @Override
    public boolean equals(Device d){
        
        if(this.getClass().getName().equals(d.getClass().getName())){
            if(super.getNumber() == d.getNumber()){
                return true;
            }
        }
        return false;
    }
}
