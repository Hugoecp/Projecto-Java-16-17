
public class C_VMMS extends Comunications implements Byteable{
    
    private String res;
    private String format;
    private double duration;
    
    public C_VMMS(long on, long ds, int c, String r, String f, double d){
        
        super(on,ds,c);
        this.res = f;
        this.format = f;
        this.duration = d;
    }
    
    public C_VMMS(C_VMMS c){
        
        super(c.getOriginNumber(), c.getDestinyNumber(), c.getControl());
        this.res = c.getRes();
        this.format = c.getFormat();
        this.duration = c.getDuration();
    }

    public String getRes(){return res;}
    public void setRes(String res){this.res = res;}
    public String getFormat(){return format;}
    public void setFormat(String format){this.format = format;}
    public double getDuration(){return duration;}
    public void setDuration(double duration) {this.duration = duration;}
    
    public double transmitRate(){
        
        //TODO criar o metodo
        
        return 0.0;
    }
        
    public double comCost(){return PriceList.getC_VMMS();}
    public C_VMMS clone(){return new C_VMMS(this);}
    public boolean equals(Comunications c){
        
        if(this.getClass().getName().equals(c.getClass().getName())){
            if(super.getOriginNumber() == ((C_VMMS)c).getOriginNumber()){
                if(super.getDestinyNumber() == ((C_VMMS)c).getDestinyNumber()){
                    if(this.res.equals(((C_VMMS)c).getRes())){
                        if(this.format.equals(((C_VMMS)c).getFormat())){
                            if(this.duration == ((C_VMMS)c).getDuration()){
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}

