
import java.util.Scanner;
public class Avg_Rainfall 
{
	private static Scanner dataIn;
	static double getInches(Scanner dataIn, int numberDays)
	{
		double total=0.0;
		double inches;
		int days=1;
		while(days<=numberDays)
		{
			System.out.println("Enter rainfall amount.");
			inches=dataIn.nextDouble();
			total+=inches;
			days++;
		}
		return total;
	}

	public static void main(String[] args) 
		// TODO Auto-generated method stub
//main() is where the execution starts. It declares variables, instantiates the Scanner object,
//prompts for and reads the number of days of rain,calls a helper methid to read and sum the rainfall amounts,
//and prints the average rain fall on the screen
	{
		double total_rainfall;
		double average;
		int numDays;
		dataIn=new Scanner(System.in);
		System.out.println("Enter the number of data values:");
		numDays=dataIn.nextInt();
		total_rainfall=getInches(dataIn, numDays);
		if(numDays==0)
			System.out.println("Average rainfall cannot be computed for 0 days.");
		else
		{
			average=total_rainfall/numDays;
			System.out.println("The average rainfall over "+numDays+" days is "+average);
		}
	}

}
