package is.hi.byrjun.model;

/**
 * @author Ásgerður Inna aia11@hi.is
 * @author Hrafnhildur Olga hoh44@hi.is
 * @author Ólafur Konráð oka4@hi.is
 * @author Steina Dögg sdv6@hi.is
 * 
 * Model class for a user.
 */

public class User {

    private String nafn;
    private String lykilord;

    public String getNafn() {
        return nafn;
    }

    public void setNafn(String nafn) {
        this.nafn = nafn;
    }

    public String getLykilord() {
        return lykilord;
    }

    public void setLykilord(String lykilord) {
        this.lykilord = lykilord;
    }

    public User(String n, String l) {
        nafn = n;
        lykilord = l;
    }

    @Override
    public String toString() {
        return String.format("<BR>" + "nafn: " + nafn + "<BR>"
                + "lykilord: " + lykilord);
    }

}
