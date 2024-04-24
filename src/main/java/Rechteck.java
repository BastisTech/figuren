/**
 * Klasse Rechteck.
 * Basierend auf David Flanagan: Java in a Nutshell, OReilly 1996.
 *
 * @author Hans Moritsch
 * @version 2023-03-28
 */

public class Rechteck extends Figur
{
    private double a;
    private double b;

    public Rechteck()
    {
        // super(); wird vom Compiler automatisch eingesetzt
        setA(3.0);
        setB(2.0);
    }

    public Rechteck(double x, double y, double a, double b)
    {
        // Aufruf des Konstruktors der Superklasse (Figur)
        super(x, y);

        setA(a);
        setB(b);
    }

    public double getA()
    {
        return a;
    }

    public double getB()
    {
        return b;
    }

    public void setA(double a)
    {
        if (a > 0.0)
        {
            this.a = a;
        }
        else
        {
            System.out.println("setA: ungültiger Wert");
        }
    }

    public void setB(double b)
    {
        if (b > 0.0)
        {
            this.b = b;
        }
        else
        {
            System.out.println("setB: ungültiger Wert");
        }
    }

    public double umfang()
    {
        return 2.0 * (a + b);
    }

    public double flaeche()
    {
        return a * b;
    }

    public String toString()
    {
        // Aufruf der toString-Methode der Superklasse
        return super.toString() + ": Rechteck[" + a + ", " + b + "]";
    }

}