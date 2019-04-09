
/**
 * Write a description of class Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Test
{

    
 public static void main(String[] args)
    {
        Sports team1 = new Middle();
        Sports team2 = new JV();
        Sports team3 = new Varsity();
        Sports team4 = new Varsity();
        
        //testing Middle class
        team1.addPlayer("tom");
        team1.addPlayer("sue");
        team1.addPlayer("bob");
        team1.addPlayer("ann");
        System.out.println(team1.displayTeam());
        System.out.println(team1.displayPlayer(3));
        System.out.println(team1.snack());
        
        //testing JV class
        team2.addPlayer("tom");
        team2.addPlayer("sue");
        team2.addPlayer("bob");
        team2.addPlayer("ann");
        System.out.println(team2.displayTeam());
        System.out.println(team2.displayPlayer(3));
        System.out.println(team2.starting());
        
        //testing Varsity class
        team3.addPlayer("tom");
        team3.addPlayer("sue");
        team3.addPlayer("bob");
        team3.addPlayer("ann");
        System.out.println(team3.displayTeam());
        System.out.println(team3.displayPlayer(3));
        System.out.println(team3.opponent());
        
        //testing with int data type to test generics
        team4.addPlayer(4);
        team4.addPlayer(7);
        team4.addPlayer(15);
        System.out.println(team4.displayTeam());
        System.out.println(team4.displayPlayer(0));
        System.out.println(team4.opponent());
      
    }

}
