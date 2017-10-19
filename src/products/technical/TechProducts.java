package products.technical;

import products.SuperProduct;

public abstract class TechProducts extends SuperProduct {
    int assuranceterm;
    public TechProducts(int id, String name, int amount, String description, int price, int assuranceterm) {
        super(id, name, amount, description, price);
        this.assuranceterm = assuranceterm;
    }


}
