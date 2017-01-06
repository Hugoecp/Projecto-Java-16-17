import java.util.Comparator;

public class NumberOrder implements Comparator<Contact>{

    public int compare(Contact c1, Contact c2){

        if(c1.getNumber() > c2.getNumber())
            return 1;
        if(c1.getNumber() < c2.getNumber())
            return -1;
        else 
            return 0;
    }
    
}
