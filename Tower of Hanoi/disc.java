
/**
 * Creates a disc
 * 
 * @author Gary Carlson
 * @version v1
 */
public class Disc
{
    private int size;
    public Disc(int discSize){
        size = discSize;
    }

    public Disc(){
        size = 5;
    }    
    public int getDiscSize(){
        return size;
    }
}
