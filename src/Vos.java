
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.ArrayList;

public class Vos implements Serializable{

    // Hugo Inicio
       
    public static class MainMenu implements HandleMenus{
        
        @Override
        public void printMenu(){
           
        System.out.println("******************************************");
        System.out.println("******************************************");
        System.out.println("**                                      **");
        System.out.println("**                   Vos                **");
        System.out.println("**                                      **");
        System.out.println("**    Main Menu                         **");
        System.out.println("**                                      **");
        System.out.println("**  1) Clientes                         **");
        System.out.println("**  2) Contas                           **");
        System.out.println("**  3) Dispositivos                     **");
        System.out.println("**  4) Comunicações                     **");
        System.out.println("**  5) Facturação                       **");
        System.out.println("**                                      **");
        System.out.println("**                 0) Guardar e sair    **");
        System.out.println("**                                      **");
        System.out.println("******************************************");
        System.out.println("******************************************");
       }
    }
    
    public static class ClientMenu implements HandleMenus{
        
        @Override
        public void printMenu(){
        
            System.out.println("**************************************");
            System.out.println("**************************************");
            System.out.println("**                                  **");
            System.out.println("**          Cliente                 **");
            System.out.println("**                                  **");
            System.out.println("**                                  **");
            System.out.println("**  1) ????????                     **");
            System.out.println("**  2) ??????????                   **");
            System.out.println("**  3) ??????????                   **");
            System.out.println("**  4) ??????????                   **");
            System.out.println("**  5) ??????????                   **");
            System.out.println("**                                  **");
            System.out.println("**                 0) Back          **");
            System.out.println("**                                  **");
            System.out.println("**************************************");
            System.out.println("**************************************");
       }
    }   
    
    public static int ControlInput(int max, HandleMenus menu, BufferedReader input){
        
        int userChoice = -1;
        String cliReader;
        boolean rerun = true; 
        
        if(menu !=null)
            menu.printMenu();
        
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
                System.out.println("Opcao invalida. Apenas numeros de 0-"
                    + max + ".");
            }
        }
        return userChoice;
    }
    
    public static void listClient(ArrayList<Client> c){
        for(Client aux : c){
            System.out.println("O cliente: " + aux.getName() + " com o ID: " 
            + aux.getId());
        }
    }
    
    public static boolean setPriceList(double d,int x){
        
        switch(x){
            
            case 0: PriceList.setC_Acall(d);
                    return true;
            case 1: PriceList.setC_Downloads(d);
                    return true;
            case 2: PriceList.setC_MMS(d);
                    return true;
            case 3: PriceList.setC_SMS(d);
                    return true;
            case 4: PriceList.setC_VMMS(d);
                    return true;
            case 5: PriceList.setC_Vcall(d);
                    return false;
            default: return false;
        }
    }
    // Hugo Fim

    // Tiago Inicio


    // Tiago Fim

    // Gusto inicio
    /**
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
     * @param args
     */
    // Gusto fim

    
    
    public static void main(String[] args){
        
        BufferedReader input = new BufferedReader(
                new InputStreamReader(System.in)); 
        
        // parte do codigo que corre sempre que o programa é executado para
        // popular a lista dos precos.
        String filename = "pricelist.txt";
        double priceparser;
        try{
            BufferedReader file = new BufferedReader(new FileReader(filename));
            try{
                String line = null;
                boolean rerun = true;
                int i=0;
                while (rerun){
                    line = file.readLine();
                    priceparser = Double.parseDouble(line);
                    rerun =  setPriceList(priceparser,i);
                    i++;
                }
                        
            }catch(IOException ex){
                ex.printStackTrace();
            }
        }catch(IOException ex2){
                    ex2.printStackTrace();
        }
        
        // Variaveis de Controlo de Menus para Parametros de funcoes
        HandleMenus mainMenu = new MainMenu();
        HandleMenus clientMenu = new ClientMenu();
        
        ArrayList<Client> ListClientes = new ArrayList<Client>();
        
        int userChoice = ControlInput(5,mainMenu,input); // 1a chamada ao Menu Principal
        int choice = -1;
        
        switch(userChoice){
            
            case 0: System.out.println("A guardar e a sair.");
                    break;
            
            case 1: choice = ControlInput(5,clientMenu,input);
                    
                    break;
            case 2: //choice = ControlInput(,,input);
                    break;
                    
            case 3: //choice = ControlInput(,,input);
                    break;
            
            case 4: //choice = ControlInput(,,input);
                    break;
            
            case 5: //choice = ControlInput(,,input);
                    break;
            
            default://choice == ControlInput(5,mainMenu,input);
                    break;
        }
        
        try{
            input.close();
        }catch(IOException ex){
            ex.printStackTrace();
        }
        
    }
    
}
