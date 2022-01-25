package model;

public interface IStore {
	boolean addDrink(IDrink drink);
	boolean searchDrink(String name);
	IDrink getDrink(String name);
	boolean updateDrink(String name,IDrink drink);
	boolean isfull();
	float howMuch();
	
	/**
	 * 
	 * @param type
	 * @return
	 */
	Integer howMany(DrinkType type);
}
