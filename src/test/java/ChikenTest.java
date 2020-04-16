import com.assignment.model.Animal;
import com.assignment.model.Chiken;
import com.assignment.model.Duck;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ChikenTest {
    @Test
    public void testChikenWalkBehaviour() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Animal chiken = new Chiken();
        if (chiken instanceof Chiken) {
            ((Chiken) chiken).walk();
            Assert.assertEquals("I am walking", outContent.toString().replace("\n", ""));
        } else {
            Assert.fail();
        }
    }

    @Test
    public void testChikenSingBehaviour() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Animal chiken = new Chiken();
        if (chiken instanceof Chiken) {

            ((Chiken) chiken).sing();
            Assert.assertEquals("Cluck, cluck", outContent.toString().replace("\n", ""));
        } else {
            Assert.fail();
        }
    }


}
