public class DemoClass {
    public static void main(String[] args) {

        Ingredient salt = new Ingredient("Salt",3);
        Ingredient flour = new Ingredient("Flour",200);

        Recipe gulasch = new Recipe("Potatogulasch", 2,new Ingredient[]{salt,flour});

        gulasch.printRecipe();

        Recipe gulaschFifePersons = gulasch.umrechnen(5);

        gulasch.printRecipe();

        gulaschFifePersons.printRecipe();
    }

}
