
package is.hi.byrjun.services;

import org.springframework.stereotype.Service;

/**
 * Implementation of the methods of VeryfiInput
 * 
 * @author Hrafnhildur Olga hoh44@hi.is
 * @author Steina Dögg Vigfúsdóttir sdv6@hi.is
 */
@Service
public class VerifyInputImp implements VerifyInput{


    @Override
    public boolean checkValidName(String name) {
        return true;
    }
    
}
