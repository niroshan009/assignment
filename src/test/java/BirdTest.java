import com.assignment.SingBehaviour;
import com.assignment.model.Animal;
import com.assignment.model.Bird;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class BirdTest {
    @Test
    public void testBirdWalkBehaviour(){
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Animal bird = new Bird();
        if (bird instanceof Bird) {
            ((Bird) bird).walk();
            Assert.assertEquals("I am walking", outContent.toString().replace("\n",""));
        }else {
            Assert.fail();
        }

    }
    @Test
    public void testBirdSingBehaviour(){
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Animal bird = new Bird();
        if (bird instanceof Bird) {
            ((Bird) bird).sing();
            Assert.assertEquals("I am singing", outContent.toString().replace("\n",""));
        }
        else {
            Assert.fail();
        }

    }

    @Test
    public void testBirdFlyBehaviour(){
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Animal bird = new Bird();
        if (bird instanceof Bird) {

            ((Bird) bird).fly();
            Assert.assertEquals("I am flying", outContent.toString().replace("\n",""));
        }else {
            Assert.fail();
        }

    }

}
