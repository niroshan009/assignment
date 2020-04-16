import com.assignment.behaviour.SingBehaviour;
import com.assignment.model.Animal;
import com.assignment.model.Duck;
import com.assignment.model.Parrot;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ParrotTest {


    @Test
    public void testParrotWalkBehaviour() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        SingBehaviour singBehaviour = () -> {
            System.out.println("Woof, woof");
        };
        Animal parrot = new Parrot(singBehaviour);
        if (parrot instanceof Parrot) {
            ((Parrot) parrot).walk();
            Assert.assertEquals("I am walking", outContent.toString().replace("\n", ""));
        } else {
            Assert.fail();
        }
    }

    @Test
    public void testParrotFlyBehaviour() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        SingBehaviour singBehaviour = () -> {
            System.out.println("Woof, woof");
        };
        Animal parrot = new Parrot(singBehaviour);
        if (parrot instanceof Parrot) {
            ((Parrot) parrot).fly();
            Assert.assertEquals("I am flying", outContent.toString().replace("\n", ""));
        } else {
            Assert.fail();
        }
    }

    @Test
    public void testingSingBehaviourOfDog() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        SingBehaviour singBehaviour = () -> {
            System.out.println("Woof, woof");
        };
        Animal parrot = new Parrot(singBehaviour);
        if (parrot instanceof Parrot) {

            ((Parrot) parrot).sing();
            Assert.assertEquals("Woof, woof", outContent.toString().replace("\n", ""));
        } else {
            Assert.fail();
        }
    }

    @Test
    public void testingSingBehaviourOfCat() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        SingBehaviour singBehaviour = () -> {
            System.out.println("Meow");
        };
        Animal parrot = new Parrot(singBehaviour);
        if (parrot instanceof Parrot) {

            ((Parrot) parrot).sing();
            Assert.assertEquals("Meow", outContent.toString().replace("\n", ""));
        } else {
            Assert.fail();
        }
    }

    @Test
    public void testingSingBehaviourOfRooster() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        SingBehaviour singBehaviour = () -> {
            System.out.println("Cock-a-doodle-doo");
        };
        Animal parrot = new Parrot(singBehaviour);
        if (parrot instanceof Parrot) {

            ((Parrot) parrot).sing();
            Assert.assertEquals("Cock-a-doodle-doo", outContent.toString().replace("\n", ""));
        } else {
            Assert.fail();
        }
    }

}
