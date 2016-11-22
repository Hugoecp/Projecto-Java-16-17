public class C_Downloads extends Comunications{

    private static double COST = 0.12;
    
    private double size;
    private double duration;
    
    public C_Downloads(long on, long s, long d){
        
        super(on,119);
        this.size = s;//tamanho do programa em byts descarregado
        this.duration = d;//duração do download
    }
    
    public C_Downloads(C_Downloads c){
        
        super(c.getOriginNumber(), c.getDestinyNumber());
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
