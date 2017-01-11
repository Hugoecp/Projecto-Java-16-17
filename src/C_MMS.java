public class C_MMS extends Comunications{
    
  
    private double size;//duração
    private String format;//formato de imagem
    private String res;//resolução
    
    public C_MMS(long on, long dn, int c, double s, String f, String r){
        
        super(on,dn,c);//numero de dispositivo e o destino
        this.size = s;
        this.format = f;
        this.res = r;
    }
    
    public C_MMS(C_MMS c){
        
        super(c.getOriginNumber(), c.getDestinyNumber(), c.getControl());
        this.size = c.getSize();
        this.format = c.getFormat();
        this.res = c.getRes();
    }

    public double getSize(){return this.size;}
    public void setSize(long s){this.size = s;}
    public String getFormat(){return this.format;}
    public void setFormat(String f){this.format = f;}
    public String getRes(){return this.res;}
    public void setRes(String r){this.res = r;}
    
    public double comCost(){return PriceList.getC_MMS();}
    
    public C_MMS clone(){return new C_MMS(this);}
    public boolean equals(Comunications c){//metodo equals
        
        if(this.getClass().getName().equals(c.getClass().getName())){
            if(super.getOriginNumber() == ((C_MMS)c).getOriginNumber()){
                if(super.getDestinyNumber() == ((C_MMS)c).getDestinyNumber()){
                    if(((C_MMS)c).size == this.getSize()){
                        if(((C_MMS)c).format.equals(this.getFormat())){
                            if(((C_MMS)c).res.equals(this.getRes())){
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
