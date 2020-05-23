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

    @Test
    void getValueValid() {
        Card tempOne = new Card("s3");
        assertEquals(3, tempOne.getValue());
        Card tempTwo = new Card("SK");
        assertEquals(13, tempTwo.getValue());
    }

    @Test
    void getValueFail() {
        Card tempOne = new Card("s10");
        assertNotEquals("s10", tempOne.getValue());
        Card tempTwo = new Card("SK");
        assertNotEquals("SK", tempTwo.getValue());
    }
}