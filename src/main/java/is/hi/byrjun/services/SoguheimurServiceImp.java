
package is.hi.byrjun.services;

import org.springframework.stereotype.Service;

/**
 *
 * @author Ebba Þóra Hvannberg
 */
@Service
public class SoguheimurServiceImp implements SoguheimurService{

    @Override
    public boolean erNafnRett(String nafn) {
        return true;
    }
    
}
