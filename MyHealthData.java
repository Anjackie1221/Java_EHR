package fall22assignment1;

/**
* @author - Junjie Xu
* @version 1.0
* @see java.lang.Object
* @since 11.0.15
*/

public class MyHealthData {
	
	//This system maintains important health information about a patient.
	//Note: This class assumes values passed to the set methods are correct.
	
	/**
	 * to show user's first name
	 */
	private String firstName;
	
	/**
	 * to show user's last name
	 */
	private String lastName;
	
	/**
	 * to show user's gender
	 */
	private String gender;
	
	/**
	 * to show user's year of birthday
	 */
	private int birthYear;
	
	/**
	 * to show current year
	 */
	private int currentYear;
	
	/**
	 * to show user's height
	 */
	private double height;
	
	/**
	 * to show user's weight
	 */
	private double weight;
	
	
	/**
	 * create no-argument constructor
	 */
	public MyHealthData() {
		
	}
	
	/**
	 * create over-load constructor
	 * @param firstName string type of user first name
	 * @param lastName string type of user last name
	 * @param gender string type of user's gender
	 * @param height double type of user's height
	 * @param weight double type of user's weight
	 * @param birthYear integer type of the year of birth
	 * @param currentYear integer type of the current year
	 */
	public MyHealthData(String firstName,String lastName,String gender,double height,double weight,int birthYear,int currentYear) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
		this.birthYear = birthYear;
		this.currentYear = currentYear;
	}
	
	/**
	 * method to get the variable firstName's value
	 * @return first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * method to set variable firstName to certain input value
	 * @param firstName string data type
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * method to get the variable lastName's value
	 * @return last name
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * method to set variable lastName to certain input value
	 * @param lastName string data type
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * method to get the variable Gender's value
	 * @return gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * method to set variable Gender to certain input value
	 * @param gender string data type
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * method to get the variable birthYear's value
	 * @return birthYear
	 */
	public int getBirthYear() {
		return birthYear;
	}

	/**
	 * method to set variable birthYear to certain input value
	 * @param birthYear integer data type of the year of birthday
	 */
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	/**
	 * method to get the variable currentYear's value
	 * @return currentYear
	 */
	public int getCurrentYear() {
		return currentYear;
	}

	/**
	 * method to set variable currentYear to certain input value
	 * @param currentYear integer data type of the current year
	 */
	public void setCurrentYear(int currentYear) {
		this.currentYear = currentYear;
	}

	/**
	 * method to get variable height's value
	 * @return height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * method to set variable height to certain input value
	 * @param height double data type
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * method to get variable weight's value
	 * @return weight
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * method to set variable weight to certain input value
	 * @param weight double data type
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	 * this method is used to calculated ages between currentYear and birthYear
	 * @return ages
	 */
	public int calculAge() {
		int ages = currentYear - birthYear;
		return ages;
	}
	
	/**
	 * this method is used to calculated the maxRate by subtracting ages from 220 
	 * @return maxRate
	 */
	public int calculHeartRate() {
		int maxRate = 220 - calculAge();
		return maxRate;
	}
	
	/**
	 * this method is used to calculated the (max range)maxTargetRate which is 50% of the maxRate
	 * @return maxTargetRate
	 */
	public int calculMaxRate() {
		int maxTargetRate = 50 * calculHeartRate() / 100;
		return maxTargetRate;
	}
	
	/**
	 * this method is used to calculated the (minimum range)minTargetRate which is 85% of the maxRate
	 * @return minTargetRate
	 */
	public int calculMinRate() {
		int minTargetRate = 85 * calculHeartRate() / 100;
		return minTargetRate;
	}
	
	/**
	 * this method will calculate the BMI value based on the height and weight values
	 * @return BMI value
	 */
	public double getBMI() {
	   return (getWeight() * 703) / (getHeight() * getHeight());
	} 

	/**
	 * method to display the result
	 */
	public void displayMyHealthData() 
	{ 
		System.out.printf("FirstName is: %s\n", getFirstName());
		System.out.printf("LastName is: %s\n", getLastName());
		System.out.printf("Gender is: %s\n", getGender());
		System.out.printf("Birth year is: %d\n", getBirthYear());
		System.out.printf("Height is: %.1f \n", getHeight());
		System.out.printf("Weight is: %.1f \n", getWeight());
		System.out.printf("Age is: %d years old\n", calculAge());
		System.out.printf("BMI is: %f\n", getBMI());
		System.out.printf("Maximum Heart Rate is: %d\n", calculHeartRate());
		System.out.printf("Maximum Target Heart Rate is: %d\n", calculMaxRate());
		System.out.printf("Minimum Target Heart Rate is: %d\n", calculMinRate());

	   System.out.println("BMI VALUES");
	   System.out.println("Underweight: less than 18.5");
	   System.out.println("Normal:      between 18.5 and 24.9");
	   System.out.println("Overweight:  between 25 and 29.9");
	   System.out.println("Obese:       30 or greater");   
	} 

	} // end class MyHealthData

