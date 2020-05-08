
import java.util.Scanner; // importing the java.util package with the Scanner class

public class AssertTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // creating a new object called input
		
		System.out.print("Enter a number between 0 and 10: "); //print out to the console
		int number = input.nextInt(); //take in the next input from the user and assign to number
		
		//assert that the value is >=0 and <= 10
		assert (number == 0 ) : "bad number: " + number; 
		
		System.out.printf("You entered %d%n", number);

	}

}
