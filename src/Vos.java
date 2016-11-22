
public class Vos {

   
    public static void main(String[] args) {
     
        
        // Hugo Inicio
        
        Contact test1 = new Contact("Nome1", 911231231);
        Contact test2 = new Contact("Nome2", 911231232);
        Contact test3 = new Contact("Nome3", 911231233);
        Contact test4 = new Contact("Nome4", 911231234);
        Contact test5 = new Contact("Nome5", 911231235);
        Contact test6 = new Contact("Nome6", 911231236);
       
        Device aux1 = new D_Phone(929879877, "3G");
        
        aux1.addContact(test1);
        aux1.addContact(test2);
        aux1.addContact(test3);
        aux1.addContact(test4);
        aux1.addContact(test5);
        aux1.addContact(test6);
        
        Comunications c1 = new C_SMS(929879877,911231231,1,354,"teste1");
        Comunications c2 = new C_SMS(929879877,911231232,0,90,"teste2");
        
        aux1.addLog(c1);
        aux1.addLog(c2);
        
        System.out.println("receive logs");
        aux1.printRlogs();
        System.out.println("send logs");
        aux1.printSlogs();
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
