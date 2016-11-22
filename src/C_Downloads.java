public class C_Downloads extends Comunications{

    private double size;
    private double duration;
    
    public C_Downloads(long on, long s, int c, long d){
        
        super(on,119,c);
        this.size = s;//tamanho do programa em byts descarregado
        this.duration = d;//duração do download
    }
    
    public C_Downloads(C_Downloads c){
        
        super(c.getOriginNumber(), c.getDestinyNumber(), c.getControl());
        this.size = c.getSize();
        this.duration = c.getDuration();
    }

    public double getSize(){return size;}
    public void setSize(double size){this.size = size;}
    public double getDuration(){return duration;}
    public void setDuration(double duration){this.duration = duration;}
    
    public C_Downloads clone(){return new C_Downloads(this);}
    public boolean equals(Comunications c){
        
        if(this.getClass().getName() == ((C_Downloads)c).getClass().getName()){
            if(super.getOriginNumber() == ((C_Downloads)c).getOriginNumber()){
                if(super.getDestinyNumber() == ((C_Downloads)c).getDestinyNumber()){
                    if(this.getSize() == ((C_Downloads)c).getSize()){
                        if(this.getDuration() == ((C_Downloads)c).getDuration()){
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
