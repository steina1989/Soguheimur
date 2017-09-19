/**
 * 
 */
/**
 * @author hrafn
 *
 */
package is.hi.byrjun.repository;

import is.hi.byrjun.model.Notandi;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * 
 * 
 * Safn af Notendum 
 */
@Repository
public class NotandiRepositoryImp implements NotandiRepository{

    // Listi af kennurum 
    private final List<Notandi> notendur;

    public NotandiRepositoryImp() {
        this.notendur = new ArrayList<Notandi>();
    }
    
    @Override
    public List<Notandi> getAll() {
        return notendur; 
    }

    @Override
    public void add (Notandi notandi) {
        notendur.add(notandi);
    }

}
