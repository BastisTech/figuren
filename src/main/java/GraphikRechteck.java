/**
 * Klasse GraphikRechteck.
 * Basierend auf David Flanagan: Java in a Nutshell, OReilly 1996.
 *
 * @author Hans Moritsch
 * @version 2023-03-28
 * test
 */
public class GraphikRechteck extends Rechteck implements Graphik
{
    // Graphik-Attribute zusätzlich zu Rechteck-Attributen
    private double dicke;
    private String farbe;
    private boolean fuellen;

    public GraphikRechteck()
    {
        // super(); wird vom Compiler automatisch eingesetzt
        setDicke(1.0);
        setFarbe("blau");
        setFuellen(false);
    }

    public GraphikRechteck(double x, double y, double a, double b, double dicke, String farbe, boolean fuellen)
    {
        // Aufruf des Konstruktors der Superklasse (Rechteck)
        super(x, y, a, b);
        setDicke(dicke);
        setFarbe(farbe);
        setFuellen(fuellen);
    }

    public double getDicke()
    {
        return dicke;
    }

    public String getFarbe()
    {
        return farbe;
    }

    public boolean isFuellen()
    {
        return fuellen;
    }

    public void setDicke(double dicke)
    {
        if (dicke > 0.0)
        {
            this.dicke = dicke;
        }
        else
        {
            System.out.println("setDicke: ungültiger Wert");
        }
    }

    public void setFarbe(String farbe)
    {
        if (farbe != null && farbe.length() > 0)
        {
            this.farbe = farbe;
        }
        else
        {
            System.out.println("setFarbe: null-Referenz oder Leerstring");
        }
    }

    public void setFuellen(boolean fuellen)
    {
        this.fuellen = fuellen;
    }

    /* Überschreiben der umfang-Methode der Superklasse (Rechteck)
     */
    public double umfang()
    {
        return 2.0 * ( (getA() + dicke) + (getB() + dicke) );
    }

    /* Überschreiben der flaeche-Methode der Superklasse (Rechteck)
     */
    public double flaeche()
    {
        return (getA() + dicke) * (getB() + dicke);
    }

    public void zeichnen()
    {
        Zeichenflaeche.zeichneRechteck(getX(), getY(), getA(), getB(), dicke, farbe, fuellen);
    }

    public String toString()
    {
        // Aufruf der toString-Methode der Superklasse 
        return super.toString() + ": GraphikRechteck[" + dicke + ", " + "\""+ farbe +"\"" + ", " + fuellen + "]";
    }

}