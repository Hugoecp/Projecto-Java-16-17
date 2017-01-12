public class C_Downloads extends Comunications implements Byteable{

    private double size; // em bytes
    private double duration; //em minutos
    
    public C_Downloads(long on, int c,  double s, double d){
        
        super(on,119,c);
        this.size = s;//tamanho do programa em bytes descarregado
        this.duration = d;//duração do download
    }
    
    public C_Downloads(C_Downloads c){
        
        super(c.getOriginNumber(), c.getDestinyNumber(), c.getControl());
        this.size = c.getSize();
        this.duration = c.getDuration();
    }

    public double getSize(){return this.size;}
    public void setSize(double size){this.size = size;}
    public double getDuration(){return this.duration;}
    public void setDuration(double duration){this.duration = duration;}
    public String getComType(){return "Descarga";}
    
    public double transmitRate(){
        return this.size/(this.duration/60);}
    public double DownloadSize(){return this.size;}
        
    
    public double comCost()
        {return ((this.size/209715200)*PriceList.getC_Downloads());} //custo por cada 200MB
    
    public C_Downloads clone(){return new C_Downloads(this);}
    public boolean equals(Comunications c){
        
        if(this.getClass().getName().equals(((C_Downloads)c).getClass().getName())){
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
