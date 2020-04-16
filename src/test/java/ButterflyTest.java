import com.assignment.model.Animal;
import com.assignment.model.Butterfly;
import com.assignment.model.Chiken;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ButterflyTest {

    @Test
    public void testButterflyFlyBehaviour() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Animal butterfly = new Butterfly();
        if (butterfly instanceof Butterfly) {
            ((Butterfly) butterfly).fly();
            Assert.assertEquals("I am flying", outContent.toString().replace("\n", ""));
        } else {
            Assert.fail();
        }
    }
}
