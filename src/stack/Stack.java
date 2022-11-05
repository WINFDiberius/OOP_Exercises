package stack;

public class CardStack {
    private Stack[] cards;
    private int counter;

    public CardStack(Stack[] cards) {
        this.cards = cards;
        this.counter = -1;
        //counter = -1;
    }

    public void push(Stack newElement) {
        // cards.length == 2
        if (cards.length > counter + 1) {
            counter++;
            cards[counter] = newElement;
        }
        else {
            System.out.println("Stack ist voll: " + newElement);
        }
    }

    public Stack pop(){
        if (counter >= 0) {
            Stack result = cards[counter];
            counter--;
            return result;
        } else {
            System.out.println("Stack ist bereits leer");
            return null;
        }
    }
}