public class C_MMS extends Comunications{
    
  
    private long size;//duração
    private String format;//formato de imagem
    private String res;//resolução
    
    public C_MMS(long on, long dn, long s, String f, String r){
        
        super(on,dn);//numero de dispositivo e o destino
        this.size = s;
        this.format = f;
        this.res = r;
    }
    
    public C_MMS(C_MMS c){
        
        super(c.getOriginNumber(), c.getDestinyNumber());
        this.size = c.getSize();
        this.format = c.getFormat();
        this.res = c.getRes();
    }

    public long getSize() {
        return size;
    }
    public void setSize(long size) {
        this.size = size;
    }
    public String getFormat() {
        return format;
    }
    public void setFormat(String format) {
        this.format = format;
    }
    public String getRes() {
        return res;
    }
    public void setRes(String res) {
        this.res = res;
    }
    
    public C_MMS clone(){return new C_MMS(this);}
    public boolean equals(Comunications c){//metodo equals
        
        if(this.getClass().getName() == c.getClass().getName()){
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
