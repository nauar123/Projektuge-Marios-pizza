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
}
}