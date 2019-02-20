// Lab03v80.java
// Student 80-point version of the Lab03 assignment.


public class Lab03v80
{
	public static void main(String[] args)
	{
      System.out.println("Lab03, 80 Point Version\n");
      int seconds = 10000; //number of total seconds
      int hours = seconds/3600; //number of full hours
      int calculate = seconds%3600; //calculating leftover seconds
      int minutes = calculate/60; //number of minutes left
      int extraSec = calculate%60; //number of seconds left
      
      //printing out the calculations above
      System.out.println("Starting seconds: " + seconds);
      System.out.println("Hours: " + hours);
      System.out.println("Minutes: " + minutes);
      System.out.println("Seconds: " + extraSec);
	}
}

