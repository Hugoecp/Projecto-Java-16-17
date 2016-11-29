
import java.io.BufferedReader;
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
            System.out.println("**  1) Adicionar Cliente            **");
            System.out.println("**  2) Lista clientes               **");
            System.out.println("**     existentes                   **");
            System.out.println("**                                  **");
            System.out.println("**                                  **");
            System.out.println("**                                  **");
            System.out.println("**                 0) Back          **");
            System.out.println("**                                  **");
            System.out.println("**************************************");
            System.out.println("**************************************");
       }
    } 
    
    public static class AccountMenu implements HandleMenus{
        
        public void printMenu(){
            
            System.out.println("**************************************");
            System.out.println("**************************************");
            System.out.println("**                                  **");
            System.out.println("**           Contas                 **");
            System.out.println("**                                  **");
            System.out.println("**                                  **");
            System.out.println("**  1) Adicionar Conta              **");
            System.out.println("**  2) Listar contas de             **");
            System.out.println("**     um cliente                   **");
            System.out.println("**                                  **");
            System.out.println("**                                  **");
            System.out.println("**                                  **");
            System.out.println("**                 0) Back          **");
            System.out.println("**                                  **");
            System.out.println("**************************************");
            System.out.println("**************************************");
        }
    }
    
    public static class AccountSubMenu implements HandleMenus{
        
        public void printMenu(){
            
            System.out.println("**************************************");
            System.out.println("**************************************");
            System.out.println("**                                  **");
            System.out.println("**         Lista de Contas          **");
            System.out.println("**                                  **");
            System.out.println("**                                  **");
            System.out.println("**  1) Por ID de Conta              **");
            System.out.println("**  2) Por cliente escolhido de     **");
            System.out.println("**     uma lista existente          **");
            System.out.println("**                                  **");
            System.out.println("**                                  **");
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
    
    public static void holdEnterCont(){ 
        System.out.print("");
        try{System.in.read();}  
        catch(Exception e){}  
 }
    
    public static void listClient(ArrayList<Client> c){
        int index=0;
        for(Client aux : c){
            System.out.println(++index + ": O cliente: " 
                    + aux.getName() + " com o ID: " + aux.getId());
        }
    }
    
    public static void addClient(ArrayList<Client> c, BufferedReader input){
        
        String nome="";
        System.out.println("Insira o nome do cliente: ");
        try{
            nome = input.readLine();
        }catch(IOException ex){
            ex.printStackTrace();
        }
        Client temp = new Client(nome);
        c.add(temp.clone());
        System.out.println("Cliente " + nome + " com o ID " + temp.getId() + " criado.");
    }
    
    public static void addAccount(BufferedReader input, ArrayList<Client> c){
        
        System.out.println("Escolha o cliente para o qual vai adicionar a conta:");
        listClient(c);
        System.out.println((c.size()+1) + ": adicionar novo cliente.");
        holdEnterCont();
        
        boolean rerun = true;
        String option;
        int userChoice = -1;
        int max = c.size() + 1;
        while(rerun){
            try{
                option = input.readLine();
                userChoice = Integer.parseInt(option);
                if((userChoice < max) && (userChoice >= 1)){ //TODO Algo mto esquisito se passa nesta funcao.
                    rerun = false;
            }else{
                System.out.println("Opcao invalida. Apenas numeros de 1-"
                + max + ".");
            }
            }catch (IOException ex){
                ex.printStackTrace();
            }catch(NumberFormatException ex2){
                System.out.println("Opcao invalida. Apenas numeros de 1-"
                    + max + ".");
            }
        }
        if(userChoice == max){
            addClient(c,input);
        }else{
            long temp;
            temp = c.get(userChoice-1).getId();
            System.out.println("- " + temp +" -");
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
    
    public static boolean callMainMenu(BufferedReader input, ArrayList<Client> c){
        
        // Variaveis de Controlo de Menus para Parametros de funcoes
        
        HandleMenus mainMenu = new MainMenu();
        HandleMenus clientMenu = new ClientMenu();
        HandleMenus accountMenu = new AccountMenu();
        HandleMenus accountSubMenu = new AccountSubMenu();
        
        int userChoice = ControlInput(5,mainMenu,input);
        int choice = -1;
        
        switch(userChoice){
            
            case 0: System.out.println("A guardar e a sair.");
                    return false;
            
            case 1: choice = ControlInput(2,clientMenu,input);
                    switch(choice){
                        
                        case 1:addClient(c, input);
                                holdEnterCont();
                                break;
                        case 2: listClient(c);
                                holdEnterCont();
                                break;
                        default: break;
                    }
                    
                    break;
            case 2: choice = ControlInput(2,accountMenu,input);
                    switch(choice){
                        case 1: addAccount(input, c);
                                
                                break;
                        case 2: choice = ControlInput(2,accountSubMenu,input);
                                switch(choice){
                                    case 0: return false;

                                    case 1: 
                                            break;
                                        
                                    case 2: 
                                            break;
                                    
                                    default: break;
                                }
                    }
                    break;
                    
            case 3: //choice = ControlInput(,,input);
                    break;
            
            case 4: //choice = ControlInput(,,input);
                    break;
            
            case 5: //choice = ControlInput(,,input);
                    break;
            
            default: callMainMenu(input, c);
        }
        
        
        return true;
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
        
        
        ArrayList<Client> ClientList = new ArrayList<Client>();
        
        boolean rerun = true;
        while(rerun){
            rerun = callMainMenu(input, ClientList);
        }
        try{
            input.close();
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
    
}
