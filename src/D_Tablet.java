
import java.util.ArrayList;

public class D_Tablet extends Device{
    private ArrayList<Contact> list;
    private ArrayList<Comunications> logs;
    
    public D_Tablet (long n, String nt)
    {
        super(n, nt);
        this.list = new ArrayList<Contact>();
    }
    
    public D_Tablet (D_Tablet t)
    {
        super(t.getNumber(),t.getNetworkType());
        this.list = t.getCList();
        this.logs = t.getLogs();
    }
    
    public ArrayList<Contact> getCList()
    {
        ArrayList<Contact> temp = new ArrayList<Contact>();
        for(Contact c : this.list)
        {
            temp.add(c.clone());
        }        
        return temp;
    }
    
    public ArrayList<Comunications> getLogs()
    {
        ArrayList<Comunications> temp = new ArrayList<Comunications>();
        for(Comunications c : this.logs)
        {
            temp.add(c.clone());
        }
        return temp;
    }
    
    public boolean equals(Device t)
    {
        if(this.getClass().getName() == t.getClass().getName())
            if(super.getNumber() == t.getNumber())
                return true;
        return false;
    }
    
    public D_Tablet clone()
    {
        return new D_Tablet(this);
    }
}
