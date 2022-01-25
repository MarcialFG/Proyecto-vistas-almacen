package model;

public interface IDrink {
	String getName();
	Float getPrice();
	void setName(String name);
	void setprice(Float price);
	boolean equals(Object o);
	String toString();
}
