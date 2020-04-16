import com.assignment.model.Animal;
import com.assignment.model.ClownFish;
import com.assignment.model.Shark;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ClownFishTest {

    @Test
    public void testClownFishSwimBehaviour() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Animal clownFish = new ClownFish("orange");
        if (clownFish instanceof ClownFish) {
            ((ClownFish) clownFish).swim();
            Assert.assertEquals("I am swimming", outContent.toString().replace("\n", ""));
        } else {
            Assert.fail();
        }
    }

    @Test
    public void testClownFishMakeJokesBehaviour() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Animal clownFish = new ClownFish("orange");
        if (clownFish instanceof ClownFish) {
            ((ClownFish) clownFish).makeJoke();
            Assert.assertEquals("I am making a joke", outContent.toString().replace("\n", ""));
        } else {
            Assert.fail();
        }
    }

    @Test
    public void testClownFishColor() {
        Animal clownFish = new ClownFish("orange");
        if (clownFish instanceof ClownFish) {
            Assert.assertEquals("orange", ((ClownFish) clownFish).getColor());
        } else {
            Assert.fail();
        }
    }

    @Test
    public void testClownFishSize() {
        Animal clownFish = new ClownFish("orange");
        if (clownFish instanceof ClownFish) {
            Assert.assertEquals("small", ((ClownFish) clownFish).getSize());
        } else {
            Assert.fail();
        }
    }

}
