public class Ordre {

    private int ordreNr;
    private int bestillingsDato;
    private int bestillingsTid;
    private Pizza pizzaObjekt;
    // Artiputterne til opgaven.

    public Ordre() // default constructor
    {}
    public Ordre(int oNr,int bDato, int bTid, Pizza pObjekt)
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
    public int getBestillingsDato()
    {
        return bestillingsDato;
    }
    public int getBestillingsTid() {
        return bestillingsTid;
    }

    public Pizza getPizzaObjekt() {
        return pizzaObjekt;
    }
}


