
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Vos {

    // Hugo Inicio
    
    public static void listClient(ArrayList<Client> c){
            
            for(Client aux : c){
                System.out.println("O cliente: " + aux.getName() + " com o ID: " 
                + aux.getId());
            }
            
    }
    
    public static int ControlInput(int max, int m, BufferedReader input){
        
        int userChoice = -1;
        String cliReader;
        boolean rerun = true; 
        HandleMenus menu = new HandleMenus();
        menu.callMenu(m);
        
        while(rerun){
            try{
                cliReader = input.readLine();
                userChoice = Integer.parseInt(cliReader);
                if(userChoice <= max && userChoice >= 0){
                    rerun = false;
            }else{
                
                    System.out.println("Opcao invalida. Apenas numeros de 0-"
                    + max + ".");
                }
            }catch (IOException ex){
                ex.printStackTrace();
            }catch(NumberFormatException ex2){
                menu.callMenu(m);
                System.out.println("Opcao invalida. Apenas numeros de 0-"
                    + max + ".");
            }
        }
        return userChoice;
    }
    
    // Hugo Fim

    // Tiago Inicio


    // Tiago Fim

    // Gusto inicio

    // Gusto fim

    public static void main(String[] args) {
     
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in)); 
        HandleMenus callmenu = new HandleMenus();
        ControlInput(5,1,input);
        
        ArrayList<Client> ListClientes = new ArrayList<Client>();
        
        
        
        
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
