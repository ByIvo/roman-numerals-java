import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GreetingsTest {

    @Test
    void whenGreeting_shouldSayHelloWorld() {
        Greetings greetings = new Greetings();

        String greeting = greetings.sayHello("World");

        Assertions.assertEquals("Hello, World!", greeting);
    }
}