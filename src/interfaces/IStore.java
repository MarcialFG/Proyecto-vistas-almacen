package interfaces;

import model.DrinkType;

public interface IStore {
	boolean addDrink(IDrink drink);
	boolean searchDrink(String name);
	IDrink getDrink(String name);
	boolean updateDrink(String name,IDrink drink);
	boolean isFull();
	Float howMuch();
	/**
	 * 
	 * @param type of drink to be counted
	 * @return
	 */
	Integer howMany(DrinkType type);
}
