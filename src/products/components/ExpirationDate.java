package products.components;

public class ExpirationDate {
    int creationdate;
    int temperature;

    public int getCreationdate() {
        return creationdate;
    }

    public int getTemperature() {
        return temperature;
    }

    public int getExpirationdatetime() {
        return expirationdatetime;
    }

    int expirationdatetime;

    public ExpirationDate(int creationdate, int temperature, int expirationdatetime) {
        this.creationdate = creationdate;
        this.temperature = temperature;
        this.expirationdatetime = expirationdatetime;
    }
}
