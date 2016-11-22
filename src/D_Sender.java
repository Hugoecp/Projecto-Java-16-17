import java.util.ArrayList;

public class D_Sender extends Device{
    
    private ArrayList<Contact> cList;
    private ArrayList<Comunications> logs;
    
    public D_Sender(long n, String nt){
        
        super(n,nt);
        this.cList = super.getContact();
        this.logs = super.getLogs();
    }
    
    public D_Sender(D_Sender ds){
        
        super(ds.getNumber(), ds.getNetworkType());
        this.cList = ds.getContact();
        this.logs = ds.getLogs();
    }
    
    public boolean addContact(Contact x){
        
        if(super.getContact().contains(x)){
            return false;
        }else{
            super.getContact().add(x.clone());
        }
        return true;
    }
    public boolean removeContact(Contact y){
        
        if(super.getContact().contains(y)){
            super.getContact().remove(y);
            return true;
        }
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
}
