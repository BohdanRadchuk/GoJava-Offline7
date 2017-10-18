package products.food;

import products.SuperProduct;
import products.components.ExpirationDate;

public abstract class FoodProducts extends SuperProduct {
    ExpirationDate expdate;

    public FoodProducts(int id, String name, int amount, String description, int price, ExpirationDate expdate) {
        super(id, name, amount, description, price);
        this.expdate = expdate;
    }
}
