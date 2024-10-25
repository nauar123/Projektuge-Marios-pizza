public class Dato // Navnet på klassen altid med stort begyndelsesbogstav; attributter og alm. metoder med lille begyndelsesbogstav
    {
        private int datoen; // Heltal - format YYYYMMDD - klassens eneste attribut/data

        /*
         * Konstruktører -  skaber objekter/instanser af klassen
         * Constructors     hedder det samme som klassen
         *                  har ingen returværdi; altid public
         */
        public Dato() //Default constructor - skaber et tomt objekt
        {}

        public Dato(int enDato) // Alm. constructor m. parameter
        {
            datoen = enDato;    // Parameteren tildeler attributten en værdi
        }

        /*
         * Klassens metoder - aktuelt kun én
         * udgør sammen med konstruktørerne objekternes adfærd
         */
        public int getDatoen()  // int angiver metodens returværdi
        {
            return datoen;      // værdien af attributten datoen (et heltal) returneres
        }

        public int getAar()
        {
            return datoen / 10000;
        }

        public int getMaaned()
        {
            int maaned = 0;
            maaned = datoen / 100;
            maaned = maaned % 100;
            return maaned;
        }

        public int getMaanedShort()
        {
            return (datoen / 100) % 100;
        }

        public int getDag()
        {
            return datoen % 100;
        }

        public int getKvartal()
        {
            return (getMaaned() + 2) / 3;

        }
        public boolean skudAar()
        {
            //returner true for skudår (fx 2024) og false for ikke skudår (fx 2023)
            //på 400 år skal der være 97 skudår, dvs. hver 4. år minus tre, og de tre er år,
            //som kan divideres med 100, men ikke med 400, så fx 1900 er skudår men 2000 er ikke
            int aar = getAar();

            if (aar % 4 != 0)
            {
                return false;
            }
            else
            if (aar % 100 == 0 && aar % 400 != 0)
            {
                return false;
            }
            else
            {
                return true;
            }
        }
    }


