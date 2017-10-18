package products;

import products.components.Brand;

public class Clothes extends SuperProduct {
    public Clothes(int id, String name, int amount, String description, int price) {
        super(id, name, amount, description, price);
    }
    Brand brand = new Brand() {
    };

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

}
