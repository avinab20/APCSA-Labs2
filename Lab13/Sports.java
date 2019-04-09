

/**
 * Write a description of interface Sports here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface Sports<E>
{
    public void addPlayer(E obj);
    public String displayTeam();
    public String displayPlayer(int ind);
    public E snack();
    public String starting();
    public String opponent();
}
