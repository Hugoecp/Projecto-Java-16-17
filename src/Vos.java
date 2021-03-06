
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
            
            System.out.println("Qual o tipo de rede do dispositivo");
            System.out.println("1: 2G");
            System.out.println("2: 3G");
            System.out.println("3: 4G");
        }
    }
    
    public static class ComsMenu implements HandleMenus{
        
        public void printMenu(){
            
            System.out.println("**************************************");
            System.out.println("**************************************");
            System.out.println("**                                  **");
            System.out.println("**           Comunicações           **");
            System.out.println("**                                  **");
            System.out.println("**  1) Criar comunicações entre     **");
            System.out.println("**     dois dispositivos.           **");
            System.out.println("**  2) Listar comunicações          **");
            System.out.println("**     de um dispositivo            **");
            System.out.println("**  3) Cruzar informação de         **");
            System.out.println("**     dois números.                **");
            System.out.println("**  4) Listar as comunicações       **");
            System.out.println("**     de dados.                    **");
            System.out.println("**                                  **");
            System.out.println("**                 0) Back          **");
            System.out.println("**                                  **");
            System.out.println("**************************************");
            System.out.println("**************************************");
        }
    }
    
    public static class TypeOfComs implements HandleMenus{
        
        public void printMenu(){
            
            System.out.println("Qual o tipo de comunicação a criar:");
            System.out.println("1: Chamada audio.");
            System.out.println("2: Chamada video.");
            System.out.println("3: Mensagem de texto.");
            System.out.println("4: Mensagem Multimedia");
            System.out.println("5: Dados");
        }
    }
    
    public static class MmsType implements HandleMenus{
        
        public void printMenu(){
            
            System.out.println("Qual o tipo de MMS?");
            System.out.println("1: Mensagem de imagem.");
            System.out.println("2: Mensagem de video.");
            System.out.print(": ");
            }
    }
    
    public static class InOutCom implements HandleMenus{
        
        public void printMenu(){
            
            System.out.println("Tipo de comunicação:");
            System.out.println("1: Recebida.");
            System.out.println("2: Efectuada.");
            System.out.print(":");
            }
    }
    
    public static class Printlist implements HandleMenus{
        
        public void printMenu(){
            
            System.out.println("Deseja imprimir a lista?!");
            System.out.println("1: Sim");
            System.out.println("2: Não");
            }
    }
    
    // Metodos de controlo
    
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
    
    public static boolean callMainMenu(String fx, BufferedReader input, HashMap<Long,Client> c){
        
        // Variaveis de Controlo de Menus para Parametros de funcoes
        
        HandleMenus mainMenu = new MainMenu();
        HandleMenus clientMenu = new ClientMenu();
        
        
        int userChoice = ControlInput(5,mainMenu,input);
        int choice = -1;
        
        
        switch(userChoice){
            
            case 0: long cltid = 999, accid = 330000;
                    for(Long i : c.keySet()){
                        Client aux = c.get(i);
                        if(cltid < i)
                            cltid = i;
                        for(Long y : aux.getAccs().keySet()){
                            Account temp = aux.getAccs().get(y);
                            if(accid < temp.getID())
                                accid = temp.getID();
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
            
            case 4: ManageComsMenu(input,c);
                    break;
            
            case 5: Invoice(input,c);
                    break;
            
            default: callMainMenu(fx, input, c);
        }
        
        
        return true;
    }
    
    public static void holdEnterCont(){ 
        System.out.print(": ");
        try{System.in.read();}  
        catch(Exception e){}  
 }
    
    // Metodos de leitura externa
    @SuppressWarnings("unchecked")
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
            long getid2 = in.readLong();
            Client.setCLT_ID(getid);
            Account.setACC_ID(getid2);
            in.close();
            f.close();
	}catch(ClassNotFoundException e)
	{ System.out.println("Classe do objecto lido nao existe !!"); }
	catch(FileNotFoundException e)
	{ System.out.println("Nome do fx nao esta correcto!! "); }
	catch(IOException e){}
        
        return temp;
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
    
    // Metodos de gestao de Clientes
    
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
    
    public static void listClient(HashMap<Long,Client> c){
        int index=0;
        for(Long id : c.keySet()){
            System.out.println(++index + ": O cliente: " 
                    + c.get(id).getName() + " com o ID: " + id);
        }
    }
    
    // Metodos de gestao de contas
    
    public static void ManageAccountMenu(BufferedReader input, HashMap<Long,Client> c){
     
        HandleMenus accountMenu = new AccountMenu();
        
        int choice = ControlInput(2,accountMenu,input);
        
        switch(choice){
            
            case 0: break;
            case 1:if(c.isEmpty()){
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
    
    public static void listAccDevs(BufferedReader input, HashMap<Long,Client> c){
        
        ArrayList<Device> temp = new ArrayList<Device>();
        String option = " ";
        long choice = 0, cltid = 0, accid = 0;
        boolean rerun = true, flag = false;
        
        while(rerun)
            try{
                System.out.println("Introduza o numero da conta:");
                System.out.print(": ");
                option = input.readLine();
                if(option.startsWith("33") && option.length() >= 6){
                    choice = Long.parseLong(option);
                    for(Long i : c.keySet()){
                        Client x = c.get(i);
                        for(Long j : x.getAccs().keySet()){
                            if(j == choice){
                                cltid = i;
                                accid = j;
                                rerun = false;
                                flag = true;
                            }
                        }
                    }
                }
            }catch(IOException ex){
                ex.printStackTrace();
            }catch(NumberFormatException ex2){
                System.out.println("Erro!! Apenas Numeros!!!");
            }
            
        if(flag){
        System.out.println("A conta " + choice + " associada ao "
            + "cliente " + c.get(cltid).getName() +  
                " tem os seguintes dispositivos:");
            int aux=0;
            for(Device d : c.get(cltid).getAccs().get(accid).getDevList()){
                if(d.getClass().getName().equals("D_Sender"))
                    System.out.println(++aux + ": " + d.getNumber() + " do tipo Sender.");
                if(d.getClass().getName().equals("D_Phone"))
                    System.out.println(++aux + ": " + d.getNumber() + " do tipo Telemovel.");
                if(d.getClass().getName().equals("D_Tablet"))
                    System.out.println(++aux + ": " + d.getNumber() + " do tipo Tablet.");
            }
        }else{
            System.out.println("O id " + choice + " não existe.");
        }
        holdEnterCont();
            
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
    
    // Metodos de gestao de dispositivos
 
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
                        addDevicetoAcc(input,c);
                        break;
                case 2: if(c.isEmpty()){
                            System.out.println("Lista de clientes vazia. Crie primeiro um cliente.");
                            holdEnterCont();
                            break;
                        }
                        listAccDevs(input,c);
                        break;
                case 3: if(c.isEmpty()){
                            System.out.println("Lista de clientes vazia. Crie primeiro um cliente.");
                            holdEnterCont();
                            break;
                        }
                        listDevNetByType(input,c);
                        break;
                case 4: if(c.isEmpty()){
                            System.out.println("Lista de clientes vazia. Crie primeiro um cliente.");
                            holdEnterCont();
                            break;
                        }
                        addContact2Dev(input,c);
                        break;
                        
            }
    }
 
    public static void addDevicetoAcc(BufferedReader input, HashMap<Long,Client> c){
        
        HandleMenus DevMenu = new DeviceTypeMenu();
        
        long num = 0, cltid = 0, accid = 0;
        int cap = -1;
        String rede = " ", option = " ";
        boolean rerun = true, flag = false;
        
        
        try{
            System.out.println("Insira o numero do cliente:");
            System.out.print(": ");
            option = input.readLine();
            if(option.startsWith("1") && !option.isEmpty() 
                    && option.length() >= 4){
                num = Long.parseLong(option);
                if(c.containsKey(num)){
                    cltid = num;
                }
            }else{
                System.out.println("Esse cliente não existe!");
                holdEnterCont();
                return;
            }
        }catch(IOException ex){
            ex.printStackTrace();
        }catch(NumberFormatException ex){
            System.out.println("Erro! Só números de 0-9!");
        }
        
        try{
            System.out.println("Insira o numero da conta:");
            System.out.print(": ");
            option = input.readLine();
            if(option.startsWith("33") && !option.isEmpty() 
                    && option.length() >= 6 ){
                num = Long.parseLong(option);
                    Client aux = c.get(cltid);
                        for(Long j : aux.getAccs().keySet()){
                            if(num == j){
                                accid = num;    
                            }
                        }
                    
                }else{
                System.out.println("Essa conta não existe!");
                holdEnterCont();
                return;
            }
        }catch(IOException ex){
            ex.printStackTrace();
        }catch(NumberFormatException ex){
            System.out.println("Erro! Só números de 0-9!");
        }
                
        try{
            while(rerun){
                System.out.println("Insira o numero para o dispositivo:");
                System.out.print(": ");
                option = input.readLine();
                if(!option.isEmpty() && (option.startsWith("91")
                        || option.startsWith("92")
                        || option.startsWith("93")
                        || option.startsWith("96")) 
                        && option.length() == 9){
                    num = Long.parseLong(option);
                    for(Device d : c.get(cltid).getAccs().get(accid).getDevList()){
                        if(d.getNumber() == num){
                            System.out.println("Numero " + num + " ja existe. "
                                    + "É do tipo " + 
                                    c.get(cltid).getAccs().get(accid).getTypeByNum(num));
                            return;
                        }
                    }
                    int choice = ControlInputNoBackButton(3, DevMenu, input);
                    switch(choice){
                         case 1: rede = "2G";
                                 Device s = new D_Sender(num,rede);
                                 c.get(cltid).getAccs().get(accid).addDevice(s);
                                 System.out.println("Sender adicionado.");
                                 holdEnterCont();
                                 return;
                         case 2: rede = networkCap(input);
                                 Device p = new D_Phone(num, rede);
                                 c.get(cltid).getAccs().get(accid).addDevice(p);
                                 System.out.println("Telemovel adicionado.");
                                 holdEnterCont();
                                 return;
                         case 3: rede = networkCap(input);
                                 rerun = true;
                                 while(rerun){ 
                                    try{
                                        System.out.println("Qual a capacidade"
                                                + " da tablet?");
                                        System.out.print(": ");
                                        cap = Integer.parseInt(input.readLine());
                                        if(cap == 16 || cap == 32 || cap == 64 
                                                || cap == 128 || cap == 256){
                                            rerun = false;
                                        }
                                     }catch(IOException ex){
                                         ex.printStackTrace();
                                     }catch(NumberFormatException ex){
                                         System.out.println("Erro! Só 16, 32, 64, 128 ou 256");
                                     }
                                 }
                                 Device t = new D_Tablet(num, rede, cap);
                                 c.get(cltid).getAccs().get(accid).addDevice(t);
                                 System.out.println("Tablet adicionada.");
                                 holdEnterCont();
                                 return;
                         default:System.out.println("Erro!!!");
                                 break;
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
        
        int choice = ControlInputNoBackButton(3, netMenu,input);
        switch(choice){
            case 1: return "2G";
            case 2: return "3G";
            case 3: return "4G";
            default: return "Erro";
        }
        
    }
 
    public static void listDevNetByType(BufferedReader input, HashMap<Long, Client> c)
    {
     
        HandleMenus netType = new NetworkTypeMenu();
        String network = "";
        int cont = 0, emptylist = -1;
        int choice = ControlInputNoBackButton(3,netType,input);
        switch(choice){
            case 1: network = "2G";
                    break;
            case 2: network = "3G";
                    break;
            case 3: network = "4G";
                    break;
        }
        for(Long i : c.keySet()){
            Client temp = c.get(i);
            for(Long j : temp.getAccs().keySet()){
                Account aux = temp.getAccs().get(j);
                for(Device d : aux.getDevList()){
                    if(d.getNetworkType().equals(network)){
                        System.out.println(++cont + ": Dispositivo com o numero "
                        + d.getNumber() + " do tipo " + d.getType());
                        ++emptylist;
                    }
                }
            }
        }
        holdEnterCont();
        if(emptylist < 0)
            System.out.println("Não existem dispositivos com esse tipo de rede.");
    }
 
    public static void addContact2Dev(BufferedReader input, HashMap<Long, Client> c){
        
        System.out.println("Numero do dispositivo onde adicionar o contacto:");
        System.out.print(": ");
        int y = -1;
        long num = 0;
        long cltid = 0, accid = 0, num2 = 0;
        boolean flag = false;
        boolean rerun = true;
        String name = "";
        
        
        while(rerun){
            try{
                num = Long.parseLong(input.readLine());
                
                for(Long i : c.keySet()){
                    Client aux = c.get(i);
                    for(Long j : aux.getAccs().keySet()){
                        Account aux2 = aux.getAccs().get(j);
                        for(Device d : aux2.getDevList()){
                            if(d.getNumber() == num){
                                flag = true;
                                cltid = i;
                                accid = j;
                                num2 = num;
                                rerun = false;
                            }
                        }
                    }
                }
                }catch(IOException ex){
                ex.printStackTrace();
                }catch(NumberFormatException ex){
                System.out.println("Erro! so numeros!!");
                }
        }
            if(flag){
                rerun = true;
                System.out.println("Insira o nome do contacto:");

                try{
                    System.out.print(": ");
                    name = input.readLine();

                }catch(IOException ex){
                    ex.printStackTrace();
                }
                while(rerun){
                    try{
                        System.out.println("Insira o numero do contacto:");
                        System.out.print(": ");
                        String number = input.readLine();
                        if(!number.isEmpty() && number.length() == 9 ){
                            num = Long.parseLong(number);
                            rerun = false;
                        }else{
                            System.out.println("Formato errado");
                        }
                    }catch(IOException ex){
                        ex.printStackTrace();
                    }catch(NumberFormatException ex){
                        System.out.println("Erro! Só números de 0-9!");
                    }
                }  
                Contact x = new Contact(name,num);

                for(Device d: c.get(cltid).getAccs().get(accid).getDevList()){
                    if(d.getNumber() == num2)
                        d.addContact(x);
                }      
            }
            else{
                System.out.println("Esse dispositivo não existe!");
                holdEnterCont();
            }
        
    }
    
    // Metodos de gestao de Comunicações

    public static void ManageComsMenu(BufferedReader input, HashMap<Long, Client> c){
        
        HandleMenus comsmenu = new ComsMenu();
        
        int choice = ControlInput(4,comsmenu,input);
        
        switch(choice){
           
            case 0: break;
            case 1: if(c.isEmpty()){
                        System.out.println("Lista de clientes vazia. ");
                        System.out.println("Crie primeiro um cliente.");
                        holdEnterCont();
                        break;
                    }
                    createComs(input, c);
                    break;
            case 2: if(c.isEmpty()){
                        System.out.println("Lista de clientes vazia. ");
                        System.out.println("Crie primeiro um cliente.");
                        holdEnterCont();
                        break;
                    }
                    listDevComs(input, c);
                    break;
            case 3: CrossReferenceDevs(input,c);
                    break;
            case 4: ByteComs(input,c);
                    break;
            default: System.out.println("Erro!");
                    break;
            
        }
    }

    public static void createComs(BufferedReader input, HashMap<Long, Client> c){
        
        HandleMenus comtype = new TypeOfComs();
        HandleMenus mmstype = new MmsType();
        
        {
        
        
            int choice = ControlInputNoBackButton(5,comtype,input);
            switch(choice){

                case 1: NewAudioCall(input,c);
                        break;
                case 2: NewVideoCall(input,c);
                        break;
                case 3: NewTextMessage(input,c);
                        break;
                case 4: int type = ControlInputNoBackButton(2,mmstype,input);
                            switch(type){
                                
                                case 1: NewImageMMS(input,c);
                                        break;
                                    
                                case 2: NewVideoMMS(input,c);
                                        break;
                                    
                                default:System.out.println("Erro!!"); 
                                        break;
                            }

                        break;
                case 5: NewDownload(input,c);
                        break;
                default: System.out.println("Erro!");
                        break;
            }
        }
    }

    public static void NewAudioCall(BufferedReader input, HashMap<Long, Client> c){
        
        String option = " ", Dnt = " ", Ont = " ";
        long num = 0, Dnum = 0, Onum = 0, Dcltid = 0, Ocltid = 0,
                Daccid = 0, Oaccid = 0;
        boolean Drerun = true, Dflag = false, Orerun = true, Oflag = false;
        
        while(Orerun){
            try{
                System.out.println("Numero origem: ");
                System.out.print(": ");
                option = input.readLine();
                if(!option.isEmpty() && option.length() == 9){
                    num = Long.parseLong(option);
                    for(Long i : c.keySet()){
                        Client temp = c.get(i);
                        for(Long j : temp.getAccs().keySet()){
                            Account temp2 = temp.getAccs().get(j);
                            for(Device d : temp2.getDevList()){
                                if(d.getNumber() == num){
                                    Ocltid = i;
                                    Oaccid = j;
                                    Onum = num;
                                    Orerun = false;
                                    Oflag = true;
                                    Ont = d.getNetworkType();
                                }
                            }
                        }
                    }
                }
                else{
                    if(num == 0){
                        return;
                    }else{
                    System.out.println("Erro. Esse número não existe!");
                    holdEnterCont();
                    } 
                }
            }catch(IOException ex){
                ex.printStackTrace();
            }catch(NumberFormatException ex){
                System.out.println("Erro. Só numeros 0-9.");
            }
        }
        if(!Oflag){
            System.out.println("O numero " + Onum + " não existe!");
            holdEnterCont();
            return;
        }
        while(Drerun){
            try{
                System.out.println("Numero destino: ");
                System.out.print(": ");
                option = input.readLine();
                if(!option.isEmpty() && option.length() == 9){
                    num = Long.parseLong(option);
                    for(Long i : c.keySet()){
                        Client temp = c.get(i);
                        for(Long j : temp.getAccs().keySet()){
                            Account temp2 = temp.getAccs().get(j);
                            for(Device d : temp2.getDevList()){
                                if(d.getNumber() == num){
                                    Dcltid = i;
                                    Daccid = j;
                                    Dnum = num;
                                    Drerun = false;
                                    Dflag = true;
                                    Dnt = d.getNetworkType();
                                }
                            }
                        }
                    }
                }
            }catch(IOException ex){
                ex.printStackTrace();
            }
        }
        if(!Dflag){
            System.out.println("O numero " + Dnum + " não existe!");
            holdEnterCont();
        }else{
            for(Device d: c.get(Ocltid).getAccs().get(Oaccid).getDevList()){
                if(d.getNumber() == Onum){
                    Comunications temp = new C_Acall(Onum,Dnum,0,Math.random());
                    d.addLog(temp);
                    System.out.println("Registo de chamada de voz criado.");
                    return;
                }
            }
            for(Device d: c.get(Dcltid).getAccs().get(Daccid).getDevList()){
                if(d.getNumber() == Dnum){
                    Comunications temp2 = new C_Acall(Dnum,Onum,1,Math.random());
                    d.addLog(temp2);
                    System.out.println("Registo de chamada de voz criado.");
                    return;
                }
            }
            
        }
    }

    public static void NewVideoCall(BufferedReader input, HashMap<Long, Client> c){
            
        String option = " ", Dnt = " ", Ont = " ";
        long num = 0, Dnum = 0, Onum = 0, Dcltid = 0, Ocltid = 0,
                Daccid = 0, Oaccid = 0;
        boolean Drerun = true, Dflag = false, Orerun = true, Oflag = false;
        
        while(Orerun){
            try{
                System.out.println("Numero origem: ");
                System.out.print(": ");
                option = input.readLine();
                if(!option.isEmpty() && option.length() == 9){
                    num = Long.parseLong(option);
                    for(Long i : c.keySet()){
                        Client temp = c.get(i);
                        for(Long j : temp.getAccs().keySet()){
                            Account temp2 = temp.getAccs().get(j);
                            for(Device d : temp2.getDevList()){
                                if(d.getNumber() == num && 
                                        !d.getNetworkType().equals("2G")){
                                    Ocltid = i;
                                    Oaccid = j;
                                    Onum = num;
                                    Orerun = false;
                                    Oflag = true;
                                    Ont = d.getNetworkType();
                                }
                            }
                        }
                    }
                }
                else{
                    if(num == 0){
                        return;
                    }else{
                    System.out.println("Erro. Esse número não existe!");
                    holdEnterCont();
                    } 
                }
            }catch(IOException ex){
                ex.printStackTrace();
            }catch(NumberFormatException ex){
                System.out.println("Erro. Só numeros 0-9.");
            }
        }
        if(!Oflag){
            System.out.println("O numero " + Onum + " não existe!");
            holdEnterCont();
            return;
        }
        while(Drerun){
            try{
                System.out.println("Numero destino: ");
                System.out.print(": ");
                option = input.readLine();
                if(!option.isEmpty() && option.length() == 9){
                    num = Long.parseLong(option);
                    for(Long i : c.keySet()){
                        Client temp = c.get(i);
                        for(Long j : temp.getAccs().keySet()){
                            Account temp2 = temp.getAccs().get(j);
                            for(Device d : temp2.getDevList()){
                                if(d.getNumber() == num){
                                    Dcltid = i;
                                    Daccid = j;
                                    Dnum = num;
                                    Drerun = false;
                                    Dflag = true;
                                    Dnt = d.getNetworkType();
                                }
                            }
                        }
                    }
                }
            }catch(IOException ex){
                ex.printStackTrace();
            }
        }
        if(!Dflag){
            System.out.println("O numero " + Dnum + " não existe!");
            holdEnterCont();
            return;
        }else{
            for(Device d: c.get(Ocltid).getAccs().get(Oaccid).getDevList()){
                if(d.getNumber() == Onum){
                    Comunications temp = new C_Vcall(Onum,Dnum,0,Math.random(),
                            CalcRes(Ont,Dnt));
                    d.addLog(temp);
                }
            }
            for(Device d: c.get(Dcltid).getAccs().get(Daccid).getDevList()){
                if(d.getNumber() == Dnum){
                    Comunications temp = new C_Vcall(Dnum,Onum,1,Math.random(),
                            CalcRes(Dnt,Ont));
                    d.addLog(temp);
                }
            }
            System.out.println("Registo de chamada de video criado.");
        }
    }
   
    public static String CalcRes(String Ont, String Dnt){
        
        String res = " ";
        
        if(Ont.equals("4G") && Dnt.equals("4G"))
            return res = "FHD";
        if((Ont.equals("4G") && Dnt.equals("3G")) || (Ont.equals("3G") && Dnt.equals("4G")) 
                || Ont.equals("3G") && Dnt.equals("3G"))
            return res = "HD";
        else return res = "SD";
    }
  
    public static void NewTextMessage(BufferedReader input, HashMap<Long, Client> c){
        
        String option = " ", Dnt = " ", Ont = " ";
        long num = 0, Dnum = 0, Onum = 0, Dcltid = 0, Ocltid = 0,
                Daccid = 0, Oaccid = 0;
        boolean Drerun = true, Dflag = false, Orerun = true, Oflag = false;
        
        while(Orerun){
            try{
                System.out.println("Numero origem: ");
                System.out.print(": ");
                option = input.readLine();
                if(!option.isEmpty() && option.length() == 9){
                    num = Long.parseLong(option);
                    for(Long i : c.keySet()){
                        Client temp = c.get(i);
                        for(Long j : temp.getAccs().keySet()){
                            Account temp2 = temp.getAccs().get(j);
                            for(Device d : temp2.getDevList()){
                                if(d.getNumber() == num){
                                    Ocltid = i;
                                    Oaccid = j;
                                    Onum = num;
                                    Orerun = false;
                                    Oflag = true;
                                    Ont = d.getNetworkType();
                                }
                            }
                        }
                    }
                }
                else{
                    if(num == 0){
                        return;
                    }else{
                    System.out.println("Erro. Esse número não existe!");
                    holdEnterCont();
                    } 
                }
            }catch(IOException ex){
                ex.printStackTrace();
            }catch(NumberFormatException ex){
                System.out.println("Erro. Só numeros 0-9.");
            }
        }
        if(!Oflag){
            System.out.println("O numero " + Onum + " não existe!");
            holdEnterCont();
            return;
        }
        while(Drerun){
            try{
                System.out.println("Numero destino: ");
                System.out.print(": ");
                option = input.readLine();
                if(!option.isEmpty() && option.length() == 9){
                    num = Long.parseLong(option);
                    for(Long i : c.keySet()){
                        Client temp = c.get(i);
                        for(Long j : temp.getAccs().keySet()){
                            Account temp2 = temp.getAccs().get(j);
                            for(Device d : temp2.getDevList()){
                                if(d.getNumber() == num){
                                    Dcltid = i;
                                    Daccid = j;
                                    Dnum = num;
                                    Drerun = false;
                                    Dflag = true;
                                    Dnt = d.getNetworkType();
                                }
                            }
                        }
                    }
                }
            }catch(IOException ex){
                ex.printStackTrace();
            }
        }
        if(!Dflag){
            System.out.println("O numero " + Dnum + " não existe!");
            holdEnterCont();
            return;
        }else{
            for(Device d: c.get(Ocltid).getAccs().get(Oaccid).getDevList()){
                if(d.getNumber() == Onum){
                    Comunications temp = new C_SMS(Onum,Dnum,0,Math.random(),"****");
                    d.addLog(temp);
                }
            }
            for(Device d: c.get(Dcltid).getAccs().get(Daccid).getDevList()){
                if(d.getNumber() == Dnum){
                    Comunications temp = new C_SMS(Dnum,Onum,1,Math.random(),"****");
                    d.addLog(temp);
                }
            }
            System.out.println("Registo de mensagem de texto criado.");
        }
    }
    
    public static void NewVideoMMS(BufferedReader input, HashMap<Long, Client> c){
        
        String option = " ", Dnt = " ", Ont = " ";
        long num = 0, Dnum = 0, Onum = 0, Dcltid = 0, Ocltid = 0,
                Daccid = 0, Oaccid = 0;
        boolean Drerun = true, Dflag = false, Orerun = true, Oflag = false;
        
        while(Orerun){
            try{
                System.out.println("Numero origem: ");
                System.out.print(": ");
                option = input.readLine();
                if(!option.isEmpty() && option.length() == 9){
                    num = Long.parseLong(option);
                    for(Long i : c.keySet()){
                        Client temp = c.get(i);
                        for(Long j : temp.getAccs().keySet()){
                            Account temp2 = temp.getAccs().get(j);
                            for(Device d : temp2.getDevList()){
                                if(d.getNumber() == num){
                                    Ocltid = i;
                                    Oaccid = j;
                                    Onum = num;
                                    Orerun = false;
                                    Oflag = true;
                                    Ont = d.getNetworkType();
                                }
                            }
                        }
                    }
                }
                else{
                    if(num == 0){
                        return;
                    }else{
                    System.out.println("Erro. Esse número não existe!");
                    holdEnterCont();
                    } 
                }
            }catch(IOException ex){
                ex.printStackTrace();
            }catch(NumberFormatException ex){
                System.out.println("Erro. Só numeros 0-9.");
            }
        }
        if(!Oflag){
            System.out.println("O numero " + Onum + " não existe!");
            holdEnterCont();
            return;
        }
        while(Drerun){
            try{
                System.out.println("Numero destino: ");
                System.out.print(": ");
                option = input.readLine();
                if(!option.isEmpty() && option.length() == 9){
                    num = Long.parseLong(option);
                    for(Long i : c.keySet()){
                        Client temp = c.get(i);
                        for(Long j : temp.getAccs().keySet()){
                            Account temp2 = temp.getAccs().get(j);
                            for(Device d : temp2.getDevList()){
                                if(d.getNumber() == num){
                                    Dcltid = i;
                                    Daccid = j;
                                    Dnum = num;
                                    Drerun = false;
                                    Dflag = true;
                                    Dnt = d.getNetworkType();
                                }
                            }
                        }
                    }
                }
            }catch(IOException ex){
                ex.printStackTrace();
            }
        }
        if(!Dflag){
            System.out.println("O numero " + Dnum + " não existe!");
            holdEnterCont();
            return;
        }else{
            for(Device d: c.get(Ocltid).getAccs().get(Oaccid).getDevList()){
                if(d.getNumber() == Onum){
                    Comunications temp = new C_VMMS(Onum,Dnum,0,CalcRes(Ont, Dnt)
                            ,CalcVideoFormat(Ont,Dnt) ,Math.random());
                    d.addLog(temp);
                }
            }
            for(Device d: c.get(Dcltid).getAccs().get(Daccid).getDevList()){
                if(d.getNumber() == Dnum){
                    Comunications temp = new C_VMMS(Onum,Dnum,1,CalcRes(Ont, Dnt)
                            ,CalcVideoFormat(Dnt,Ont) ,Math.random());
                    d.addLog(temp);
                }
            }
            System.out.println("Registo de mensagem de Video criado.");
        }
    }
    
    public static void NewImageMMS(BufferedReader input, HashMap<Long, Client> c){
            
        String option = " ", Dnt = " ", Ont = " ";
        long num = 0, Dnum = 0, Onum = 0, Dcltid = 0, Ocltid = 0,
                Daccid = 0, Oaccid = 0;
        boolean Drerun = true, Dflag = false, Orerun = true, Oflag = false;
        
        while(Orerun){
            try{
                System.out.println("Numero origem: ");
                System.out.print(": ");
                option = input.readLine();
                if(!option.isEmpty() && option.length() == 9){
                    num = Long.parseLong(option);
                    for(Long i : c.keySet()){
                        Client temp = c.get(i);
                        for(Long j : temp.getAccs().keySet()){
                            Account temp2 = temp.getAccs().get(j);
                            for(Device d : temp2.getDevList()){
                                if(d.getNumber() == num){
                                    Ocltid = i;
                                    Oaccid = j;
                                    Onum = num;
                                    Orerun = false;
                                    Oflag = true;
                                    Ont = d.getNetworkType();
                                }
                            }
                        }
                    }
                }
                else{
                    if(num == 0){
                        return;
                    }else{
                    System.out.println("Erro. Esse número não existe!");
                    holdEnterCont();
                    } 
                }
            }catch(IOException ex){
                ex.printStackTrace();
            }catch(NumberFormatException ex){
                System.out.println("Erro. Só numeros 0-9.");
            }
        }
        if(!Oflag){
            System.out.println("O numero " + Onum + " não existe!");
            holdEnterCont();
            return;
        }
        while(Drerun){
            try{
                System.out.println("Numero destino: ");
                System.out.print(": ");
                option = input.readLine();
                if(!option.isEmpty() && option.length() == 9){
                    num = Long.parseLong(option);
                    for(Long i : c.keySet()){
                        Client temp = c.get(i);
                        for(Long j : temp.getAccs().keySet()){
                            Account temp2 = temp.getAccs().get(j);
                            for(Device d : temp2.getDevList()){
                                if(d.getNumber() == num){
                                    Dcltid = i;
                                    Daccid = j;
                                    Dnum = num;
                                    Drerun = false;
                                    Dflag = true;
                                    Dnt = d.getNetworkType();
                                }
                            }
                        }
                    }
                }
            }catch(IOException ex){
                ex.printStackTrace();
            }
        }
        if(!Dflag){
            System.out.println("O numero " + Dnum + " não existe!");
            holdEnterCont();
            return;
        }else{
            for(Device d: c.get(Ocltid).getAccs().get(Oaccid).getDevList()){
                if(d.getNumber() == Onum){
                    Comunications temp = new C_MMS(Onum,Dnum,0,Math.random(),
                            CalcRes(Ont, Dnt),CalcImageFormat(Ont,Dnt));
                    d.addLog(temp);
                }
            }
            for(Device d: c.get(Dcltid).getAccs().get(Daccid).getDevList()){
                if(d.getNumber() == Dnum){
                    Comunications temp = new C_MMS(Onum,Dnum,1,Math.random(),
                            CalcRes(Ont, Dnt),CalcImageFormat(Dnt,Ont));
                    d.addLog(temp);
                }
            }
            System.out.println("Registo de mensagem de imagem criado.");
        }
    }
    
    public static void NewDownload(BufferedReader input, HashMap<Long, Client> c){
        
        String option = " ", Dnt = " ", Ont = " ";
        long num = 0, Dnum = 0, Onum = 0, Ocltid = 0, Oaccid = 0;
        boolean Oflag = false, Orerun = true, ErrorTest = false;
        
        while(Orerun){
            try{
                System.out.println("Numero origem: ");
                System.out.print(": ");
                option = input.readLine();
                if(!option.isEmpty() && option.length() == 9){
                    num = Long.parseLong(option);
                    for(Long i : c.keySet()){
                        Client temp = c.get(i);
                        for(Long j : temp.getAccs().keySet()){
                            Account temp2 = temp.getAccs().get(j);
                            for(Device d : temp2.getDevList()){
                                if(d.getNumber() == num && 
                                    d.getType().equals("tablet") &&
                                    !d.getNetworkType().equals("2G")){
                                    Ocltid = i;
                                    Oaccid = j;
                                    Onum = num;
                                    Orerun = false;
                                    Oflag = true;
                                    Ont = d.getNetworkType();
                                }
                                else{
                                    if(d.getType().equals("tablet"))
                                        ErrorTest = true;
                                }
                            }
                        }
                    }
                }
                else{
                    if(num == 0){
                        return;
                    }else{
                        if(ErrorTest){
                            System.out.println("Erro! Apenas os dispositivos "
                                    + "do tipo tablet podem efecutar este tipo"
                                    + " de comunicação.");
                            holdEnterCont();
                        }else{
                    System.out.println("Erro. Esse número não existe!");
                    holdEnterCont();
                        }
                    } 
                }
            }catch(IOException ex){
                ex.printStackTrace();
            }catch(NumberFormatException ex){
                System.out.println("Erro. Só numeros 0-9.");
            }
        }
        if(!Oflag){
            System.out.println("O numero " + Onum + " não existe!");
            holdEnterCont();
            return;
        }else{
            for(Device d: c.get(Ocltid).getAccs().get(Oaccid).getDevList()){
                if(d.getNumber() == Onum){
                    Comunications temp = new C_Downloads(Onum,0,Math.random(),Math.random());
                    d.addLog(temp);
                }
            }
            System.out.println("Registo de descarga de software criado.");
        }
    }
    
    public static String CalcVideoFormat(String Ont, String Dnt){
        
        String res = " ";
        
        if(Ont.equals("4G") && Dnt.equals("4G"))
            return res = "MKV";
        if((Ont.equals("4G") && Dnt.equals("3G")) || (Ont.equals("3G") && Dnt.equals("4G")) 
                || Ont.equals("3G") && Dnt.equals("3G"))
            return res = "3GP";
        else return res = "MPEG";
    }
    
    public static String CalcImageFormat(String Ont, String Dnt){
        
        String res = " ";
        
        if(Ont.equals("4G") && Dnt.equals("4G"))
            return res = "png";
        if((Ont.equals("4G") && Dnt.equals("3G")) || (Ont.equals("3G") && Dnt.equals("4G")) 
                || Ont.equals("3G") && Dnt.equals("3G"))
            return res = "jpeg";
        else return res = "bmp";
    }
    
    public static void listDevComs(BufferedReader input, HashMap<Long, Client> c){
        
        HandleMenus inoutcom = new InOutCom();
        int choice = 0;
        long num = 0, cltid = 0, accid = 0;
        String option = " ";
        boolean rerun = true, flag = false;
       
        while(rerun){
            try{
                choice = ControlInputNoBackButton(2,inoutcom,input);
                
                System.out.println("Introduza o numero do dispositivo que "
                        + "quer ver as comunicações:");
                System.out.print(": ");
                option = input.readLine();
                if(!option.isEmpty() && option.length() == 9){
                    num = Long.parseLong(option);
                    for(Long i : c.keySet()){
                        Client aux = c.get(i);
                        for(Long j : aux.getAccs().keySet()){
                            Account aux2 = aux.getAccs().get(j);
                            for(Device d : aux2.getDevList()){
                                if(d.getNumber() == num){
                                    cltid = i;
                                    accid = j;
                                    rerun = false;
                                    flag = true;
                                }
                            }
                        }
                    }
                }else{
                    System.out.println("Erro! Esse número nao existe!");
                    return;
            }
            }catch(IOException ex){
            ex.printStackTrace();
            }catch(NumberFormatException ex){
                System.out.println("Erro. So números!");
            }
        }
        if(choice == 1){
            for(Device d : c.get(cltid).getAccs().get(accid).getDevList())
                if(d.getNumber() == num){
                    int k = 0;
                    ArrayList<Comunications> temp = d.printRlogs();
                    for(Comunications aux : temp){
                        System.out.println(++k + ": O número " + num + " tem uma "
                                + "comunicação do tipo " + aux.getComType() + 
                                " do número " + aux.getDestinyNumber());
                    }
                    holdEnterCont();
                    return;
                }else{
                    System.out.println("Não existe nenhuma comunicação desse"
                            + " tipo no número " + num);
                }
        }
        if(choice == 0){
            for(Device d : c.get(cltid).getAccs().get(accid).getDevList())
                if(d.getNumber() == num){
                    int k = 0;
                    ArrayList<Comunications> temp = d.printSlogs();
                    for(Comunications aux : temp){
                        System.out.println(++k + ": O número " + num + " tem a "
                                + "comunicação do tipo " + aux.getComType() + 
                                " para o número " + aux.getDestinyNumber());
                    }
                    holdEnterCont();
                    return;
                }else{
                    System.out.println("Não existe nenhuma comunicação desse"
                            + " tipo no número " + num);
                }
        }
        
    }  
    
    public static void CrossReferenceDevs(BufferedReader input, HashMap<Long, Client> c){
        
        String option = " ";
        long num1 = 0, cltid1 = 0, accid1 = 0;
        long num2 = 0, cltid2 = 0, accid2 = 0;
        boolean rerun = true, flag1 = false, flag2 = false;
        while(rerun){
            try{
                System.out.println("Primeiro número:");
                option = input.readLine();
                if(!option.isEmpty() && option.length() == 9){
                    num1 = Long.parseLong(option);
                    for(Long i : c.keySet()){
                        Client temp = c.get(i);
                        for(Long j : temp.getAccs().keySet()){
                            Account aux = temp.getAccs().get(j);
                            for(Device d : aux.getDevList()){
                                if(num1 == d.getNumber()){
                                    cltid1 = i;
                                    accid1 = j;
                                    rerun = false;
                                    flag1 = true;
                                }
                            }
                        }
                    }
                }                    
            }catch(IOException ex){
                ex.printStackTrace();
            }catch(NumberFormatException ex){
                System.out.println("Erro. Formato composto por 9 números!");
                holdEnterCont();
                return;
            }
        }
        if(!flag1){
            System.out.println("Erro. O número " + num1 + " não existe.");
            holdEnterCont();
            return;
        }
        rerun = true;
        while(rerun){
            try{
                System.out.println("Segundo número:");
                option = input.readLine();
                if(!option.isEmpty() && option.length() == 9){
                    num2 = Long.parseLong(option);
                    for(Long i : c.keySet()){
                        Client temp = c.get(i);
                        for(Long j : temp.getAccs().keySet()){
                            Account aux = temp.getAccs().get(j);
                            for(Device d : aux.getDevList()){
                                if(num1 == d.getNumber()){
                                    cltid2 = i;
                                    accid2 = j;
                                    rerun = false;
                                    flag2 = true;
                                }
                            }
                        }
                    }
                }
            }catch(IOException ex){
                ex.printStackTrace();
            }catch(NumberFormatException ex){
                System.out.println("Erro. O número " + num1 + " não existe.");
                holdEnterCont();
                return;
            }
        }
        if(!flag2){
            System.out.println("Erro. O número " + num2 + " não existe.");
            holdEnterCont();
        }else{
            ArrayList<Comunications> matchcoms = new ArrayList<Comunications>();
            ArrayList<Comunications> matchcoms2 = new ArrayList<Comunications>();
            
            for(Device d : c.get(cltid1).getAccs().get(accid1).getDevList()){
                for(Comunications temp : d.getLogs()){
                    for(Device d2 : c.get(cltid2).getAccs().get(accid2).getDevList()){
                        for(Comunications temp2 : d2.getLogs()){
                            if(temp.getDestinyNumber() == temp2.getOriginNumber()){
                                matchcoms.add(temp);
                                matchcoms2.add(temp2);
                            }
                        }
                    }
                }
            }
            System.out.println("Lista do numero " + num1 + ":");
            int k = 0, p = 0;
            for(Comunications aux : matchcoms){
                System.out.println(++k + ": Numero " + aux.getDestinyNumber() +
                        "com comunicacao do tipo " + aux.getComType());
            }
            System.out.println("");
            System.out.println("");
            System.out.println("Lista do numero " + num2 + ":");
            for(Comunications aux : matchcoms2){
                System.out.println(++p + ": Numero " + aux.getDestinyNumber() +
                        "com comunicacao do tipo " + aux.getComType());
            }
        }
        
    }
    
    public static void ByteComs(BufferedReader input, HashMap<Long, Client> c){
        
        HandleMenus printquestion = new Printlist();
        
        ArrayList<Comunications> list = new ArrayList<Comunications>();
        double totalDataUsed = 0.0;
        boolean rerun = true;
        for(Client temp : c.values())
            for(Account aux : temp.getAccs().values())
                for(Device d : aux.getDevList())
                    for(Comunications coms : d.getLogs()){
                        if(coms instanceof Byteable){
                            totalDataUsed += ((Byteable) coms).DownloadSize();
                            list.add(coms);
                        }
                    }
        System.out.println("Lista criada.");
        holdEnterCont();
        int choice = ControlInputNoBackButton(2,printquestion,input), k=0;
        switch(choice){
            case 1: for(Comunications p : list){
                        System.out.println(++k + " " + p.getComType() + " do "
                                + "número " + p.getOriginNumber() + " para o "
                                + "número " + p.getDestinyNumber());
                    }
                    System.out.println("");
                    System.out.println("O total de dados usados "
                            + "foi de: " + totalDataUsed);
                    holdEnterCont();
                    return;
                
            case 2: System.out.println("Lista descartada.");
                    holdEnterCont();
        }

    }
    
    public static void Invoice(BufferedReader input, HashMap<Long, Client> c){
        
        String option = " ";
        long num = 0, cltid = 0, accid = 0;
        boolean rerun = true, flag = false;
        double cost1 = 0.0, cost2 = 0.0, cost3 = 0.0, cost4 = 0.0, cost5 = 0.0, 
                cost6 = 0.0;
        
        while(rerun){
            try{
                System.out.println("Insira o numero da conta:");
                System.out.print(": ");
                option = input.readLine();
                if(option.startsWith("33") && !option.isEmpty() 
                        && option.length() >= 6 ){
                    num = Long.parseLong(option);
                        for(Long i : c.keySet()){
                            Client aux = c.get(i);
                            for(Long j : aux.getAccs().keySet()){
                                if(num == j){
                                    cltid = i;
                                    accid = j;    
                                    rerun = false;
                                    flag = true;
                                }
                            }
                        }
                    }else{
                    System.out.println("Essa conta não existe!");
                    holdEnterCont();
                    return;
                }
            }catch(IOException ex){
                ex.printStackTrace();
            }catch(NumberFormatException ex){
                System.out.println("Erro! Só números de 0-9!");
            }
        }
        if(flag){
            for(Device d : c.get(cltid).getAccs().get(accid).getDevList()){
                
                ArrayList<Comunications> SMS = new ArrayList<Comunications>();
                ArrayList<Comunications> Acall = new ArrayList<Comunications>();
                ArrayList<Comunications> Vcall = new ArrayList<Comunications>();
                ArrayList<Comunications> MMS = new ArrayList<Comunications>();
                ArrayList<Comunications> VMMS = new ArrayList<Comunications>();
                ArrayList<Comunications> Download = new ArrayList<Comunications>();
                
                for(Comunications coms : d.getLogs()){
                    if(coms instanceof C_SMS){
                        SMS.add(coms);
                    }
                    if(coms instanceof C_Acall){
                        Acall.add(coms);
                    }
                    if(coms instanceof C_Vcall){
                        Vcall.add(coms);
                    }
                    if(coms instanceof C_MMS){
                        MMS.add(coms);
                    }
                    if(coms instanceof C_VMMS){
                        VMMS.add(coms);
                    }
                    if(coms instanceof C_Downloads){
                        Download.add(coms);
                    }
                }
                    for(Comunications coms : SMS){
                        System.out.println("SMS com destino: " + coms.getDestinyNumber());
                        cost1 += (((C_SMS)coms).getSmsSize()/160)*PriceList.getC_SMS();
                    }
                    if(!SMS.isEmpty()){
                        System.out.println("Custo de todas as SMS: " + cost1);
                        
                    }
                        
                    for(Comunications coms : Acall){
                        System.out.println("Chamada de voz com destino: " + coms.getDestinyNumber());
                        cost2 += (((C_Acall)coms).getDuration()*PriceList.getC_Acall());
                    }
                    if(!Acall.isEmpty()){
                        System.out.println("Custo de todas as chamadas de voz: " + cost2);
                    }
                
                    for(Comunications coms : Vcall){
                        System.out.println("Chamada de video com destino " + coms.getDestinyNumber());
                        cost3 += (((C_Vcall)coms).getDuration()*PriceList.getC_Vcall());
                    }
                    if(!Vcall.isEmpty()){
                        System.out.println("Custo de todas as chamadas de video: " + cost3);
                    }
                    
                    for(Comunications coms : MMS){
                        System.out.println("Imagem de imagem com destino " + coms.getDestinyNumber());
                        cost4 += MMS.size()*PriceList.getC_MMS();
                    }
                    if(!MMS.isEmpty()){
                        System.out.println("Custo de todas as mensagens de imagem: " + cost4);
                    }
                    
                    for(Comunications coms : VMMS){
                        System.out.println("Imagem de video com destino " + coms.getDestinyNumber());
                        cost5 += VMMS.size()*PriceList.getC_VMMS();
                    }
                    if(!VMMS.isEmpty()){
                        System.out.println("Custo de todas as mensagens de video: " + cost5);
                    }
                    
                    for(Comunications coms : Download){
                        System.out.println("Descarga com o tamanho: " + ((C_Downloads)coms).getSize());
                        cost6 += ((C_Downloads)coms).DownloadSize()*PriceList.getC_Downloads();
                    }
                    if(!Download.isEmpty()){
                        System.out.println("Custo de todas as descargas: " +  cost6);
                    }
                    holdEnterCont();
            }
        }else{
            System.out.println("Os dispositivos desta conta ainda não "
                    + "efectuaram nenhuma comunicação.");
            holdEnterCont();
            return;
        }    
        
        
    }
    
    // Main
    
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
        System.out.println("#########################");
        System.out.println("####                 ####");
        System.out.println("#### Feito por:      ####");
        System.out.println("#### Hugo Pereira    ####");
        System.out.println("#### nº48319         ####");
        System.out.println("#### Curso : MIETI   ####");
        System.out.println("#### PP1 - 2016/2017 ####");
        System.out.println("####                 ####");
        System.out.println("#########################");
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