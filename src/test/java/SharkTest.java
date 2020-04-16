import com.assignment.model.Animal;
import com.assignment.model.Duck;
import com.assignment.model.Fish;
import com.assignment.model.Shark;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class SharkTest {
    @Test
    public void testSharkSwimBehaviour() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Animal shark = new Shark();
        if (shark instanceof Shark) {
            ((Shark) shark).swim();
            Assert.assertEquals("I am swimming", outContent.toString().replace("\n", ""));
        } else {
            Assert.fail();
        }
    }

    @Test
    public void testSharkEatOtherFixh() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Animal shark = new Shark();
        if (shark instanceof Shark) {
            ((Shark) shark).eatOtherFixh();
            Assert.assertEquals("I am eating other fish", outContent.toString().replace("\n", ""));
        } else {
            Assert.fail();
        }
    }

    @Test
    public void testSharkSizeIsLarge() {
        Animal shark = new Shark();
        if (shark instanceof Shark) {
            Assert.assertEquals("Large", ((Shark) shark).getSize());
        } else {
            Assert.fail();
        }
    }

    @Test
    public void testSharkColorIsGrey() {
        Animal shark = new Shark();
        if (shark instanceof Shark) {
            Assert.assertEquals("Grey", ((Shark) shark).getColor());
        } else {
            Assert.fail();
        }
    }


}
