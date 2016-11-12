
import java.util.ArrayList;

public class D_Phone extends Device{
 
    private ArrayList<Contact> cList;
    private ArrayList<Comunications> logs;

    public D_Phone(long n, String nt){
        
        super(n,nt);
        this.cList = new ArrayList<>();
        this.logs = new ArrayList<>();
    }
    
    
    
    
}
