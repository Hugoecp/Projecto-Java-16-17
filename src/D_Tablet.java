import java.util.ArrayList;

public class D_Tablet extends Device{
    
    private ArrayList<Contact> cList;
    private ArrayList<Comunications> logs;
    
    public D_Tablet (long n, String nt){
        
        super(n, nt);
        this.cList = super.getContact();
        this.logs = super.getLogs();
        }
    
    public D_Tablet (D_Tablet t){
        
        super(t.getNumber(),t.getNetworkType());
        this.cList = t.getCList();
        this.logs = t.getLogs();
    }
    
    public ArrayList<Contact> getCList()
    {
        ArrayList<Contact> temp = new ArrayList<Contact>();
        for(Contact c : super.getContact())
        {
            temp.add(c.clone());
        }        
        return temp;
    }
    
    public ArrayList<Comunications> getLogs()
    {
        ArrayList<Comunications> temp = new ArrayList<Comunications>();
        for(Comunications c : super.getLogs())
        {
            temp.add(c.clone());
        }
        return temp;
    }
    
    public boolean addContact(Contact x)
    {
        if(super.getContact().contains(x))
            return false;
        else
        {
            super.getContact().add(x);
            return true;
        }
    }
    
    public boolean removeContact(Contact x)
    {
            if(super.getContact().contains(x))
            {
                super.getContact().remove(x);
                return true;
            }
            else
                return false;
    }
    
    public void printRlogs(){
        
        for(Comunications aux : super.getLogs()){
            if(aux.getControl() == 0)
                System.out.println("Numero: " + aux.getOriginNumber() + 
                        " - " + aux.getClass().getName());
        }
    }
    
    public void printSlogs(){
        
        for(Comunications aux : super.getLogs()){
            if(aux.getControl() == 1)
                System.out.println("Numero: " + aux.getDestinyNumber() + 
                        " - " + aux.getClass().getName());
        }
    }
    
    public boolean equals(Device t)
    {
        if(this.getClass().getName().equals(t.getClass().getName()))
            if(super.getNumber() == t.getNumber())
                return true;
        return false;
    }
    
    public D_Tablet clone(){return new D_Tablet(this);}
}