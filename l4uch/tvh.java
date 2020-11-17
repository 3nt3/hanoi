
/*
 * Klasse tvh 
 *
 * Roland Stiebel 
 * version 1.0
 */

//Import
import basis.*;
import java.awt.*;

public class tvh extends Fenster implements KnopfLauscher 
{

    //Deklaration
    private Knopf ende, knopf1, knopf2, knopf3, knopf4, knopf5, knopf6, knopf7;
    private BeschriftungsFeld label1;
    private Stift stift;
    private TextFeld text1, text2;

    // Konstruktor fuer Objekte der Klasse TischKlasse

    public tvh()
    {
        this.initGui();
    }

    public void initGui() 
    {
        this.setzeGroesse(900,500);
        this.setzeTitel("tvh");
        ende = new Knopf("Ende",490,460,100,30);
        ende.setzeKnopfLauscher(this);
        // Knopf
        knopf1 = new Knopf("1",170,105,60,20);
        knopf2 = new Knopf("2",160,125,80,20);
        knopf3 = new Knopf("3",150,145,100,20);
        knopf4 = new Knopf("4",140,165,120,20);
        knopf5 = new Knopf("A",120,190,160,20);
        knopf6 = new Knopf("B",320,190,160,20);
        knopf7 = new Knopf("C",520,190,160,20);
        // Knopflauscher
        knopf1.setzeKnopfLauscher(this);
        knopf2.setzeKnopfLauscher(this);
        knopf3.setzeKnopfLauscher(this);
        knopf4.setzeKnopfLauscher(this);
        knopf5.setzeKnopfLauscher(this);
        knopf6.setzeKnopfLauscher(this);
        knopf7.setzeKnopfLauscher(this);
        stift = new Stift();
    }

    @Override
    public void bearbeiteKnopfDruck(Knopf k)
    {
        if (k ==ende)
        {
            this.gibFrei();
        } 
        else if (k ==knopf1)
        {
            //TODO
            System.out.println("1");
            knopf1.setzeHintergrundFarbe(Farbe.ROT);
            
        } 
        else if (k ==knopf2)
        {
            //TODO
            System.out.println("2");
        }
        else if (k ==knopf3)
        {
            //TODO
            System.out.println("3");
        }
        else if (k ==knopf4)
        {
            //TODO
            System.out.println("4");
        }
        else if (k ==knopf5)
        {
            //TODO
            System.out.println("A");
        }
        else if (k ==knopf6)
        {
            //TODO
            System.out.println("B");
        }
        else if (k ==knopf7)
        {
            //TODO
            System.out.println("C");
        }
    }
}
