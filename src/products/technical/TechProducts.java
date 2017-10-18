package products.technical;

import products.SuperProduct;

public abstract class TechProducts extends SuperProduct {
    int assurance;
    public TechProducts(int id, String name, int amount, String description, int price, int assurance) {
        super(id, name, amount, description, price);
        this.assurance = assurance;
    }


}
