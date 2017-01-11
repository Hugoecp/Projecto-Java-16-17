public class C_SMS extends Comunications{
    
   
    private double smsSize = 0.0;//tamanho da mensagem
    private String smsBody = "";//respetivo texto da mensagem
    
    public C_SMS(long on, long dn, int c, double size, String body){
        
        super(on, dn, c);//numero 
        this.smsSize = size;
        this.smsBody = body;
    }
    
    public C_SMS(C_SMS c){
        
        super(c.getOriginNumber(), c.getDestinyNumber(), c.getControl());
        this.smsSize = c.getSmsSize();
        this.smsBody = c.getSmsBody();
    }

    public double getSmsSize(){return smsSize;}
    public void setSmsSize(double s){this.smsSize = s;}
    public String getSmsBody(){return smsBody;}
    public void setSmsBody(String s){this.smsBody = s;}
    public String getComType(){return "Mensagem de texto";}


    public double comCost(){return PriceList.getC_SMS();}
    public C_SMS clone(){return new C_SMS(this);}
    public boolean equals(Comunications c){
        
        if(this.getClass().getName().equals(c.getClass().getName())){
            if(super.getOriginNumber() == c.getOriginNumber()){
                if(super.getDestinyNumber() == c.getDestinyNumber()){
                    if(this.smsSize == ((C_SMS)c).smsSize){
                        if(((C_SMS)c).getSmsBody().equals(this.smsBody)){
                            return true;
                        }
                    }
                }    
            }
        }
        return false;
    }
}