package products.food;

import products.components.ExpirationDate;

public class SweetDrinks extends FoodProducts{
    public SweetDrinks(int id, String name, int amount, String description, int price, ExpirationDate expdate) {
        super(id, name, amount, description, price, expdate);
    expdate = new ExpirationDate(12,14,13);
    }
}
