import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    Main main = new Main();

    @Test
    void additional(){
        assertEquals(2, main.add(1, 1));
    }

    @Test
    void difference(){
        assertEquals(1, main.diff(3, 2));
    }

    @Test
    void times(){
        assertEquals(4, main.times(1, 4));
    }

    @Test
    void div(){
        assertEquals(2, main.div(4, 2));
    }
}