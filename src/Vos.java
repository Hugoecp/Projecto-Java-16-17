
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
import java.util.HashMap;

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
    
    public static class DeviceMenu implements HandleMenus{
        
        public void printMenu(){
            
            System.out.println("**************************************");
            System.out.println("**************************************");
            System.out.println("**                                  **");
            System.out.println("**           Dispositivos           **");
            System.out.println("**                                  **");
            System.out.println("**                                  **");
            System.out.println("**  1) Adicionar dispositivo        **");
            System.out.println("**  2) Listar dispositivos de       **");
            System.out.println("**     uma conta                    **");
            System.out.println("**  3) Listar dispositivos por      **");
            System.out.println("**     tipo de rede                 **");
            System.out.println("**  4) Adicionar um contacto        **");
            System.out.println("**                                  **");
            System.out.println("**                                  **");
            System.out.println("**                 0) Back          **");
            System.out.println("**                                  **");
            System.out.println("**************************************");
            System.out.println("**************************************");
        }
    }
    
    public static class DeviceTypeMenu implements HandleMenus{
        
        public void printMenu(){
            
            System.out.println("Que tipo de dispositivo quer adicionar?");
            System.out.println("1: Sender");
            System.out.println("2: Telemovel");
            System.out.println("3: Tablet");
        }
    }
    
    public static class NetworkTypeMenu implements HandleMenus{
        
        public void printMenu(){
            
            System.out.println("Qual a capacidade de rede do dispositivo");
            System.out.println("1: 2G");
            System.out.println("2: 3G");
            System.out.println("3: 4G");
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
    
    public static int ControlInputNoBackButton(int max, HandleMenus menu, BufferedReader input){
        
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
        return userChoice;
    }
    
    public static void holdEnterCont(){ 
        System.out.print(": ");
        try{System.in.read();}  
        catch(Exception e){}  
 }
    
    public static void listClient(HashMap<Long,Client> c){
        int index=0;
        for(Long id : c.keySet()){
            System.out.println(++index + ": O cliente: " 
                    + c.get(id).getName() + " com o ID: " + id);
        }
    }
    
    public static void addClient(HashMap<Long, Client> c, BufferedReader input){
        
        boolean rerun = true;
        String nome="";
        System.out.println("Insira o nome do cliente: ");
        try{
            while(rerun){
                System.out.print(":");
                nome = input.readLine();
                if(nome != null && !nome.isEmpty() && !nome.startsWith(" ")){
                    rerun = false;                    
                }else{
                    System.out.println("Nome invalido!");
                }
            }
        }catch(IOException ex){
            ex.printStackTrace();
        }catch(IllegalArgumentException ex){
            System.out.println("Nome invalido");
        }
        Client temp = new Client(nome);
        c.put(temp.getId(), temp);
        System.out.println("Cliente " + nome + " com o ID " + temp.getId() + " criado.");
    }
    
    public static void addAccount(BufferedReader input, HashMap<Long,Client> c){
        
        boolean rerun = true;
        String option;
        long cltid = -1;
        
        while(rerun){
            try{
                System.out.println("Insira o ID do cliente:");
                cltid = Long.parseLong(input.readLine());
                if(c.containsKey(cltid)){
                        Account temp = new Account();
                        c.get(cltid).addAccount(temp);
                        System.out.println("Conta com o ID " + temp.getID() + 
                                " criada no cliente " + c.get(cltid).getName() + ".");
                        holdEnterCont();
                        rerun = false;
                    }else{
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
                    }
            }catch(IOException ex){
                ex.printStackTrace();
            }catch(NumberFormatException ex2){
                System.out.println("ERRO! O ID do cliente é composto por numeros apenas.");
            }
        }
    }
    
    public static void addDevice(BufferedReader input, HashMap<Long,Client> c){
        
        HandleMenus DevMenu = new DeviceTypeMenu();
        
        long num = 0;
        String rede = " ";
        boolean rerun = true;
        try{
            while(rerun){
                System.out.println("Insira o numero para o dispositivo (0 cancela):");
                System.out.print(": ");
                num = Long.parseLong(input.readLine());
                if(num == 0) return;
                for(Long i : c.keySet()){
                   for(Client x : c.values())
                       for(Account y : x.getAccs().values()){
                           if(y.checkNum(num))
                               System.out.println("Numero " + num + " ja existe. É do tipo " + y.getTypeByNum(num));
                           else{
                               int choice = ControlInputNoBackButton(3, DevMenu, input);
                               switch(choice){
                                    case 1: rede = "2G";
                                            Device s = new D_Sender(num,rede);
                                            y.addDevice(s);
                                            System.out.println("Sender adicionado.");
                                            rerun = false;
                                            holdEnterCont();
                                            break;
                                    case 2: rede = networkCap(input);
                                            Device p = new D_Phone(num, rede);
                                            y.addDevice(p);
                                            System.out.println("Telemovel adicionado.");
                                            rerun = false;
                                            holdEnterCont();
                                            break;
                                    case 3: rede = networkCap(input);
                                            Device t = new D_Tablet(num, rede);
                                            y.addDevice(t);
                                            System.out.println("Tablet adicionada.5");
                                            rerun = false;
                                            holdEnterCont();
                                            break;
                                    default:System.out.println("Erro!!!");
                                            break;
                               }
                           }
                       }
                }
            }
        }catch(IOException ex){
            ex.printStackTrace();
        }catch(NumberFormatException ex2){
                System.out.println("ERRO. apenas numeros.");
            }
    }
    
    public static String networkCap(BufferedReader input){
        
        HandleMenus netMenu = new NetworkTypeMenu();
        
        int choice = ControlInput(3, netMenu,input);
        switch(choice){
            case 0: return "2G";
            case 1: return "3G";
            case 2: return "4G";
            default: return "Erro!";
        }
        
    }
    
    public static void listAccDevs(BufferedReader input, HashMap<Long,Client> c){
        
        ArrayList<Device> temp = new ArrayList<Device>();
        
        System.out.println("Introduza o numero da conta:");
        System.out.println(": ");
        try{
            long choice = Long.parseLong(input.readLine());
            for(Long i : c.keySet()){
                Client x = c.get(i);
                for(Long j : x.getAccs().keySet()){
                    Account y = x.getAccs().get(j);
                    if(y.getID() == choice){
                        temp.addAll(y.getDevList());
                        System.out.println("A conta " + choice + " associada ao cliente " + x.getName() +  " tem os seguintes dispositivos:");
                        int aux=0;
                        for(Device d : temp){
                            if(d.getClass().getName().equals("D_Sender"))
                                System.out.println(++aux + ": " + d.getNumber() + " do tipo Sender.");
                            if(d.getClass().getName().equals("D_Phone"))
                                System.out.println(++aux + ": " + d.getNumber() + " do tipo Telemovel.");
                            if(d.getClass().getName().equals("D_Tablet"))
                                System.out.println(++aux + ": " + d.getNumber() + " do tipo Tablet.");
                        }
                        holdEnterCont();
                    }
                    else
                        System.out.println("O id " + choice + " não existe.");
                }
        }
            
        }catch(IOException ex){
            
        }catch(NumberFormatException ex2){
            System.out.println("Erro!! Apenas Numeros!!!");
        }
        
        
        
    }
    
    public static void ListAccByCltid(BufferedReader input, HashMap<Long,Client> c){
        
        boolean rerun = true;
        long id = -1;
        
        while(rerun){
            try{
                System.out.println("Insira o ID do cliente:");
                id = Long.parseLong(input.readLine());
                if(c.containsKey(id)){
                    if(c.get(id).getAccs().isEmpty()){
                        System.out.println("O cliente nao tem ainda contas criadas.");
                        holdEnterCont();
                        return;
                    }else{
                        System.out.println("O cliente " + c.get(id).getName() + 
                            " com o ID " + id + " tem as seguinte(s) conta(s):");
                        for(Account aux : c.get(id).getAccs().values()){
                            System.out.println("A conta " + aux.getID() + " com " 
                                + aux.getDevList().size() + " dispositivos");
                        }        
                    }
                }else
                    System.out.println("Esse ID não existe.");
                
                    holdEnterCont();
                    return;
            }catch(IOException ex){
                ex.printStackTrace();
            }catch(NumberFormatException ex2){
                System.out.println("Erro! ID de cliente é composto por numeros!");
            }
        }
    }
    
    public static void ManageAccountMenu(BufferedReader input, HashMap<Long,Client> c){
     
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
    
    public static void ManageDeviceMenu(BufferedReader input,HashMap<Long,Client> c) {
     
            HandleMenus deviceMenu = new DeviceMenu();
            
            int choice = ControlInput(4,deviceMenu,input);
            
            switch(choice){
                
                case 0: break;
                case 1: if(c.isEmpty()){
                            System.out.println("Lista de clientes vazia. Crie primeiro um cliente.");
                            holdEnterCont();
                            break;
                        }
                        addDevice(input, c);
                        break;
                case 2: if(c.isEmpty()){
                            System.out.println("Lista de clientes vazia. Crie primeiro um cliente.");
                            holdEnterCont();
                            break;
                        }
                        listAccDevs(input,c);
                        
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
    
    public static boolean callMainMenu(String fx, BufferedReader input, HashMap<Long,Client> c){
        
        // Variaveis de Controlo de Menus para Parametros de funcoes
        
        HandleMenus mainMenu = new MainMenu();
        HandleMenus clientMenu = new ClientMenu();
        
        
        int userChoice = ControlInput(5,mainMenu,input);
        int choice = -1;
        
        
        switch(userChoice){
            
            case 0: long cltid = 0, accid = 0;
                    int i = c.size()-1;
                    for(Client aux : c.values()){
                        if(cltid < aux.getId()){
                            cltid = aux.getId();
                        }
                    for(Account temp : c.get(aux.getId()).getAccs().values()){
                        if(accid < temp.getID()){
                            accid = temp.getID();
                        }
                    }    
                    }
                    try
                    {
                        FileOutputStream file = new FileOutputStream(fx);
                        ObjectOutputStream out = new ObjectOutputStream(file);
                        out.writeObject(c);
                        out.writeLong(cltid);
                        out.writeLong(accid);
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
            case 2: ManageAccountMenu(input,c);
                    break;
                    
            case 3: ManageDeviceMenu(input,c);
                    break;
            
            case 4: //choice = ControlInput(,,input);
                    break;
            
            case 5: //choice = ControlInput(,,input);
                    break;
            
            default: callMainMenu(fx, input, c);
        }
        
        
        return true;
    }
    
    public static HashMap<Long,Client> readFromFile(String fname){
        HashMap<Long,Client> temp= null;
        try
	{
            FileInputStream f = new FileInputStream(fname);
            ObjectInputStream in = new ObjectInputStream(f);
            temp = (HashMap<Long,Client>)in.readObject();
            if(temp.isEmpty()){
                System.out.println("Warning: Ficheiro inexistente ou vazio!");
            }
            long getid = in.readLong();
            if(getid != 0){
            Client aux = new Client("setid");
            aux.setId(getid);
            }
            long getid2 = in.readLong();
            Account aux2 = new Account();
            aux2.setId(getid2);
            in.close();
            f.close();
	}catch(ClassNotFoundException e)
	{ System.out.println("Classe do objecto lido nao existe !!"); }
	catch(FileNotFoundException e)
	{ System.out.println("Nome do fx nao esta correcto!! "); }
	catch(IOException e){}
        
        return temp;
    }
    // Hugo Fim

    // Tiago Inicio 
    /**
    
    public static void readFromFile(String fname, BufferedReader input, ArrayList<Client> c){
        try
	{
            FileInputStream f = new FileInputStream(fname);
            ObjectInputStream in = new ObjectInputStream(f);
            
            c.addAll((ArrayList)in.readObject());
            
            /*for(Client aux : c){
                aux = (Client)in.readObject();
                c.add(aux);
            }  
            f.close();
	}
	catch(ClassNotFoundException e)
	{ System.out.println("Classe do objecto lido nao existe !!"); }
	catch(FileNotFoundException e)
	{ System.out.println("Nome do fx nao esta correcto!! "); }
	catch(IOException e)
	{ System.out.println("Problemas de I/O ...");}
    }
     * @param args
    **/
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
        
        String fname = "VosSave.ser";
        //HashMap<Long, Client> ClientList = new HashMap<Long, Client>();
        HashMap<Long, Client> ClientList = readFromFile(fname);
        if(ClientList == null){
            System.out.println("Lista de clientes vazia. A criar uma nova!!");
            ClientList = new HashMap<Long, Client>();
        }
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
