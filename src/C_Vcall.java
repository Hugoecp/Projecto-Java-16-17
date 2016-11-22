public class C_Vcall extends Comunications{
    
    
    private double duration;
    private String res;
    
    public C_Vcall(long on, long dn, int c, double d, String r){
        
        super(on,dn,c);
        this.duration = d;//duraçao de chamada
        this.res = r;//resoluçao usada
    }
    
    public C_Vcall(C_Vcall c){
        
        super(c.getOriginNumber(), c.getDestinyNumber(), c.getControl());
        this.duration = c.getDuration();
        this.res = c.getRes();
    }
    
    public double getDuration(){return this.duration;}
    public void setDuration(double d){this.duration = d;}
    public String getRes(){return this.res;}
    public void setRed(String r){this.res = r;}
    
    public double transmitRate(){
        
        //TODO criar o metodo
        
        return 0.0;
    }
    
    public C_Vcall clone(){return new C_Vcall(this);}
    public boolean equals(Comunications c){
        
        if(this.getClass().getName() == c.getClass().getName()){
            if(super.getOriginNumber() == ((C_Vcall)c).getOriginNumber()){
                if(super.getDestinyNumber() == ((C_Vcall)c).getDestinyNumber()){
                    if(this.getDuration() == ((C_Vcall)c).getDuration()){
                        if(this.getRes() == ((C_Vcall)c).getRes()){
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
