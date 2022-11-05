package rezeptverwaltung;

public class Recipe {

    String recipeName;

    int persons;



    Ingredient[] ingredientList = new Ingredient[300];

    public Recipe(String recipeName, int persons, Ingredient[] ingredientList) {
        this.recipeName = recipeName;
        this.persons = persons;
        this.ingredientList = ingredientList;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public int getPersons() {
        return persons;
    }

    public Ingredient[] getIngredientList() {
        return ingredientList;
    }

    public void printRecipe()
    {
        System.out.println("rezeptverwaltung.Recipe Name: " + recipeName);
        for (int i = 0; i < ingredientList.length; i++) {
            if(ingredientList[i] == null)
                break;
            System.out.println("Ingriedient Name: " + ingredientList[i].ingridientName);
            System.out.println("Ingriedient Amount: " + ingredientList[i].amount);
        }
    }

    public Recipe umrechnen(int persons)
    {
        double onePersonIngridient;

        Ingredient[] newIngriedientList = new Ingredient[ingredientList.length];

        for (int i = 0; i < ingredientList.length; i++)
        {
            if(ingredientList[i] == null)
                break;
        onePersonIngridient = ingredientList[i].amount / this.persons;
        newIngriedientList[i] = new Ingredient(ingredientList[i].ingridientName,onePersonIngridient * persons);

        }

        return new Recipe(getRecipeName(),persons,newIngriedientList);
    }
}
