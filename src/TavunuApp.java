/**
 * Create tavuni.
 * 
 * @author Mithat Konar
 * @author Jamal Herzi
 */
public class TavunuApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tavunu t1, t2, t3, t4;
        t1 = new Tavunu();
        t2 = new Tavunu();
        t3 = new Tavunu();
        t4 = new Tavunu();
        t1.name = "Trast";
        t1.birthYear = 1985;
        t1.c = "Avo";
        t1.pava = 20;
        System.out.println("t1: ");
        t1.TavunuOutput();
        
        t2.name = "Dghaga";
        t2.birthYear = 2011;
        t2.c = "Beele";
        t2.pava = 42;
        System.out.println("t2: ");
        t2.TavunuOutput();
        
        t3.name = "Tala";
        t3.birthYear = 2001;
        t3.c = "Crode";
        t3.pava = 10101;
        System.out.println("t3: ");
        t3.TavunuOutput();
        
        t4.name = "Dease";
        t4.birthYear = 1990;
        t4.c = "Exalted Crode";
        t4.pava = 121;
        System.out.println("t4: ");
        t4.TavunuOutput();
    }

}
