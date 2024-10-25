public class Pizza {

    private String pizzaName;
    private int pizzaPrice;
    private int pizzaNumber;

    public Pizza() {
    }

    public Pizza(String pName, int pPrice, int pNum)
    {
        pizzaName = pName;
        pizzaPrice = pPrice;
        pizzaNumber = pNum;

    }

    public String getPizzaName()
    {
        return pizzaName;
    }

    public int getPizzaPrice()
    {
        return pizzaPrice;
    }

    public int getPizzaNumber()
    {
        return pizzaNumber;
    }
    public String toString()

    {
               return "Pizza:"  +  pizzaName + "Price:" + pizzaPrice + "PizzaNr" + pizzaNumber;
    }

 }






