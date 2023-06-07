import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
public class MainClassTest {
    @Test
    @Timeout(22)
    @Disabled
    void mainTest() throws Exception{
        Main.main(null);
    }
}