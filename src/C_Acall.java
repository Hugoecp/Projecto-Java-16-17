public class C_Acall extends Comunications{
    
    private double duration; // In minutes
    
    public C_Acall(long on, long dn, int c ,double d){
        
        super(on,dn,c);
        this.duration = d;//duração de chamada
    }
    
    public C_Acall(C_Acall c){
        
        super(c.getOriginNumber(), c.getDestinyNumber(),c.getControl());
        this.duration = c.getDuration();
    }
    
    public double getDuration(){return this.duration;}
    public void setDuration(double d){this.duration = d;}
    public String getComType(){return "Chamada Audio";}
    
    public double comCost(){        
        return (this.duration/60) * PriceList.getC_Acall();
    }
    public C_Acall clone(){return new C_Acall(this);}
    public boolean equals(Comunications c){
        
        if(this.getClass().getName().equals(c.getClass().getName())){
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
