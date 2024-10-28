import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

public static void main (String[] args)
{
    Main nonStaticMain = new Main(); // vi arbejder udenom static og derfor skrivervi det her.
    nonStaticMain.run(); // den her gør at den runner filen igennem.
}
private void run() {
    Menukort menukortInstans = new Menukort(); // vi skal oprette en ny menukort for at kunne bruge den indenunder main klassen.
    menukortInstans.createMenukort();
    menukortInstans.writePizzaMenuFile(); // vi kalder på filen.

    // vi kalder på generingen af random kunders bestillinger:
    System.out.println("her");
    System.out.print(menukortInstans.getRandomPizza());




    // Opgave vi skal få printet bestilingslisten ud med brug af scanner, så når man taster 1 ind vil magrarihta komme frem.


    menukortInstans.createMenukort(); // vi creater den her for at bruge den i metoden under:


    for(int i = 0; i < menukortInstans.getPizzaMenuList().size();i++) // vi vil kalde på menukortet og få den til at løbe det igennem derfor bruger vi for loop.
    {
        System.out.println(menukortInstans.getPizzaMenuList().get(i));
    }


    // vi bruger scanner til at kunne taste et pizzanummer ind og få printet pizza navnet, pizzaprisen og pizza nummeret ud.
    System.out.println("Skriv pizzanummeret ind");
    int number = Scanner.nextInt();
    Scanner.nextLine();  // man skal altid skrive scanner.nextLine efter man har skrevet scanner.nextInt();


    // Vi igang med at hive menukortet til bestillingslisten:
    Pizza selectedPizza = menukortInstans.getPizzaMenuList().get(Number);
    Pizza chosenPizza = new Pizza (selectedPizza.getPizzaName().selectedPizza.getPizzaPrice().selectedPizza.getPizzaNumber());


    // når vi vælger nummeret 1 vil den printe nr 1 plads i arraylistens pizzaNavn, PizzaPris og pizzanummeret
    Ordre ordre = new Ordre(1,LocalDateTime.now(),LocalDate.now(),chosenPizza);
    System.out.println(ordre);
    }

}