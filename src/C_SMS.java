public class C_SMS extends Comunications{
    
    private double smsSize = 0.0;
    private String smsBody = "";
    
    
    public C_SMS(long on, long dn, double size, String body){
        
        super(on, dn);
        this.smsSize = size;
        this.smsBody = body;
    }
    
    public C_SMS(C_SMS c){
        
        super(c.getOriginNumber(), c.getDestinyNumber());
        this.smsSize = c.getSmsSize();
        this.smsBody = c.getSmsBody();
        
    }

    public double getSmsSize() {
        return smsSize;
    }

    public void setSmsSize(double smsSize) {
        this.smsSize = smsSize;
    }

    public String getSmsBody() {
        return smsBody;
    }

    public void setSmsBody(String smsBody) {
        this.smsBody = smsBody;
    }
    
    public C_SMS clone(){
        return new C_SMS(this);
    }
    
    public boolean equals(Comunications c){
        
        if(this.getClass().getName() == c.getClass().getName()){
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
