/**
 * 
 */
/**
 * @author hrafn
 *
 */
package is.hi.byrjun.services;

public interface SoguheimurService {
    /**
     * Athugar hvort nafn er á réttu formi, þ.e. verða að vera
     * a.m.k. tvö orð.
     * @param nafn
     * @return skilar satt ef nafn er á réttu formi annars ósatt
     */
    public boolean erNafnRett(String nafn); 
}
