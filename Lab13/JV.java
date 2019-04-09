
/**
 * Write a description of class JV here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class JV<E> extends CommonSports<E>
{
    public String starting(){
        E temp;
        for (int i = 0; i < 1000; i++){
            int first = (int) (Math.random() * team.size());
            int last = (int) (Math.random() * team.size());
            temp = team.get(first);
            team.set(first, team.get(last));
            team.set(last, temp);
        }
        return displayTeam();
    }
}
