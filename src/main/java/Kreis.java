/**
 * Klasse Kreis.
 * Basierend auf David Flanagan: Java in a Nutshell, OReilly 1996.
 *
 * @author Hans Moritsch
 * @version 2023-03-28
 */

public class Kreis extends Figur
{
    private double r;

    public Kreis()
    {
        // super(); wird vom Compiler automatisch eingesetzt
        setR(1.0);
    }

    public Kreis(double x, double y, double r)
    {
        // Aufruf des Konstruktors der Superklasse (Figur)
        super(x, y);
        setR(r);
    }

    public double getR()
    {
        return r;
    }

    public void setR(double r)
    {
        if (r > 0.0)
        {
            this.r = r;
        }
        else
        {
            System.out.println("setR: ungültiger Wert");
        }
    }

    public double umfang()
    {
        return 2.0 * r * Math.PI;
    }

    public double flaeche()
    {
        return r*r * Math.PI;
    }

    public String toString()
    {
        // Aufruf der toString-Methode der Superklasse
        return super.toString() + ": Kreis[" + r + "]";
    }

}