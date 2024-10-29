import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Random;

public class Ordre {

    // Artiputterne til opgaven.
    private int ordreNr;
    private LocalDate bestillingsDato;
    private LocalDateTime bestillingsTid;
    private Pizza pizzaObjekt;
    private int antalPizza;
    private boolean paid;

    private Random random = new Random();



    public Ordre() // default constructor
    {}

    public Ordre(int oNr, LocalDate bDato,  LocalDateTime bTid, Pizza pObjekt, int antalP) // parameterne til konstruktøren.
    {
        ordreNr = oNr;
        bestillingsDato = bDato;
        bestillingsTid = bTid;
        pizzaObjekt = pObjekt;
        antalPizza = antalP;
        paid = false; // // paid er sat til false i konstruktøren, da en ny ordre antages at være ikke-betalt.
    }
// grunden til boolean er false er fordi....

    public int getOrdreNr()
    {
        return ordreNr;
    }
    public  LocalDate getBestillingsDato()
    {
        return bestillingsDato;
    }
    public LocalDateTime getBestillingsTid()
    {
        return bestillingsTid;
    }
    public Pizza getPizzaObjekt() {
        return pizzaObjekt;
    }
    public int getAntalPizza()
    {
        return antalPizza;
    }
    public void markAsPaid()
    {
        paid = true; // Når betalingen modtages, kaldes markAsPaid() metoden for at ændre paid til true.
    }
    public boolean isPaid()
    {
        return paid; //  Metoden isPaid() bruges til at tjekke, om ordren er betalt.
    }


    // Dette gør at når vi printer i main vil der står som string ordreNr: og så plusses metoden ordreNr + "\n", som ksifter linje.
    @Override
    public String toString() {
        return "ORDRE:\n" +
                "ordreNr:" + ordreNr + "\n" +
                ", bestillingsDato:" + bestillingsDato + "\n" +
                ", bestillingsTid:" + bestillingsTid + "\n" +
                ", pizzaObjekt:" + pizzaObjekt + "\n" +
                ", antalPizza:" + antalPizza + "\n" +
                '}';

        // man skirver "\n", da den repræsenterer et nyt linjeskift, så når den bruges, vil teksten efter "\n" blive vist på en ny linje.
    }
}


