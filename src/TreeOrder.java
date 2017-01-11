
import java.io.Serializable;
import java.util.Comparator;

public class TreeOrder implements Comparator<Contact>, Serializable{
    
    public int compare(Contact c1, Contact c2){
        
        return (c1.getName().compareTo(c2.getName()));
    }
}
