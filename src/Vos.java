
public class Vos {

   
    public static void main(String[] args) {
     
        
        // Hugo Inicio
        
        Account test = new Account();
        Device temp = new D_Phone(913453452,"4G");
        Device temp2 = new D_Phone(913453452,"4G");
        Device temp3 = new D_Phone(913453452,"4G");
        Device temp4 = new D_Phone(913453452,"4G");
        test.addDevice(temp);
        test.addDevice(temp2);
        test.addDevice(temp3);
        test.addDevice(temp4);
        
        
        if(test.removeDevice(temp) == true){
            System.out.println("OK\n");
        }
        else{
            System.out.println("Erro\n");
        }
        
        // Hugo Fim
        
        /** Tiago Inicio
        
        * 
        * 
        */// Tiago Fim
        
        /** Gusto inicio
        
        * 
        * 
        */// Gusto fim
        
        
        
        
        
    }
    
}
