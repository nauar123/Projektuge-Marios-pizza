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

    private Random random = new Random();


    public Ordre() // default constructor
    {}

    public Ordre(int oNr, LocalDate bDato,  LocalDateTime bTid, Pizza pObjekt) // parameterne til konstruktøren.
    {
        ordreNr = oNr;
        bestillingsDato = bDato;
        bestillingsTid = bTid;
        pizzaObjekt = pObjekt;
    }
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


    // Dette gør at når vi printer i main vil der står som string ordreNr: og så plusses metoden ordreNr + "\n", som ksifter linje.
    @Override
    public String toString() {
        return "ORDRE:\n" +
                "ordreNr:" + ordreNr + "\n" +
                ", bestillingsDato:" + bestillingsDato + "\n" +
                ", bestillingsTid:" + bestillingsTid + "\n" +
                ", pizzaObjekt:" + pizzaObjekt + "\n" +
                '}';
        // man skirver "\n", da den repræsenterer et nyt linjeskift, så når den bruges, vil teksten efter "\n" blive vist på en ny linje.
    }
}


