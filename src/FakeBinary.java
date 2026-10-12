import java.util.Scanner;

public class FakeBinary {
	public static void main (String [] args)
	{
	pickNumber();
	}
	public static void pickNumber()
	{
	Scanner userStringInput = new Scanner (System.in);
	System.out.println ("Insert your number.");
	String number = userStringInput.nextLine();
	String[] fakeBinary = fakeBinary(number);
	for (int i = 0; i < fakeBinary.length; i++)
	System.out.print(fakeBinary[i]);
	}
	private static String[] fakeBinary(String number) 
	{
	    String [] fakeBinary = new String[number.length()];
	    for (int i = 0; i < fakeBinary.length; i++)
	    {
	    	if (number.substring(i,i+1).equals("0")||number.substring(i,i+1).equals("1")||number.substring(i,i+1).equals("2")||number.substring(i,i+1).equals("3")||number.substring(i,i+1).equals("4"))
	    	{
	    	fakeBinary[i] = "0";
	    	}
	    	else
	    	{
	        fakeBinary[i] = "1";	
	    	}
	    }
		return fakeBinary;
	}
}
