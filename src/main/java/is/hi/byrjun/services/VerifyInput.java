package is.hi.byrjun.services;

/**
 * 
 * @author Hrafnhildur Olga hoh44@hi.is
 * @author Steina Dögg sdv6@hi.is
 *
 */
public interface VerifyInput {
    /**
     * Checks whether a namestring contains not less than two names seperated by space.
     * @param name The whole name of a person.
     * @return True if the name is properly formatted, false otherwise.
     */
    public boolean checkValidName(String name); 
}
