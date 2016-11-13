public class C_Acall extends Comunications{
 
    private double duration;
    
    public C_Acall(long on, long dn, double d){
        
        super(on,dn);
        this.duration = d;
    }
    
    public C_Acall(C_Acall c){
        
        super(c.getOriginNumber(), c.getDestinyNumber());
        this.duration = c.getDuration();
    }
    
    public double getDuration(){return this.duration;}
    public void setDuration(double d){this.duration = d;}
    
    public C_Acall clone(){return new C_Acall(this);}
    public boolean equals(Comunications c){
        
        if(this.getClass().getName() == c.getClass().getName()){
            if(super.getOriginNumber() == ((C_Acall)c).getOriginNumber()){
                if(super.getDestinyNumber() == ((C_Acall)c).getDestinyNumber()){
                    if(this.getDuration() == ((C_Acall)c).getDuration()){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
