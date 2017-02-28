import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by asolodkaya on 28.02.17.
 */
public class HelloTest {
    @Test
    public void testHello(){
        assertEquals("Hello!", Hello.hello());
    }


    @Test
    public void testHelloAge(){
        assertEquals("Hello, 6!", Hello.helloAge(6));
        assertEquals("Hello, 20!", Hello.helloAge(20));
        assertEquals("Hello, 100!", Hello.helloAge(100));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testHelloAgeZero(){
        Hello.helloAge(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testHelloAgeNegative(){
        Hello.helloAge(-10);
    }

}
