package products.food;

import products.components.ExpirationDate;

public class Sweeties extends FoodProducts {
    int creationdate;
    int temperature;
    int experationdateterm;



    ExpirationDate expirationDate = new ExpirationDate(creationdate,temperature,experationdateterm);
    public Sweeties(int id, String name, int amount, String description, int price, ExpirationDate expdate) {
        super(id, name, amount, description, price, expdate);
    }


    /*public Sweeties(int id, String name, int amount, String description, int price, ExpirationDate expdate) {
        super(id, name, amount, description, price, expdate);
    }
*/
}
