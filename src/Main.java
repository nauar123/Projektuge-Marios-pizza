import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

public static void main (String[] args)
{
    Main nonStaticMain = new Main(); // vi arbejder udenom static og derfor skrivervi det her.
    nonStaticMain.run(); // den her gør at den runner filen igennem.
}
private void run(){
    Menukort menukortInstans = new Menukort(); // vi skal oprette en ny menukort for at kunne bruge den indenunder main klassen.
    menukortInstans.createMenukort();
    menukortInstans.writePizzaMenuFile(); // vi kalder på filen.

    // vi kalder på generingen af random kunders bestillinger:

    System.out.println("her");
    System.out.print(menukortInstans.getRandomPizza());

    // vi skal få printet bestilingslisten ud med brug af scanner, så når man taster 1 ind vil magrarihta komme frem.


}
}