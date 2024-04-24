/**
 * Klasse GraphikKreis.
 * Basierend auf David Flanagan: Java in a Nutshell, OReilly 1996.
 *
 * @author Hans Moritsch
 * @version 2023-03-28
 */

public class GraphikKreis extends Kreis implements Graphik
{
    // Graphik-Attribute zusätzlich zu Kreis-Attributen
    private double dicke;
    private String farbe;
    private boolean fuellen;

    public GraphikKreis()
    {
        // super(); wird vom Compiler automatisch eingesetzt
        setDicke(1.0);
        setFarbe("rot");
        setFuellen(false);
    }

    public GraphikKreis(double x, double y, double r, double dicke, String farbe, boolean fuellen)
    {
        // Aufruf des Konstruktors der Superklasse (Kreis)
        super(x, y, r);
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

    /* Überschreiben der umfang-Methode der Superklasse (Kreis)
     */
    public double umfang()
    {
        return (getR() + dicke/2.0) * 2.0 * Math.PI;
    }

    /* Überschreiben der flaeche-Methode der Superklasse (Kreis)
     */
    public double flaeche()
    {

        return Math.pow((getR() + dicke/2.0), 2.0) * Math.PI; // quadrieren mit Math.pow(... , 2.0)
    }

    public void zeichnen()
    {
        Zeichenflaeche.zeichneKreis(getX(), getY(), getR(), dicke, farbe, fuellen);
    }

    public String toString()
    {
        // Aufruf der toString-Methode der Superklasse 
        return super.toString() + ": GraphikKreis[" + dicke + ", " + "\""+ farbe +"\"" + ", " + fuellen + "]";
    }

}