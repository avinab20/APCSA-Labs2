
/**
 * Abstract class CommonSports - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
 
import java.util.ArrayList;

public abstract class CommonSports<E> implements Sports<E>
{
    ArrayList<E> team;
    public CommonSports(){
    team = new ArrayList<E>();
    }
    
    public void addPlayer(E obj){
        team.add(obj);
    }
    public String displayTeam(){
        String toString = "";
        for (E item: team){
            toString += item + " ";
        }
        return toString;
    }
    public String displayPlayer(int ind){
        String player = "" + team.get(ind);
        return player;
    }
    public E snack(){
        return null;
    }
    public String starting(){
        return "";
    }
    public String opponent(){
        return "";
    }
}
