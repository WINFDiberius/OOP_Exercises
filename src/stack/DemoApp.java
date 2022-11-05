package stack;

public class DemoApp {
    public static void main(String[] args) {
        System.out.println("Hello World");


        Card card = new Card(1, "red");

        System.out.println(card);

        Card[] array = new Card[2];
        Stack<Card> cardStack = new Stack(array);

        cardStack.push(new Card(3 , "yellow"));
        cardStack.push(card);
        cardStack.push( new Card(7, "green"));

        Card c1 = cardStack.pop();
        System.out.println("c1 = " + c1);
        Card c2 = cardStack.pop();
        System.out.println("c2 = " + c2);
        System.out.println("card = " + card);

        if (card == c2) {
            System.out.println("true");
        }


        cardStack.push(new Card(9, "blue"));
        Card c3 = cardStack.pop();
        System.out.println("c3 = " + c3);
        Card c4 = cardStack.pop();
        System.out.println("c4 = " + c4);
        //Stack.Card c5 = cardStack.pop();
    }
}