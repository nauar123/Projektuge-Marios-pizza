import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Random;

public class Ordre {

    private int ordreNr;
    private LocalDate bestillingsDato;
    private LocalDateTime bestillingsTid;
    private Pizza pizzaObjekt;
    private int antalPizza;
    private Random random = new Random();

// kunderne der skal generes.
    String[] kunderPiger = {"Sabrina", "Nauar", "Sumaya", "Sofia", "Muna", "Kamila", "Karen", "Samira", "Mudan", "Lise"};
    String[] kunderDrenge = {"Noah", "Sebastian", "Sofus", "Mohammed", "Kamal", "Kasper", "Saad", "Mustafa", "Lasse", "Ole"};


    // Artiputterne til opgaven.

    public Ordre() // default constructor
    {}
    public Ordre(int oNr, LocalDate bDato,  LocalDateTime bTid, Pizza pObjekt, int antalP)
    {
        ordreNr = oNr;
        bestillingsDato = bDato;
        bestillingsTid = bTid;
        pizzaObjekt = pObjekt;
        antalPizza = antalP;

    }


    public int getOrdreNr()
    {
        return ordreNr;
    }
    public  getBestillingsDato()
    {
        return bestillingsDato;
    }
    public int getBestillingsTid()
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

    @Override
    public String toString() {
        return "Ordre{" +
                "ordreNr=" + ordreNr +
                ", bestillingsDato=" + bestillingsDato +
                ", bestillingsTid=" + bestillingsTid +
                ", pizzaObjekt=" + pizzaObjekt +
                ", antalPizza=" + antalPizza +
                '}';
    }
}


