
import java.io.FileInputStream;
import java.io.Serializable;


public class PriceList implements Serializable{

    private static double C_Acall;
    private static double C_Downloads;
    private static double C_MMS;
    private static double C_SMS;
    private static double C_VMMS;
    private static double C_Vcall;

    public static double getC_Acall(){return C_Acall;}
    public static void setC_Acall(double C_Acall){PriceList.C_Acall = C_Acall;}
    
    public static double getC_Downloads(){return C_Downloads;}
    public static void setC_Downloads(double C_Downloads)
        {PriceList.C_Downloads = C_Downloads;}
    
    public static double getC_MMS(){return C_MMS;}
    public static void setC_MMS(double C_MMS){PriceList.C_MMS = C_MMS;}
    
    public static double getC_SMS(){return C_SMS;}
    public static void setC_SMS(double C_SMS){PriceList.C_SMS = C_SMS;}
    
    public static double getC_VMMS(){return C_VMMS;}
    public static void setC_VMMS(double C_VMMS){PriceList.C_VMMS = C_VMMS;}
    
    public static double getC_Vcall(){return C_Vcall;}
    public static void setC_Vcall(double C_Vcall){PriceList.C_Vcall = C_Vcall;}

}
