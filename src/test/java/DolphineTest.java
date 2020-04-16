import com.assignment.model.Animal;
import com.assignment.model.ClownFish;
import com.assignment.model.Dolphin;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class DolphineTest {
    @Test
    public void testClownFishSwimBehaviour() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Animal dolphin = new Dolphin();
        if (dolphin instanceof Dolphin) {
            ((Dolphin) dolphin).swim();
            Assert.assertEquals("I am swimming", outContent.toString().replace("\n", ""));
        } else {
            Assert.fail();
        }
    }
}
