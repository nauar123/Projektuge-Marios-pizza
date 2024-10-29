import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;


public class Bestillingsliste {

    // lav en liste med bestillinger

    public Bestillingsliste() {
    }

    private ArrayList<Ordre> ordreList = new ArrayList<>(); // ordreList holder alle ordrene via en arrayliste.
    private int currentOrdreNr = 1; // vi afklære at artiputten currentOrdreNr er lig 1, så den starter fra 1 af.

    public void addOrdreToList(Ordre ordre) // metoden tager en Ordre som parameter
    {
        ordreList.add(ordre); // ordre biver tilføjet til ordreList.
        currentOrdreNr++; // Denne metode sørger for at ordrenummeret stiger for hver ny ordre. Det sikre at den stiger med 1 hvergang. fra 1 til 2 osv.
    }

    public void printBestillingsliste() {
        for (int i = 0; i < ordreList.size(); i++)  // den går igennem hver ordre i ordrelisten.
        {
            Ordre ordre = ordreList.get(i); // Ordre ordre = ordreList.get(i); henter en bestemt ordre fra listen ordreList og gemmer den i variablen ordre.
            System.out.println(ordre);  // her kaldes der på Ordre-klassens toString()-metode, Det vi skrev i  toString()-metoden udskrives.
        }
    }

    public int getCurrentOrdreNr() {
        return currentOrdreNr;
    }


    // Metode til at fjerne et ordrenummer fra listen:

    public void removeOrdreByNr(int ordreNumber) {   // Metoden er offentlig og kaldes removeOrdreByNr, den tager int ordrenummer som parameter.
        for (int i = 0; i < ordreList.size(); i++) {  // Variablen i starter fra 0 og fortsætter, så længe den er mindre end størrelsen af ordreList.
            if (ordreList.get(i).getOrdreNr() == ordreNumber) {
                // hvis ordrenummeret(.getordreNr) som er i listen (ordreList.get(i)), matcher det ordrenummer, der er som parameter (ordreNumber).
                ordreList.remove(i);    // Hvis det matcher fjernes den ordre fra ordreList ved at kalde remove(i)
                break;        // så stopper loopen ved at kalde på break;
                writeBestillingsliste();  // så opdateres filen efter man har fjernet fra ordrelisten
            }
        }
    }

    public void writeBestillingsliste() {
        File bestillingsliste =


    }
}
