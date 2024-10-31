import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Main nonStaticMain = new Main(); // vi arbejder udenom static og derfor skrivervi det her.
        nonStaticMain.run(); // den her gør at den runner filen igennem.
    }

    private void run() {
        //Metoderne til oprettelese af menukort:
        Menukort menukortInstans = new Menukort(); // vi skal oprette en ny menukort for at kunne bruge den indenunder main klassen.
        menukortInstans.createMenukort();
        menukortInstans.writePizzaMenuFile(); // vi kalder på filen.




        //Metoderne til at oprette bestillingslisten:
        Bestillingsliste bestillingsliste = new Bestillingsliste();

        while (true) {
            //
            System.out.println("vælg en pizza (eller tast 'exit' for at gå ud af det, eller 'remove' for at fjerne ordren)");
            String pizzaNumber = scanner.nextLine();

            // denne metode gør at hvis man taster exit vil den gå ud af programmet.
            if (pizzaNumber.equalsIgnoreCase("exit")) {
                break;
            }
            // Denne metode gør at hvis man taster remove spørger den om nummeret man vil fjerne og så remover den det.
            else if (pizzaNumber.equalsIgnoreCase("remove")) {
                System.out.println("Enter the order number to remove:");
                int ordreToRemove;

                try {
                    ordreToRemove = Integer.parseInt(scanner.nextLine());
                    bestillingsliste.removeOrdreByNr(ordreToRemove);
                    System.out.println("Ordre nummer" + ordreToRemove + " er blevet fjernet.");
                } catch (NumberFormatException e) {
                    System.out.println("forkert input! Please tast et et valid nummer");
                }
            }

            try {
                int pizzaNr = Integer.parseInt(pizzaNumber) - 1; //


                // Denne metode tjekker om pizza nummeret er valid
                if (pizzaNr < 0 || pizzaNr >= menukortInstans.getPizzaMenuList().size()) {
                    System.out.println("Invalid pizza nuummer. Please vælg et valid pizza nummer.");
                }

                Pizza selectedPizza = menukortInstans.getPizzaMenuList().get(pizzaNr);

                Ordre ordre = new Ordre(bestillingsliste.getCurrentOrdreNr(), LocalDate.now(),LocalDateTime.now(),selectedPizza);
                bestillingsliste.addOrdreToList(ordre);

                // PRINT ny ordre Pizza info
                System.out.println("Ordre tilføjet: " + ordre);
            }catch (NumberFormatException e) {
                System.out.println("Forkert imput! Please tast et valid pizza nummer eller 'Exit' for at gå ud af programmet. ");

            }
            bestillingsliste.addRemovedrdersToFile();

        }
    }
}

