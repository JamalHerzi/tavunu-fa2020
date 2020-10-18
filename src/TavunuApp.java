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
        Tavunu t1, t2;
        t1 = new Tavunu();
        t2 = new Tavunu();
        t1.name = "Trast";
        t1.birth = 1988;
        t1.age = 24;
        System.out.println("t1:");
        t1.TavunuOutput();
        
        t2.name = "Jamar";
        t2.birth = 1990;
        t2.age = 22;
        System.out.println("t2:");
        t2.TavunuOutput();
    }

}
