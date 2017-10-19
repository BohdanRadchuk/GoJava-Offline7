package products;

import products.components.Brand;

public class Clothes extends SuperProduct {
    String brand;
    Brand brand1 = new Brand(brand) {
    };
    public Clothes(int id, String name, int amount, String description, int price, String brand) {
        super(id, name, amount, description, price);
        this.brand = brand;

    }


}
