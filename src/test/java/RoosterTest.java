import com.assignment.model.Animal;
import com.assignment.model.Chiken;
import com.assignment.model.Rooster;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class RoosterTest {

    @Test
    public void testRoosterWalkBehaviour() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Animal chiken = new Rooster();
        if (chiken instanceof Rooster) {
            ((Rooster) chiken).walk();
            Assert.assertEquals("I am walking", outContent.toString().replace("\n", ""));
        } else {
            Assert.fail();
        }
    }

    @Test
    public void testRoosterSingBehaviour() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Animal rooster = new Rooster();
        if (rooster instanceof Rooster) {

            ((Rooster) rooster).sing();
            Assert.assertEquals("Cock-a-doodle-doo", outContent.toString().replace("\n", ""));
        } else {
            Assert.fail();
        }
    }
}
