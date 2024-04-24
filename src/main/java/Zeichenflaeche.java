/**
 * Klasse Zeichenflaeche.
 * Basierend auf David Flanagan: Java in a Nutshell, OReilly 1996.
 *
 * @author Hans Moritsch
 * @version 2023-03-28
 */

public class Zeichenflaeche {

    /* zeichnet einen Kreis auf der Zeichenfläche
     */
    public static void zeichneKreis(double x, double y, double r, double dicke, String farbe, boolean fuellen)
    {
        System.out.print("zeichne Kreis r=" + r + " an Position x=" + x + ", y=" + y +
                " in " + farbe + ", Dicke "+ dicke);
        if (fuellen)
        {
            System.out.print(", gefüllt");
        }
        System.out.println(" ...");
    }

    /* zeichne ein Rechteck auf der Zeichenfläche
     */
    public static void zeichneRechteck(double x, double y, double a, double b, double dicke, String farbe, boolean fuellen)
    {
        System.out.print("zeichne Rechteck a=" + a + ", b=" + a + " an Position x=" + x + ", y=" + y +
                " in " + farbe + ", Dicke "+ dicke);
        if (fuellen)
        {
            System.out.print(", gefüllt");
        }
        System.out.println(" ...");

    }

}