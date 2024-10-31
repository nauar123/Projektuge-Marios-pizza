import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;



public class Bestillingsliste {

    // lav en liste med bestillinger

    public Bestillingsliste() {
    }

    private ArrayList<Ordre> bestillingsListeArrayList = new ArrayList<>(); // ordreList holder alle ordrene via en arrayliste.
    private ArrayList<Ordre> ordreHistorikArrayList = new ArrayList<>();   // arraylist til ordrehistorik.
    private int currentOrdreNr = 1; // vi afklære at artiputten currentOrdreNr er lig 1, så den starter fra 1 af.

    public void addOrdreToList(Ordre ordre) // metoden tager en Ordre som parameter
    {
        bestillingsListeArrayList.add(ordre); // ordre biver tilføjet til ordreList.
        currentOrdreNr++; // Denne metode sørger for at ordrenummeret stiger for hver ny ordre. Det sikre at den stiger med 1 hvergang. fra 1 til 2 osv.
    }

    public void printBestillingsliste() {
        for (int i = 0; i < bestillingsListeArrayList.size(); i++)  // den går igennem hver ordre i ordrelisten.
        {
            Ordre ordre = bestillingsListeArrayList.get(i); // Ordre ordre = ordreList.get(i); henter en bestemt ordre fra listen ordreList og gemmer den i variablen ordre.
            System.out.println(ordre);  // her kaldes der på Ordre-klassens toString()-metode, Det vi skrev i  toString()-metoden udskrives.
        }
    }

    public int getCurrentOrdreNr() {
        return currentOrdreNr;
    }


    // Metode til at fjerne et ordrenummer fra listen:

    public void removeOrdreByNr(int ordreNumber) {   // Metoden er offentlig og kaldes removeOrdreByNr, den tager int ordrenummer som parameter.
        for (int i = 0; i < bestillingsListeArrayList.size(); i++) {  // Variablen i starter fra 0 og fortsætter, så længe den er mindre end størrelsen af ordreList.
            if (bestillingsListeArrayList.get(i).getOrdreNr() == ordreNumber) {
                // hvis ordrenummeret(.getordreNr) som er i listen (ordreList.get(i)), matcher det ordrenummer, der er som parameter (ordreNumber).
                bestillingsListeArrayList.remove(i);    // Hvis det matcher fjernes den ordre fra ordreList ved at kalde remove(i)
                writeBestillingsliste();  // så opdateres filen efter man har fjernet fra ordrelisten
                break;        // så stopper loopen ved at kalde på break;

            }
        }
    }

    public void writeBestillingsliste() {
        File bestillingsliste = new File("/Users/elev/Desktop/UNI/Programmering/InteliliJ/Projektuge Marios pizza/src/Bestillingsliste.txt");  // filen gemmes indenunder denne fil
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH.mm");
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yy");

       
        try (FileWriter writer = new FileWriter(bestillingsliste, false)) {
            if (bestillingsliste.length() == 0) {
                            writer.write("Aktive ordrer / BESTILLINGSLISTE \n\n");
                        }
            for (int i = 0; i < this.bestillingsListeArrayList.size(); i++) {
                Ordre o = this.bestillingsListeArrayList.get(i);
                Pizza pizza = o.getPizzaObjekt(); // Get

                writer.append(String.format("ORDRE:\n" +
                                " - Ordre Number: %d\n" +
                                " - Bestillings Tid: %s\n" +
                                " - Bestillings Dato: %s\n" +
                                " - Pizza: %s, Price: %d, Nr: %d\n",

                        o.getOrdreNr(),
                        o.getBestillingsTid().format(timeFormatter),
                        o.getBestillingsDato().format(dateFormatter),

                        pizza.getPizzaName(), pizza.getPizzaPrice(), pizza.getPizzaNumber()));

                writer.append(System.lineSeparator());


                System.out.println(o.getPizzaObjekt() + ", " + o.getBestillingsTid() + ", " + o.getOrdreNr());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeOrdreHistorikFile()
    {
        File ordreHistorik = new File("/Users/elev/Desktop/UNI/Programmering/InteliliJ/Projektuge Marios pizza/src/ordreHistorik.txt");


        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yy");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH.mm");
        int totalPrice = 0;

        try (FileWriter writer = new FileWriter(ordreHistorik, false)) {
            if (ordreHistorik.length() == 0) {
                writer.write("Færdigt/ Der er betalt for ordren \n\n");
            }
            for (int i = 0; i < ordreHistorikArrayList.size(); i++) {
                Ordre o = ordreHistorikArrayList.get(i);
                Pizza pizza = o.getPizzaObjekt();

                writer.append(String.format("ORDRE:\n" +
                                " - Ordre Number: %d\n" +
                                " - Bestillings Tid: %s\n" +
                                " - Bestillings Dato: %s\n" +

                        o.getBestillingsDato().format(dateFormatter),
                        o.getBestillingsTid().format(timeFormatter),

                        pizza.getPizzaName(), pizza.getPizzaPrice(), pizza.getPizzaNumber()));

                writer.append(System.lineSeparator());

                totalPrice += pizza.getPizzaPrice();

                writer.append("TOTAL INDKOMST FOR I DAG:\n");
                writer.append(String.format("%d DKK\n", totalPrice));

            }
        } catch (IOException e) {
              e.printStackTrace();
        }
    }


    // Denne metode gør at når en ordre bliver removed efter den er blevet lavet, så kommer den hen i ordrehistoiken.
    public void addRemovedrdersToFile() {
        for (int i = 0; i < ordreHistorikArrayList.size(); i++) {
            Ordre ordre = ordreHistorikArrayList.get(i);
            System.out.println(ordre);
        }
    }


    // Opgave finde den mest populære pizza
      public String findPizzaDuplicates() {
             StringBuilder duplicatesInfo = new StringBuilder();
             boolean duplicatesFound = false;
            String mostPopularPizza = null;
            
              // Iterate over each pizza to count occurrences
        for (int i = 0; i < ordreHistorikArrayList.size(); i++) {
            Ordre ordre1 = ordreHistorikArrayList.get(i);
            Pizza pizza1 = ordre1.getPizzaObjekt();
            String pizzaName = pizza1.getPizzaName();

            int count = 1;  // Starter the count fra 1

         // Optæller hvor mange gange en bestemt pizza forekommer i arrayet.
            for (int j = i + 1; j < ordreHistorikArrayList.size(); j++) {
                Ordre ordre2 = ordreHistorikArrayList.get(j);
                Pizza pizza2 = ordre2.getPizzaObjekt();

                if (pizza1.getPizzaName().equals(pizza2.getPizzaName()) &&
                        pizza1.getPizzaPrice() == pizza2.getPizzaPrice()) {
                    count++;
                }
            }


             // Opdaterer the most popular pizza
            if (count > maxCount) {
                maxCount = count;
                mostPopularPizza = pizzaName;
                duplicatesFound = true;
            }
        }

        // Resultater afhængig af duplicates
        if (duplicatesFound) {
            duplicatesInfo.append("Most popular pizza: ").append(mostPopularPizza).append("\n");
        } else {
            duplicatesInfo.append("No duplicate pizzas found.\n");
        }

        return duplicatesInfo.toString();
    }
}