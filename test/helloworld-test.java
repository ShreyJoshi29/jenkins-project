// HelloWorldTest.java
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HelloWorldTest {
    @Test
    public void testHelloWorld() {
        assertEquals("Hello, Jenkins!", new HelloWorld().getGreeting());
    }
}

