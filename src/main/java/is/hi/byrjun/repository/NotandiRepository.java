/**
 * 
 */
/**
 * @author hrafn
 *
 */
package is.hi.byrjun.repository;

import is.hi.byrjun.model.Notandi;
import java.util.List;

/**
 * 
 * 
 * Geymsla fyrir alla notendur
 * 
 */

public interface NotandiRepository  {
    /**
     * Nær í alla notendur
     * @return listi af kennurum 
     */
    List <Notandi> getAll();
    
    /**
     * Bætir við notendum
     * @param notandi 
     */
    void add (Notandi notandi);
}
