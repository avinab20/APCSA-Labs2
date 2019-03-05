// Lab12av100.java     This is the student starting version.
// This assignment pertains to some of the "Magpie" AP Lab Materials
//***************************************************************************
// The "Magpie" AP Lab is created for the College Board APCS
// curriculum by Laurie White.
// Leon Schram has altered some of the "Magpie" files to focus on 
// specific CS topics as the "Magpie" Lab is integrated into the curriculum.

 
import java.util.Scanner;
import java.util.ArrayList;

public class Lab12av100
{
    public static void main(String[] args)
    {
        MagpieLab12a maggie = new MagpieLab12a();

        System.out.println (maggie.getGreeting());
        Scanner in = new Scanner (System.in);
        String statement = in.nextLine();

        while (!statement.equals("Bye"))
        {
            System.out.println (maggie.getResponse(statement));
            statement = in.nextLine();
        }
    }
}


class MagpieLab12a
{
    public String getGreeting()
    {
        return "Hello, let's talk.";
    }

    public String getResponse(String statement)
    {
        String response = "";
        int r = (int)(Math.random() * 10);
        ArrayList<String> list = new ArrayList<String>();
        
        list.add("Tell me more about your family.");
        list.add("Do you have siblings?");
        list.add("Where were you born?");
        list.add("Tell me about your parents.");
        list.add("Does your family live close?");
        list.add("Where is your family from?");
        list.add("Are you close with your family?");
        list.add("That sounds fun.");
        list.add("What are your hobbies?");
        list.add("That's very interesting.");
        
        if (statement.indexOf("no") >= 0)
        {
            response = "Why so negative?";
        }
        else if (statement.indexOf("mother") >= 0
                || statement.indexOf("father") >= 0
                || statement.indexOf("sister") >= 0
                || statement.indexOf("brother") >= 0
                || statement.indexOf("family") >= 0
                || statement.indexOf("parent") >= 0)
        {
            response = list.get(r);
        }
        else
        {
            response = getRandomResponse();
        }
        return response;
    }

    private String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 10;
        int r = (int)(Math.random() * NUMBER_OF_RESPONSES);
        String response = "";
        String[] list = {"Interesting, tell me more.", "Hmmm.", "Do you really think so?", "You don't say.", "Wow, I didn't know that.",
                         "Let's talk about something else.", "What else?", "What music do you listen to?", "Did you watch any movies recently?",
                         "Are you exited for spring break?"};
        response = list[r];
        
        return response;
    }
}
