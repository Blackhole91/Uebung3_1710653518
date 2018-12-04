public class Aufgabe2_und_3_Aufruf {

    public static void main (String[]args){
        partialString("abcd");

        Taschenrechner taschenrechner = new Taschenrechner();

        System.out.println(taschenrechner.adition(6.0,3));
        System.out.println(taschenrechner.subtraktion(6,3.0));
        System.out.println(taschenrechner.multiplikation(6,3));
        System.out.println(taschenrechner.division(6,3));


    }
    public static String partialString (String eingabe){
        if (eingabe.length()<3){
            System.err.println("Fehler");

        }
        else {
            System.out.println(eingabe.substring(eingabe.length()/2,eingabe.length()));
        }
        return eingabe;

    }
}
