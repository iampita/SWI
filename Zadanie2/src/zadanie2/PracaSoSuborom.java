package zadanie2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class PracaSoSuborom {

    public static String[] readObsahZoSuboraString(String filename) {

        String riadok;
        String[] pom = new String[100000];

        int i = 0;
        try {
            FileInputStream subor = new FileInputStream(filename);
            InputStreamReader in = new InputStreamReader(subor);
            try (BufferedReader zoSuboru = new BufferedReader(in)) {
                while ((riadok = zoSuboru.readLine()) != null) {
                    pom[i] = riadok;
                    i++;
                }
            }
        } catch (IOException e) {
            System.out.println("chyba " + e);
        }

        String[] vstup = new String[i];
        System.arraycopy(pom, 0, vstup, 0, i);
        return vstup;
    }
}
