import com.assignment.behaviour.*;
import com.assignment.model.*;
import org.junit.Assert;
import org.junit.Test;

public class AnimalCountingTest {
    @Test
    public void countAnimalTest() {
        int canFly = 0, canWalk = 0, canSwim = 0, canSing = 0;
        SingBehaviour singBehaviour = () -> {
            System.out.println("Woof,woof");
        };


        Animal[] animals = {new Bird(),
                new Butterfly(),
                new Catterpiller(),
                new Chiken(),
                new ClownFish("orange"),
                new Shark(),
                new Dolphin(),
                new Duck(),
                new Fish(),
                new Rooster(),
                new Parrot(singBehaviour)};

        for (Animal animal : animals) {
            if (animal instanceof Walk) canWalk++;
            if (animal instanceof Sing) canSing++;
            if (animal instanceof Fly) canFly++;
            if (animal instanceof Swim) canSwim++;
        }
        Assert.assertEquals(6, canWalk);
        Assert.assertEquals(5, canSwim);
        Assert.assertEquals(4, canFly);
        Assert.assertEquals(5, canSing);
    }
}
