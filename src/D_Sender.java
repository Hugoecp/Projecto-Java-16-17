

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FallenAngel
 */
public class D_Sender extends Device{
    
    public D_Sender(long n, String nt){
        super(n,nt);
    }
    
    public D_Sender(D_Sender ds){
        
        super(ds.getNumber(), ds.getNetworkType());
    }
    
    public D_Sender clone(){
        return new D_Sender(super.getNumber(), super.getNetworkType());
    }
    public boolean equals(Device d){
        
        if(this.getClass().getName() == ((D_Sender)d).getClass().getName()){
            if(super.getNumber() == ((D_Sender)d).getNumber()){
                if(super.getNetworkType() == ((D_Sender)d).getNetworkType()){
                    return true;
                }
            }
        }
        return false;
    }
}
