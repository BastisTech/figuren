/**
 * Klasse Figur.
 * Diese Klasse ist abstrakt, weil sie abstrakte Methoden enthält.
 * Von dieser Klasse können keine Objekte erzeugt werden, da sie abstrakt ist.
 * Basierend auf David Flanagan: Java in a Nutshell, OReilly 1996.
 *
 * @author Hans Moritsch
 * @version 2023-03-28
 */

public abstract class Figur
{
    private double x;
    private double y;

    public Figur()
    {
        setX(0.0);
        setY(0.0);
    }

    public Figur(double x, double y)
    {
        setX(x);
        setY(y);
    }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public void setX(double x)
    {
        this.x = x;
    }

    public void setY(double y)
    {
        this.y = y;
    }

    /* Abstand vom Koordinatenursprung (0/0), wird für alle
     * Arten von Figuren so berechnet, daher in Klasse Figur.
     */
    public double abstand()
    {
        return Math.sqrt(x*x + y*y);
    }

    /* alle Arten von Figuren müssen eine umfang-Methode haben
     */
    abstract public double umfang();

    /* alle Arten von Figuren müssen eine flaeche-Methode haben
     */
    abstract public double flaeche();

    public String toString()
    {
        return "Figur[" + x + ", " + y + "]";
    }

}