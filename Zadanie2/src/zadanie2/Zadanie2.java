package zadanie2;

/**
 * @author BarboraJahodnikova,74706
 */
public class Zadanie2 {

    public static void VytvorObjekt(String[] vstup) {
        int k, x, y;
        double sirka, dlzka, polomer;
        String[] riadok = new String[8];

        for (int i = 0; i < vstup.length; i++) {

            if (vstup[i].length() == 0) {
                continue;
            }

            for (int j = 0; j < vstup[i].length(); j++) {
                riadok = vstup[i].split("[;]");
            }

            k = Integer.parseInt(riadok[0]);
            x = Integer.parseInt(riadok[1]);
            y = Integer.parseInt(riadok[2]);

            switch (k) {
                case 0: {
                    if (riadok.length != 5) {
                        System.err.println("CHYBA pri načítaní útvarov. Skontrolujte vstupný súbor.");
                        System.exit(1);
                    }
                    sirka = Double.parseDouble(riadok[3]);
                    dlzka = Double.parseDouble(riadok[4]);
                    GeomTvar obdlznik = new Obdlznik(x, y, sirka, dlzka);
                    Platno.PridajDoKolekcie(obdlznik);
                    break;
                }
                case 1: {
                    if (riadok.length != 4) {
                        System.err.println("CHYBA pri načítaní útvarov. Skontrolujte vstupný súbor.");
                        System.exit(1);
                    }
                    polomer = Double.parseDouble(riadok[3]);
                    GeomTvar kruh = new Kruh(x, y, polomer);
                    Platno.PridajDoKolekcie(kruh);
                    break;
                }
                case 2: {
                    if (riadok.length != 4) {
                        System.err.println("CHYBA pri načítaní útvarov. Skontrolujte vstupný súbor.");
                        System.exit(1);
                    }
                    sirka = Double.parseDouble(riadok[3]);
                    GeomTvar stvorec = new Stvorec(x, y, sirka);
                    Platno.PridajDoKolekcie(stvorec);
                    break;
                }
                case 3: {
                    if (riadok.length != 4) {
                        System.err.println("CHYBA pri načítaní útvarov. Skontrolujte vstupný súbor.");
                        System.exit(1);
                    }
                    dlzka = Double.parseDouble(riadok[3]);
                    GeomTvar trojuholnik = new Trojuholnik(x, y, dlzka);
                    Platno.PridajDoKolekcie(trojuholnik);
                }
            }
        }
    }

    public static void main(String[] args) {

        String[] vstup = PracaSoSuborom.readObsahZoSuboraString("utvary.in");

        if (vstup.length == 0) {
            System.err.println("CHYBA pri načítaní útvarov. Skontrolujte vstupný súbor.");
            System.exit(1);
        }

        VytvorObjekt(vstup);

        System.out.println("n=" + Platno.GeoUtvary.size());
        System.out.println("o=" + Platno.SucetObvodov());
        System.out.println("s=" + Platno.SucetObsahov());
    }
}
