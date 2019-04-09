
/**
 * Write a description of class Middle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Middle<E> extends CommonSports<E>
{
        public E snack(){
        int ind = (int)(Math.random()*team.size());
        return team.get(ind);
    }
}
