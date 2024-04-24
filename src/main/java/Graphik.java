/**
 * Interface Graphik.
 * Basierend auf David Flanagan: Java in a Nutshell, OReilly 1996.
 *
 * @author Hans Moritsch
 * @version 2023-03-28
 */
public interface Graphik
{
    /* alle Graphikobjekte werden auf einer Zeichenfläche graphisch
     * ausgegeben (gezeichnet) und müssen daher eine zeichne-Methode haben
     */
    public void zeichnen();

    /* Graphikobjekte haben Dicke und Farbe und können gefüllt sein
     */
    public double getDicke();

    public String getFarbe();

    public boolean isFuellen();
}