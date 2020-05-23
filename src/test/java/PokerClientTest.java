import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PokerClientTest {

    @Test
    void highestCardIsMineValid() {
        PokerClient pokerClient = new PokerClient("h3", "d2", "s3", "s4", "cq");
        assertEquals(true, pokerClient.highestCardIsMine("s3", "h4", "s5", "d6", "sj"));
        assertEquals(false, pokerClient.highestCardIsMine("s3", "h4", "s5", "d6", "sk"));
    }
}