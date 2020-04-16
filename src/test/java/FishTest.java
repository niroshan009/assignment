import com.assignment.model.Animal;
import com.assignment.model.Duck;
import com.assignment.model.Fish;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class FishTest {

    @Test
    public void testFishSwimBehaviour() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Animal fish = new Fish();
        if (fish instanceof Fish) {
            ((Fish) fish).swim();
            Assert.assertEquals("I am swimming", outContent.toString().replace("\n", ""));
        } else {
            Assert.fail();
        }
    }
}
