public class C_Vcall extends Comunications implements Byteable{
    
    
    private double duration;
    private String res;
    private double size = Math.random();
    
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
    public String getComType(){return "Chamada de video";}
    
    public double transmitRate(){
        return this.size/(this.duration/60);}
    public double DownloadSize(){return this.size;}
    public double comCost(){return this.duration*PriceList.getC_Vcall();}
    public C_Vcall clone(){return new C_Vcall(this);}
    public boolean equals(Comunications c){
        
        if(this.getClass().getName().equals(c.getClass().getName())){
            if(super.getOriginNumber() == ((C_Vcall)c).getOriginNumber()){
                if(super.getDestinyNumber() == ((C_Vcall)c).getDestinyNumber()){
                    if(this.getDuration() == ((C_Vcall)c).getDuration()){
                        if(this.getRes().equals(((C_Vcall)c).getRes())){
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
