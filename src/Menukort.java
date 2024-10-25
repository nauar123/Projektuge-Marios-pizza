import java.util.ArrayList;

public class Menukort {

    public Menukort()
    {}

    public ArrayList<Pizza> pizzaMenu = new ArrayList<>();

    public void createMenukort(){

        pizzaMenu.add(new Pizza("Margherita", 60, 1));
        pizzaMenu.add(new Pizza("Pepperoni", 70, 2));
        pizzaMenu.add(new Pizza("Hawaiian", 75, 3));
        pizzaMenu.add(new Pizza("BBQ Chicken", 85, 4));
        pizzaMenu.add(new Pizza("Vegetarian", 65, 5));
        pizzaMenu.add(new Pizza("Meat Lovers", 90, 6));
        pizzaMenu.add(new Pizza("Four Cheese", 80, 7));
        pizzaMenu.add(new Pizza("Buffalo Chicken", 95, 8));
        pizzaMenu.add(new Pizza("Supreme", 100, 9));
        pizzaMenu.add(new Pizza("Mexican", 85, 10));
        pizzaMenu.add(new Pizza("Seafood Special", 110,11));
        pizzaMenu.add(new Pizza("Tuna and Sweetcorn", 95, 12));
        pizzaMenu.add(new Pizza("Spicy Sausage", 80, 13));
        pizzaMenu.add(new Pizza("Prosciutto and Rocket", 90, 14));
        pizzaMenu.add(new Pizza("Mushroom and Truffle Oil", 120, 15));
        pizzaMenu.add(new Pizza("Calzone", 85, 16));
        pizzaMenu.add(new Pizza("Carbonara Pizza", 90, 17));
        pizzaMenu.add(new Pizza("Pesto and Chicken", 95, 18));
        pizzaMenu.add(new Pizza("Gorgonzola and Pear", 110, 19));
        pizzaMenu.add(new Pizza("Salami and Olive", 80, 20));
        pizzaMenu.add(new Pizza("Spinach and Ricotta", 70, 21));
        pizzaMenu.add(new Pizza("Greek Pizza (Feta and Olives)", 75, 22));
        pizzaMenu.add(new Pizza("Zucchini and Goat Cheese", 85, 23));
        pizzaMenu.add(new Pizza("Egg and Bacon", 100, 24));
        pizzaMenu.add(new Pizza("Shrimp and Pesto", 90, 25));
        pizzaMenu.add(new Pizza("Tandoori Chicken", 110, 26));
        pizzaMenu.add(new Pizza("Pastrami Pizza", 95, 27));
        pizzaMenu.add(new Pizza("Bolognese Pizza", 85, 28));
        pizzaMenu.add(new Pizza("Quattro Stagioni", 105, 29));
        pizzaMenu.add(new Pizza("Lamb and Mint", 115, 30));

        for(int i=0; i<pizzaMenu.size(); i++)
        {
            System.out.println(pizzaMenu.get(i);
        }






    }

}
