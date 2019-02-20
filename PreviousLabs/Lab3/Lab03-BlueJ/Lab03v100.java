// Lab03v100.java
// Student 100-point version of the Lab03 assignment.



public class Lab03v100
{
	public static void main(String[] args)
	{
      System.out.println("Lab03, 100 Point Version\n");
      int millisec = 10000123; //number of total milliseconds
      int hours = millisec/3600000 ; //number of full hours in total milliseconds
      int calculate = millisec%3600000; //calculating leftover milliseconds
      int minutes = calculate/60000; //number of full minutes
      int seconds = (calculate%60000)/1000; //number of seconds left
      int extraMilli = (calculate%60000)%1000; //number of milliseconds left
      
      //printing out all the calculations above
      System.out.println("Starting milliseconds: " + millisec);
      System.out.println("Hours: " + hours);
      System.out.println("Minutes: " + minutes);
      System.out.println("Seconds: " + seconds);
      System.out.println("Milliseconds: " + extraMilli);
      
	}
}

