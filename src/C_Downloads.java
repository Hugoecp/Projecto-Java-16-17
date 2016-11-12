/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FallenAngel
 */
public class C_Downloads extends Comunications{
    
    private double size;
    private double duration;
    
    public C_Downloads(long on, long dn, long s, long d){
        
        super(on,dn);
        this.size = s;
        this.duration = d;
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
