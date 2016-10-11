public class Contact {
    
    private String name;
    private long number;
    
    public Contact(String n, long nb){
        
        this.name = n;
        this.number = nb;
    }
    
    public Contact(){
        
        this.name = "";
        this.number = 0;
    }
    
    public Contact(Contact c){
        
        c.name = this.name;
        c.number = this.number;
    }
    
    // Getters & Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }
    
    // Methdos

    public String toString() {
        return "Contact{" + "name=" + name + ", number=" + number + '}';
    }
    
    public boolean equals(Contact c){
        
        if(c.equals(this.name) && c.number == this.number)
            return true;
        
        return false;
    }
    
    public Contact clone(){
       return new Contact(this);
    }
}