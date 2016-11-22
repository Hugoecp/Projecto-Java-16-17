
public class Vos {

   
    public static void main(String[] args) {
     
        
        // Hugo Inicio
        
        Contact test1 = new Contact("Nome1", 911231231);
        Contact test2 = new Contact("Nome2", 911231232);
        Contact test3 = new Contact("Nome3", 911231233);
        Contact test4 = new Contact("Nome4", 911231234);
        Contact test5 = new Contact("Nome5", 911231235);
        Contact test6 = new Contact("Nome6", 911231236);
       
        D_Phone aux1 = new D_Phone(929879877, "3G");
        D_Tablet aux2 = new D_Tablet(914143078, "4G");
        
        aux1.addContact(test1);
        aux1.addContact(test2);
        aux1.addContact(test3);
        aux1.addContact(test4);
        aux2.addContact(test5);
        aux2.addContact(test6);
        
        C_SMS c1 = new C_SMS(929879877,911231231,1,354,"teste1");
        C_SMS c2 = new C_SMS(929879877,911231232,0,90,"teste2");
        C_Downloads c3 = new C_Downloads(929879877,1,341343, 0.8);
        
        aux1.addLog(c1);
        aux1.addLog(c2);
        aux2.addLog(c3);
        
        System.out.println("receive logs");
        aux1.printRlogs();
        System.out.println("send logs tablet");
        aux2.printSlogs();
        System.out.println("send logs telm");        
        aux1.printSlogs();
        System.out.println("bytable");
        
        System.out.println(" " + Math.round(c3.transmitRate()/8) + " bps");
        
        
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
