import java.util.ArrayList;
/**
 * Creates a tower object which holds an ArrayList of discs.
 * 
 * @author Gary Carlson
 * @version v2
 */
public class Tower
{
    ArrayList<Disc> tower;
    private int removedSize;

    public Tower(){
        tower = new ArrayList<Disc>();
    }

    public boolean moveDisc(Tower fromTower, Tower toTower){
        /**
         * Moves disc between fromTower and toTower 
         * @return true if successfully moved disc, false for any other case
         */

        if (fromTower == toTower){
            System.out.println("Invalid movement, disc already on tower, choose different tower.");
            return false;
        }

        else if (fromTower.getDisc() > toTower.getDisc()){
            System.out.println("Invalid movement, moving disc is bigger than placed disc.");
            return false;
        }

        else{
            fromTower.removeDisc();
            //toTower.addDisc();
            return true;
        }

    }

    public int getDisc(){
        return tower.get(0).getDiscSize();
    }

    public int removeDisc(){
        removedSize = this.getDisc();
        if(tower.size() > 0){
            tower.remove(0);
            return removedSize;
        }
        return removedSize;
    }

    public boolean addDisc(Disc disc){
        tower.add(0,disc);
        return true;
    }

}
