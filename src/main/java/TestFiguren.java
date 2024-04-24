/**
 * Klasse Kreis.
 *
 * @author Hans Moritsch
 * @version 2023-03-28
 */

import java.util.ArrayList;

public class TestFiguren
{

    public static void main(String[] args)
    {
        test();
    }
    public static void test()
    {
        Kreis k;
        Kreis k2;
        Rechteck r;

        GraphikKreis gk;
        GraphikRechteck gr;

        ArrayList<Figur> figuren;

        ArrayList<Graphik> graphiken; // ArrayList von Interface-Objekten!

        double summe;

        // -- Kreis --
        k = new Kreis(2.0, 3.0, 5.0);
        System.out.println(k);
        System.out.println("Umfang " + k.umfang() + ", Fläche " + k.flaeche() + ", Abstand " + k.abstand());
        System.out.println();

        // -- GraphikKreis --
        gk = new GraphikKreis(2.0, 3.0, 5.0, 0.6, "rot", false);
        System.out.println(gk);

        // umfang() und flaeche() von GraphikKreis wird ausgeführt
        // abstand() von Figur wird ausgeführt, da es in Kreis und GraphikKreis keine abstand()-Methode gibt
        System.out.println("Umfang " + gk.umfang() + ", Fläche " + gk.flaeche() + ", Abstand " + gk.abstand());
        System.out.println();

        // -- Rechteck --
        r = new Rechteck (1.0, 2.0, 6.0, 8.0);
        System.out.println(r);

        System.out.println("Umfang " + r.umfang() + ", Fläche " + r.flaeche() + ", Abstand " + r.abstand());
        System.out.println();

        // -- GraphikRechteck --
        gr = new GraphikRechteck (1.0, 2.0, 6.0, 7.0, 0.8, "blau", false);
        System.out.println(gr);
        // umfang() und flaeche() von GraphikRechteck wird ausgeführt
        // abstand() von Figur wird ausgeführt, da es in Rechteck und GraphikRechteck keine abstand()-Methode gibt
        System.out.println("Umfang " + gr.umfang() + ", Fläche " + gr.flaeche() + ", Abstand " + gr.abstand());
        System.out.println();

        // -- Zeichnen -- 
        gk.zeichnen();
        gr.zeichnen();

        System.out.println();

        // --- Liste von Figur-Objekten ---

        // Kreis und Rechteck sind Instanzen von Figur
        figuren = new ArrayList<>();

        figuren.add(new Kreis(2.0, 3.0, 5.0));
        figuren.add(new Kreis(1.0, 6.0, 8.0));
        figuren.add(new Kreis(4.0, 5.0, 3.0));
        figuren.add(new Rechteck(1.0, 2.0, 6.0, 7.0));
        figuren.add(new Rechteck(5.0, 3.0, 3.0, 9.0));
        figuren.add(new Rechteck(2.0, 8.0, 4.0, 5.0));

        // Dynamisches Binden der toString-Methoden von Kreis und Rechteck
        for (Figur f: figuren)
        {
            System.out.println(f); // entspricht System.out.println(f.toString());
        }

        // Dynamisches Binden der umfang-Methoden von Kreis und Rechteck
        summe = 0.0;
        for (Figur f: figuren)
        {
            summe += f.umfang();
        }
        System.out.println("Umfangsumme = " + summe);

        // Dynamisches Binden der flaeche-Methoden von Kreis und Rechteck
        summe = 0.0;
        for (Figur f: figuren)
        {
            summe += f.flaeche();
        }
        System.out.println("Flächensumme = " + summe);

        System.out.println();

        // --- Liste von Graphik-Objekten ---

        graphiken = new ArrayList<>();
        // GraphikKreis und GraphikRechteck sind Instanzen von Graphik
        graphiken.add(new GraphikKreis(2.0, 3.0, 5.0, 0.6, "rot",  false));
        graphiken.add(new GraphikKreis(1.0, 6.0, 8.0, 1.0, "gelb", true));
        graphiken.add(new GraphikKreis(4.0, 5.0, 3.0, 0.6, "grün", false));
        graphiken.add(new GraphikRechteck (1.0, 2.0, 6.0, 7.0, 0.4, "blau", true));
        graphiken.add(new GraphikRechteck (5.0, 3.0, 3.0, 9.0, 0.8, "weiß", false));
        graphiken.add(new GraphikRechteck (2.0, 8.0, 4.0, 5.0, 0.2, "gelb", true));

        for (Graphik g: graphiken)
        {
            System.out.println(g);
        }
        System.out.println();

        for (Graphik g: graphiken)
        {
            g.zeichnen(); // Aufruf der zeichne-Methode von Graphik (dynamisches Binden)
        }

        System.out.println();
    }

}