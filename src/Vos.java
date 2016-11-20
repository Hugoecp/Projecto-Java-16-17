
public class Vos {

   
    public static void main(String[] args) {
     
        
        // Hugo Inicio
        
        Account test = new Account();
        Device temp = new D_Phone(913453452,"4G");
        test.addDevice(temp);
        
        
        if(test.removeDevice(temp) == true){
            System.out.println("OK\n");
        }
        else{
            System.out.println("Erro\n");
        }
        
        // Hugo Fim
        
        /** Tiago Inicio
        
        */// Tiago Fim
        
        /** Gusto inicio
        
        */// Gusto fim
        
        
        
        
        
    }
    
}
