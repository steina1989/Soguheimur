/**
 * 
 */
/**
 * @author hrafn
 *
 */
package is.hi.byrjun.model;

public class Notandi {

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

    public Notandi(String n, String h) {
        nafn = n;
        lykilord = h;
    }

    @Override
    public String toString() {
        return String.format("<BR>" + "nafn: " + nafn + "<BR>"
                + "lykilord: " + lykilord);
    }

}
