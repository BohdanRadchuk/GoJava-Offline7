import products.Clothes;
import products.components.ExpirationDate;
import products.food.Sweeties;
import products.technical.Smartphone;

public class main {
    public static void main(String[] args) {
        ExpirationDate expirationDate = new ExpirationDate(10,10,10);
        Smartphone smartphone = new Smartphone(1,"as",3,"asdasdphone", 100,1);
        Clothes clothes = new Clothes(1,"scarf",20,"warm scarf",20,"dg");
        Sweeties sweeties = new Sweeties(1,"cake", 5,"with nuts",15,expirationDate );

    }
}
