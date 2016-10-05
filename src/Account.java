
import java.util.ArrayList;
import java.util.HashMap;

public class Account {
    
    // Class variavels
    
    private static long ACCOUNT_ID = 0;
    
    // Class Getters & Setters
    
    public static long getACCOUNT_ID() {
        return ACCOUNT_ID;
    }

    public static void setACCOUNT_ID(long ACCOUNT_ID) {
        Account.ACCOUNT_ID = ACCOUNT_ID;
    }
    
    // Interface variavels
    
    private long id;
    private ArrayList<Device> DeviceList;
    private HashMap<Client, Invoice> accInvoice;
    
    // Construtors
    
    // Clone Construtor
    
    // Interface Getters & Setters
    
    // Methods

    
}
