package OODPg5;
/**
 * Represents a dessert sold in the restaurant
 * @author Group 6
 *
 */
public class Dessert implements MenuItem {
	private TypeOfItem item;
	private String name;
	private double price;
	private String description;
	
	/**
	 * Creates a dessert to be sold
	 * @param name Name of the dessert
	 * @param price Price of the dessert
	 * @param description Description of the dessert
	 */
	public Dessert(String name, double price, String description) {
		this.name = name;
		this.price = price;
		this.description = description;
		item = TypeOfItem.DESSERT;	
	}
	
	/**
	 * Print the description of the dessert
	 */
	public void printDescription() {
		System.out.println(this.description);
	}
	//getters
	/**
	 * Get the name of the dessert
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Get the price of the dessert
	 */
	public double getPrice() {
		return price;
	}
	
	/**
	 * Get the type of item (Dessert)
	 */
	public TypeOfItem getItemType() {
		return item;
	}
	
	//setters
	/**
	 * Set the name of dessert
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Set the price of the dessert
	 */

	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * Set the description for the dessert
	 */
	public void setDescription(String description) {
		this.description = description;
	}

}

