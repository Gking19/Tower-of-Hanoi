
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
        this(0);
    }
    
    public boolean moveDisc(Tower fromTower, Tower toTower){
        /**
         *Moves disc between fromTower and toTower 
         * @return true if successfully moved disc, false for any other case
         */
        
        if (fromTower == toTower){
            System.out.println("Invalid movement, choose different tower.");
            return false;
        }
        
        return true;
    }
    
    public int getDiscSize(){
        return size;
    }
}
