
import java.io.Serializable;

public class Contact implements Serializable{
    
    private String name;//nome do contacto
    private long number;//numero do contacto
    
    public Contact(String n, long nb){
        
        this.name = n;
        this.number = nb;
    }
    
    public Contact(){
        
        this.name = "";
        this.number = 0;
    }
    
    public Contact(Contact c){
        
        this.name = c.getName();
        this.number = c.getNumber();
    }
    
    // Getters & Setters

    public String getName(){return this.name;}
    public void setName(String name){this.name = name;}
    public long getNumber(){return this.number;}
    public void setNumber(long number){this.number = number;}
    
    
    // Methdos
    public String toString() {
        return "Contact{" + "name=" + name + ", number=" + number + '}';
    }
    
    public int compare(Contact c1, Contact c2){
        return c1.getName().compareTo(c2.getName());
    }
    public boolean equals(Contact c){
        
        if(c.equals(this.getName()) && c.number == this.getNumber())
            return true;
        
        return false;
    }
    
    public Contact clone(){
       return new Contact(this);
    }

    
}
