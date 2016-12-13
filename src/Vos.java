
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Vos implements Serializable{

    // Hugo Inicio
       
    
    // MENUS
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
    
    // FIM MENUS
    
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
        System.out.print(": ");
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
        
        boolean rerun = true;
        String option;
        long cltid = -1;
        
        while(rerun){
            try{
                System.out.println("Insira o ID do cliente:");
                cltid = Long.parseLong(input.readLine());
                for(Client aux: c){
                    if(aux.getId() == cltid){
                        Account temp = new Account();
                        aux.addAccount(temp.clone());
                        System.out.println("Conta com o ID " + temp.getID() + 
                                " criada no cliente " + aux.getName() + ".");
                        holdEnterCont();
                        return;
                    }
                }
                System.out.println("O ID inserido não existe. " + 
                        "Quer tentar novamente? (S/N)");
                
                boolean flag = true;
                while(flag){
                    option = input.readLine();
                    switch (option) {
                        case "S":
                        case "s":
                        case "Sim":
                        case "sim":
                            flag = false;
                            break;
                        case "N":
                        case "n":
                        case "Nao":
                        case "nao":
                            return;
                        default:
                            System.out.print("Erro! Opcões disponiveis: ");
                            System.out.println("S; s; Sim; sim ou N; n; Nao; nao");
                            break;
                    }
                }
            }catch(IOException ex){
                ex.printStackTrace();
            }catch(NumberFormatException ex2){
                System.out.println("ERRO! O ID do cliente é composto por numeros apenas.");
            }
        }
    }
    
    public static void ListAccByCltid(BufferedReader input, ArrayList<Client> c){
        
        boolean rerun = true;
        long id = -1;
        
        while(rerun){
            try{
                System.out.println("Insira o ID do cliente:");
                id = Long.parseLong(input.readLine());
                for(Client temp : c){
                    if(temp.getId() == id){
                        if(temp.getAccs().isEmpty()){
                            System.out.println("O cliente nao tem ainda contas criadas.");
                            holdEnterCont();
                            return;
                        }else{
                        System.out.println("O cliente " + temp.getName() + 
                            " com o ID " + temp.getId() + 
                            " tem as seguinte(s) conta(s):");
                        for(Account aux : temp.getAccs()){
                            System.out.println("A conta " + aux.getID() + " com " 
                                + aux.getDevList().size() + " dispositivos");
                        }         
                        }
                    }
                }
                    holdEnterCont();
                    return;
            }catch(IOException ex){
                ex.printStackTrace();
            }catch(NumberFormatException ex2){
                System.out.println("Erro! ID de cliente é composto por numeros!");
            }
        }
    }
    
    public static void ManageAccountMenu(ArrayList<Client> c, BufferedReader input){
     
        HandleMenus accountMenu = new AccountMenu();
        
        int choice = ControlInput(2,accountMenu,input);
        
        switch(choice){
            
            case 0: break;
            case 1:
                    if(c.isEmpty()){
                        System.out.println("Lista de clientes vazia. Uma conta tem que ser");
                        System.out.println("associada a um cliente existente. Crie primeiro um cliente.");
                        holdEnterCont();
                        break;
                    }
                    addAccount(input, c);
                    break;
            case 2: if(c.isEmpty()){
                        System.out.println("Lista de clientes vazia. Uma conta tem que ser");
                        System.out.println("associada a um cliente existente. Crie primeiro um cliente.");
                        holdEnterCont();
                        break;
                    }else{
                        ListAccByCltid(input, c);
                        break;
                    }
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
    
    public static boolean callMainMenu(String fx, BufferedReader input, ArrayList<Client> c){
        
        // Variaveis de Controlo de Menus para Parametros de funcoes
        
        HandleMenus mainMenu = new MainMenu();
        HandleMenus clientMenu = new ClientMenu();
        
        
        int userChoice = ControlInput(5,mainMenu,input);
        int choice = -1;
        
        
        switch(userChoice){
            
            case 0: try
                    {
                    FileOutputStream file = new FileOutputStream(fx);
                    ObjectOutputStream out = new ObjectOutputStream(file);
                    out.writeObject(c);
                    out.flush();
                    out.close();
                    }catch(FileNotFoundException e){
                        System.out.println("Nome do fx nao esta correcto!! "); 
                    }catch(IOException e){
                        e.printStackTrace();
                        System.out.println("Problemas de I/O ..."); 
                    }

                
                System.out.println("A guardar e a sair.");
                    return false;
            
            case 1: choice = ControlInput(2,clientMenu,input);
                    switch(choice){
                        
                        case 1: addClient(c, input);
                                holdEnterCont();
                                break;
                        case 2: listClient(c);
                                holdEnterCont();
                                break;
                        default: break;
                    }
                    
                    break;
            case 2: ManageAccountMenu(c,input);
                    break;
                    
            case 3: //choice = ControlInput(,,input);
                    break;
            
            case 4: //choice = ControlInput(,,input);
                    break;
            
            case 5: //choice = ControlInput(,,input);
                    break;
            
            default: callMainMenu(fx, input, c);
        }
        
        
        return true;
    }
    
    /** public static void readFromFile(String fname, BufferedReader input, ArrayList<Client> c){
        try
	{
            FileInputStream f = new FileInputStream(fname);
            ObjectInputStream in = new ObjectInputStream(f);
            
            for(Client aux : c){
                aux = (Client)in.readObject();
                c.add(aux);
            }   
            in.close();
	}
	catch(ClassNotFoundException e)
	{ System.out.println("Classe do objecto lido nao existe !!"); }
	catch(FileNotFoundException e)
	{ System.out.println("Nome do fx nao esta correcto!! "); }
	catch(IOException e)
	{ System.out.println("Problemas de I/O ...");}
    } **/
    // Hugo Fim

    // Tiago Inicio

    public static void readFromFile(String fname, BufferedReader input, ArrayList<Client> c){
        try
	{
            FileInputStream f = new FileInputStream(fname);
            ObjectInputStream in = new ObjectInputStream(f);
            
            c.addAll((ArrayList)in.readObject());
            
            /*for(Client aux : c){
                aux = (Client)in.readObject();
                c.add(aux);
            }*/   
            f.close();
	}
	catch(ClassNotFoundException e)
	{ System.out.println("Classe do objecto lido nao existe !!"); }
	catch(FileNotFoundException e)
	{ System.out.println("Nome do fx nao esta correcto!! "); }
	catch(IOException e)
	{ System.out.println("Problemas de I/O ...");}
    }

    // Tiago Fim

    // Gusto inicio
    
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
        String fname = "VosSave.lib";
        readFromFile(fname, input,ClientList);
        
        boolean rerun = true;
        while(rerun){
            rerun = callMainMenu(fname, input, ClientList);
        }
        try{
            input.close();
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
    
}
