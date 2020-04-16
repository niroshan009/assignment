import com.assignment.model.Animal;
import com.assignment.model.Butterfly;
import com.assignment.model.Catterpiller;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class CatterpillerTest {

    @Test
    public void testCatterpillerWalkBehaviour() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Animal catterpiller = new Catterpiller();
        if (catterpiller instanceof Catterpiller) {
            ((Catterpiller) catterpiller).walk();
            Assert.assertEquals("I am walking", outContent.toString().replace("\n", ""));
        } else {
            Assert.fail();
        }
    }

    @Test
    public void testCatterpillerToButterflyTransformation() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Animal catterpiller = new Catterpiller();
        ((Catterpiller) catterpiller).walk();
        Assert.assertEquals("I am walking", outContent.toString().replace("\n", ""));
        outContent.reset();
        catterpiller = new Butterfly();
        ((Butterfly) catterpiller).fly();
        Assert.assertEquals("I am flying", outContent.toString().replace("\n", ""));
    }
}
