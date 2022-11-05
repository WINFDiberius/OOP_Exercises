package rezeptverwaltung;

public class Ingredient {

    String ingridientName; //Gibt die Zutat an

    double amount;

    public Ingredient(String ingridient, double amount) {
        this.ingridientName = ingridient;
        this.amount = amount;
    }

    public String getIngridientName() {
        return ingridientName;
    }

    public double getAmount() {
        return amount;
    }
}
