import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Tests the Crode class w/ JUnit 4.
 *
 * Yes, it's a total pain writing unit tests for a class hierarchy. There are
 * better ways than what I'm doing here, but those are beyond the scope of this
 * course.
 *
 * @author Mithat Konar
 * @author Jamal Herzi
 */
public class CrodeTest {
    class Crode extends Tavunu{
        Crode(){
            super();
        }
        
        Crode(String name, int birthYear, int pava) {
            super(name, 1, pava);
        }
    }
    @Test
    public void testCtorValidParams() {
        Crode tv;

        tv = new Crode("Tala", 1943, 81);
        assertEquals("Tala", tv.getName());
        assertEquals(81, tv.getPava());
        assertEquals(1943, tv.getBirthYear());

        tv = new Crode("Tala", 1945, 100);
        assertEquals("Tala", tv.getName());
        assertEquals(100, tv.getPava());
        assertEquals(1945, tv.getBirthYear());

        tv = new Crode("Tala", 1961, 1010101);
        assertEquals("Tala", tv.getName());
        assertEquals(1010101, tv.getPava());
        assertEquals(1961, tv.getBirthYear());
    }

    /*
     * Also tests accessors.
     */
    @Test
    public void testCtorInValidParams() {
        Crode tv;
        String msg = "?";

        try {
            tv = new Crode("Tala", 1943, 80);
        } catch (Exception e) {
            msg = e.getMessage();
        }
        assertEquals("invalid pava amount", msg);

        try {
            tv = new Crode("Tala", 1942, 81);
        } catch (Exception e) {
            msg = e.getMessage();
        }
        assertEquals("invalid year", msg);
    }

    @Test
    public void testInheritance() {
        var tv = new Crode("Tala", 1981, 81);
        boolean b = tv instanceof Tavunu;
        assertEquals(true, b);
    }

    @Test
    public void testToString() {
        var tv = new Crode("Tala", 1981, 81);

        assertEquals("Tala born in 1981 is a Crode with 81 pava.", tv.toString());
    }

    @Test
    public void testSetName() {
        var tv = new Crode("Tala", 1981, 81);

        tv.setName("");
        assertEquals("Tala", tv.getName());

        tv.setName("T");
        assertEquals("T", tv.getName());

        tv.setName("D");
        assertEquals("D", tv.getName());

        tv.setName("Trelling");
        assertEquals("Trelling", tv.getName());

        tv.setName("Dint");
        assertEquals("Dint", tv.getName());

        tv.setName("tranque");
        assertEquals("Dint", tv.getName());

        tv.setName("demary");
        assertEquals("Dint", tv.getName());

        tv.setName("Hint");
        assertEquals("Dint", tv.getName());
    }

    @Test
    public void testSetYear() {
        var tv = new Crode("Tala", 1981, 81);

        tv.setBirthYear(-2001);
        assertEquals(-2001, tv.getBirthYear());

        tv.setBirthYear(1);
        assertEquals(1, tv.getBirthYear());

        tv.setBirthYear(2001);
        assertEquals(2001, tv.getBirthYear());

        String msg = "?";
        try {
            tv.setBirthYear(2000);
        } catch (Exception e) {
            msg = e.getMessage();
        }
        assertEquals("invalid year", msg);
    }

    @Test
    public void testReceivePava() {
        var tv = new Crode("Tala", 1999, 100);

        boolean rv = tv.receivePava(-2001);
        assertEquals(100, tv.getPava());
        assertEquals(rv, false);

        rv = tv.receivePava(-1);
        assertEquals(100, tv.getPava());
        assertEquals(rv, false);

        rv = tv.receivePava(0);
        assertEquals(100, tv.getPava());
        assertEquals(rv, true);

        rv = tv.receivePava(1);
        assertEquals(101, tv.getPava());
        assertEquals(rv, true);

        rv = tv.receivePava(10);
        assertEquals(111, tv.getPava());
        assertEquals(rv, true);
    }

    @Test
    public void testSpendPava() {
        var tv = new Crode("Tala", 1999, 100);

        boolean rv = tv.spendPava(-2001);
        assertEquals(100, tv.getPava());
        assertEquals(rv, false);

        rv = tv.spendPava(-1);
        assertEquals(100, tv.getPava());
        assertEquals(rv, false);

        rv = tv.spendPava(0);
        assertEquals(100, tv.getPava());
        assertEquals(rv, true);

        rv = tv.spendPava(1);
        assertEquals(99, tv.getPava());
        assertEquals(rv, true);

        rv = tv.spendPava(10);
        assertEquals(89, tv.getPava());
        assertEquals(rv, true);
    }
}