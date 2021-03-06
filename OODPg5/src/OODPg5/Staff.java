package OODPg5;

import java.util.Scanner;

/**
 * Represents a staff of the restaurant
 * @author Group 5
 *
 */
public class Staff {
	/**
	 *  Scanner to scan user input
	 */
	Scanner sc = new Scanner(System.in);

	/**
	 * Initialized employee ID of the staff
	 */
	private static int ID = 0;

	
	/**
	 * Name of the staff
	 */
	private String name;
	
	/**
	 * Gender of the staff
	 */
	private char gender;
	
	/**
	 * Employee ID of the staff
	 */
	private int employeeID;
	
	/**
	 * Job title of the staff
	 */
	private String jobTitle;
	
	//constructors
	
	/**
	 * Creates a staff of the restaurant with user inputs of name, gender and job title
	 */
	public Staff() {
		
		System.out.println("Enter name of Staff");
		name = sc.nextLine();
		System.out.println("Enter gender(M/F)");
		gender = Character.toUpperCase(sc.nextLine().charAt(0));
		while(gender != 'M' && gender != 'F'){
			System.out.println("Enter a valid gender M/F");
			gender = Character.toUpperCase(sc.nextLine().charAt(0));
		}
		employeeID = ID++;
		System.out.println("Enter Job Title");
		jobTitle = sc.nextLine();
		System.out.printf("Employee %s (%c), %s, will be on duty today!\n",name,gender,jobTitle);
	}
	/**
	 * Creates a staff of the restaurant
	 * @param name Name of the staff
	 * @param gender Gender of the staff
	 * @param jobTitle Job title of the staff
	 */
	
	public Staff(String name, char gender, String jobTitle) {
		this.name  = name;
		this.gender = gender;
		this.jobTitle = jobTitle;
		employeeID = ID++;
	}

	//getters
	
	/**
	 * Get the name of the staff
	 * @return Name of the staff
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Get the gender of the staff
	 * @return Gender of the staff
	 */
	public char getGender() {
		return gender;
	}
	/**
	 * Get the employee ID of the staff
	 * @return Employee ID of the staff
	 */

	public int getEmployeeID() {
		return employeeID;
	}
	/**
	 * Get the job title of the staff
	 * @return Job title of the staff
	 */

	public String getJobTitle() {
		return jobTitle;
	}

}
