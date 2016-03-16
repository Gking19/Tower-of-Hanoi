import java.util.ArrayList;
/**
 * Write a description of class tower here.
 * 
 * @author Gary Carlson
 * @version v2
 */
public class Tower
{
    ArrayList<Disc> tower;
    private Tower fromTower;
    private Tower toTower;
    private Tower tower1;
    private Tower tower2;
    private Tower tower3;
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
        }

        else{
            //fromTower.removeDisk(  );
            //toTower.addDisk(Disc Disc);
        }

        return true;
    }

    public int getDisc(){
        return tower.get(0).getDiscSize();
    }

    public boolean removeDisk(){
        if(tower.size() > 0){
            tower.remove(0);
            return true;
        }
        return false;
    }

    /* public addDisc(Disk disk){

    }
     */

}
