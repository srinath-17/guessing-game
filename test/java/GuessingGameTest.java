import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class GuessingGameTest {
    @Test
    public void testGame() {
        // Set up a mock input to simulate user guesses
        String input = "50\n60\n70\n80\n90\n100\n";
        System.setIn(new java.io.ByteArrayInputStream(input.getBytes()));
        
        // Call the game's main method
        GuessingGame.main(new String[0]);
        
        // Verify that the output contains the expected result
        String output = systemOutRule.getLog();
        assertEquals("Congratulations! You guessed the number in 6 tries.", output.trim());
    }
}
