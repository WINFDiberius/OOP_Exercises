package stack;

public class Stack<T> {
    private T[] elements;
    private int counter;

    public Stack(T[] elements) {
        this.elements = elements;
        this.counter = -1;
        //counter = -1;
    }

    public void push(T newElement) {
        // cards.length == 2
        if (elements.length > counter + 1) {
            counter++;
            elements[counter] = newElement;
        }
        else {
            System.out.println("Stack ist voll: " + newElement);
        }
    }

    public T pop(){
        if (counter >= 0 && elements.length > 0) {
            T result = elements[counter];
            elements[counter] = null;
            counter--;
            return result;
        } else {
            System.out.println("Stack ist bereits leer");
            return null;
        }
    }
}