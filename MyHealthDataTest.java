package fall22assignment1;
/**
* @author - Junjie Xu
* @version 1.0
* @see java.lang.Object
* @see MyHealthData.java
* @since 11.0.15
*/
import java.util.Scanner;

public class MyHealthDataTest {
	/**
	    * This this the main method to run this program.
	    * This program to show the basic information about the patients.
	    * @param args command line arguments
	    */
	public static void main(String[] args) {
		String firstName;
		String lastName;
		String gender;
		int birthYear;
		int currentYear;
		double height;
		double weight;
		
		MyHealthData healthData = new MyHealthData();
		Scanner input = new Scanner(System.in);
		
		/**
		 * prompt user to enter values
		 */
		System.out.print("Please enter first name: ");
		firstName = input.nextLine();
		healthData.setFirstName(firstName);
		System.out.print("Please enter last name: ");
		lastName = input.nextLine();
		healthData.setLastName(lastName);
		System.out.print("Please enter gender: ");
		gender = input.nextLine();
		healthData.setGender(gender);
		System.out.println("Please enter date of birth: ");
		birthYear = input.nextInt();
		input.nextLine();
		healthData.setBirthYear(birthYear);
		System.out.println("Please enter current year: ");
		currentYear = input.nextInt();
		input.nextLine();
		healthData.setCurrentYear(currentYear);
		System.out.println("Please enter height(inches): ");
		height = input.nextDouble();
		input.nextLine();
		healthData.setHeight(height);
		System.out.println("Please enter weight(lbs): ");
		weight = input.nextDouble();
		input.nextLine();
		healthData.setWeight(weight);
		
		/**
		 * to show the report
		 */
		healthData.displayMyHealthData();
		
		input.close();

	}

}
