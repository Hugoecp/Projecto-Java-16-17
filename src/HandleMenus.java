public class HandleMenus{
    
    public void MainMenu(){
           
        System.out.println("*************************************************");
        System.out.println("*************************************************");
        System.out.println("**                                             **");
        System.out.println("**                   Vos                       **");
        System.out.println("**                                             **");
        System.out.println("**    Main Menu                                **");
        System.out.println("**                                             **");
        System.out.println("**                                             **");
        System.out.println("**  1) Clientes                                **");
        System.out.println("**  2) Contas                                  **");
        System.out.println("**  3) Dispositivos                            **");
        System.out.println("**  4) Comunicações                            **");
        System.out.println("**  5) Facturação                              **");
        System.out.println("**                                             **");
        System.out.println("**                         0) Save & Exit      **");
        System.out.println("**                                             **");
        System.out.println("*************************************************");
        System.out.println("*************************************************");
       }
    
    public void MenuClientes(){
        
        System.out.println("*************************************************");
        System.out.println("*************************************************");
        System.out.println("**                                             **");
        System.out.println("**                Clientes                     **");
        System.out.println("**                                             **");
        System.out.println("**                                             **");
        System.out.println("**                                             **");
        System.out.println("**  1) Novo                                    **");
        System.out.println("**  2) Remover                                 **");
        System.out.println("**  3) Listar Clientes                         **");
        System.out.println("**  4) Comunicações                            **");
        System.out.println("**  5) Facturação                              **");
        System.out.println("**                                             **");
        System.out.println("**                                             **");
        System.out.println("**                                             **");
        System.out.println("*************************************************");
        System.out.println("*************************************************");
    }
    
    public void callMenu(int c){
        
        HandleMenus menu = new HandleMenus();
        switch(c){
            case 1: menu.MainMenu();
                    break;
            case 2: menu.MenuClientes();
                    break;
            default: break;
        }
        
    }
}
