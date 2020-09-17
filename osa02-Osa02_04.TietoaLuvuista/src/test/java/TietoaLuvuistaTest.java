
import fi.helsinki.cs.tmc.edutestutils.MockStdio;
import fi.helsinki.cs.tmc.edutestutils.Points;
import fi.helsinki.cs.tmc.edutestutils.ReflectionUtils;
import java.lang.reflect.Method;
import org.junit.*;
import static org.junit.Assert.*;

@Points("02-04")
public class TietoaLuvuistaTest {

    @Rule
    public MockStdio io = new MockStdio();

    @Test
    public void suurempiKuin() {
        testaa("2\n1\n", "suurempi kuin", "pienempi kuin", "yhtä suuri");
    }

    @Test
    public void pienempiKuin() {
        testaa("5\n6\n", "pienempi kuin", "suurempi kuin", "yhtä suuri");
    }

    @Test
    public void yhtaSuuri() {
        testaa("5\n5\n", "yhtä suuri", "pienempi kuin", "suurempi kuin");
    }

    public void testaa(String syote, String odotettu, String... eiOdotetut) {

        int oldOut = io.getSysOut().length();
        io.setSysIn(syote);
        callMain(TietoaLuvuista.class);
        String out = io.getSysOut().substring(oldOut);

        assertTrue("Kun syöte oli " + syote + ", odotettiin tulostusta:\n" + odotettu + "\nTulostusta ei löytynyt.", out.contains(odotettu));
        for (String eiOdotettu : eiOdotetut) {
            assertFalse("Kun syöte oli " + syote + ", tulostuksessa ei pitäisi olla:\n" + eiOdotettu + "", out.contains(eiOdotettu));
        }
    }

    private void callMain(Class kl) {
        try {
            kl = ReflectionUtils.newInstanceOfClass(kl);
            String[] t = null;
            String x[] = new String[0];
            Method m = ReflectionUtils.requireMethod(kl, "main", x.getClass());
            ReflectionUtils.invokeMethod(Void.TYPE, m, null, (Object) x);
        } catch (Throwable e) {
            fail("Jotain kummallista tapahtui. Saattaa olla että " + kl + "-luokan public static void main(String[] args) -metodi on hävinnyt\n"
                    + "tai ohjelmasi kaatui poikkeukseen. Lisätietoja " + e);
        }
    }
}
