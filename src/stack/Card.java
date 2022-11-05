package stack;

public class Card {
    private int value;
    private String colour;

    public Card(int value, String colour) {
        if (value < 1 || value > 9) {
            System.out.println("Nicht erlaubter Wert: " + value);
            return;

        }

        if (!(colour.equals("blue") || colour.equals("green") || colour.equals("red") || colour.equals("yellow"))){
            System.out.println("Nicht erlaubte Farbe: " + colour);
            return;
        }

        this.colour = colour;
        this.value = value;

/*      if (colour.equals("blue") || colour.equals("green") || colour.equals("red") || colour.equals("yellow")){
            this.colour = colour;
            this.value = value;
        }
        else {
            System.out.println("Nicht erlaubte Farbe: " + colour);
        }
 */
    }

    public String toString() {
        return "Stack.Card x{" +
                "value=" + value +
                ", colour='" + colour + '\'' +
                '}';
    }

    public int getValue() {
        return value;
    }

    public String getColour() {
        return colour;
    }
}