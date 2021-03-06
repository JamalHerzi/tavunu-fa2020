
/**
 * A tavunu is an imaginary Earth-dwelling being.
 *
 * A tavunu looks a bit like a Patagonian Mara and lives in a non-gendered but
 * hierarchical society. Most interactions among tavuni are negotiated with
 * pava -- items of status used for bargaining.
 *
 * @author Mithat Konar
 * @author Jamal Herzi
 */
public class Tavunu {
    public String name, c;
    public int birthYear;
    public int pava;
    
    public void TavunuOutput(){
        System.out.println(name + " born in " + birthYear + " is an " + c + " with " + pava + " pava.");
    } 
            
}