package OODPg5;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * User interface for the Restaurant Reservation and Point of Sale System of the restaurant
 * @author Group 5
 *
 */
public class RRPSS {
	/**
	 * Creates an user interface for the Restaurant Reservation and Point of Sale System
	 */
	public RRPSS(){}
	/**
	 *  Scanner to scan user input
	 */
	static Scanner sc = new Scanner(System.in);
	/**
	 * User interface for RRPSS
	 * @param args An array of command-line arguments
	 */
	public static void main(String[] args) {	
		Menu menu = new  Menu();
		ArrayList<Table> tableList = new ArrayList<Table>();
		TableManager tables = new TableManager(tableList);
		SaleRevenue sales = new SaleRevenue();
		ArrayList<Staff> staffs = new ArrayList<Staff>();
		int c=0;
		System.out.println("Input Staff members to roster!");
		do {
			staffs.add(new Staff());
			System.out.println("Enter any character to continue adding.(-1 to start)");
			if(sc.hasNextInt()) {
				c =sc.nextInt();
			}
			else {
				sc.next();
			}
		} while (c!=-1);
		RestaurantManager.start(menu, tables, sales, staffs);
	}
}
