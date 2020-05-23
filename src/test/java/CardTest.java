import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {

    @Test
    void cardConstructorValid() {
        Card tempOne = new Card("s3");
        assertEquals("s3", tempOne.cardCode);
    }

    @Test
    void cardConstructorThrowError() {
        assertThrows(IllegalArgumentException.class, () -> {
            Card tempOne = new Card("g3");
        });
    }

    @Test
    void cardConstructorFailValue() {
        assertThrows(IllegalArgumentException.class, () -> {
            Card tempOne = new Card("s33");
        });
        assertThrows(IllegalArgumentException.class, () -> {
            Card tempOne = new Card("s1");
        });

    }

}