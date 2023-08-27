package app;

public class Weapon extends Product {
	private int damage;

	public Weapon(String name, String description, int quantity, int cartQuant, double price, int damage) {
		super(name, description, quantity, cartQuant, price);
		this.damage= damage;
}
	public int getDamage() {
		return this.damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	@Override
	public void displayProduct() {
		//System.out.println(name + ", " + description + ", " + quantity + ", " + price + ", " + damage);
		System.out.println(name + ", " + price + " gold");
	}
	@Override
	public String toString() {
		return (name + ", " + description + ". Does " + damage + " damage. Currently "+ quantity + " in stock. " + "Costs " + price + " gold.");
	}
	@Override
	public void displayInCart() {
		System.out.println(name + ", " + price + " gold. " + cartQuant + " in cart.");
	}
}
