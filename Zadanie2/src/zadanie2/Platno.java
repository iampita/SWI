
package zadanie2;

import java.util.ArrayList;

/**
 * @author BarboraJahodnikova,74706
 */

public class Platno {
    
    static ArrayList<GeomTvar> GeoUtvary = new ArrayList<>();   
    
    /**
     * @param utvar
     */
    public static void PridajDoKolekcie(GeomTvar utvar){
       GeoUtvary.add(utvar);
    }
    
    public static double SucetObsahov(){
        double sucet = 0;
        for (GeomTvar c : GeoUtvary){
            sucet = sucet + c.VypocitajObsah();
        }
        return sucet;
    }
    
    public static double SucetObvodov(){
        double sucet = 0;
        for (GeomTvar c : GeoUtvary){
            sucet = sucet + c.VypocitajObvod();
        }
        return sucet;
    }   
}
