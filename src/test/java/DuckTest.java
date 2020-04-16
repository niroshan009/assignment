import com.assignment.model.Animal;
import com.assignment.model.Duck;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class DuckTest {

    @Test
    public void testDuckWalkBehaviour() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Animal duck = new Duck();
        if (duck instanceof Duck) {
            ((Duck) duck).walk();
            Assert.assertEquals("I am walking", outContent.toString().replace("\n", ""));
        } else {
            Assert.fail();
        }
    }

    @Test
    public void testBirdSingBehaviour() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Animal duck = new Duck();
        if (duck instanceof Duck) {

            ((Duck) duck).sing();
            Assert.assertEquals("Quack,quack", outContent.toString().replace("\n", ""));
        } else {
            Assert.fail();
        }
    }

    @Test
    public void testBirdFlyBehaviour() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Animal duck = new Duck();
        if (duck instanceof Duck) {

            ((Duck) duck).fly();
            Assert.assertEquals("I am flying", outContent.toString().replace("\n", ""));
        } else {
            Assert.fail();
        }
    }

    @Test
    public void testBirdSwimBehaviour() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Animal duck = new Duck();
        if (duck instanceof Duck) {

            ((Duck) duck).swim();
            Assert.assertEquals("I am swimming", outContent.toString().replace("\n", ""));
        } else {
            Assert.fail();
        }
    }
}
