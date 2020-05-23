import java.util.HashMap;

public class Card {

    String cardCode;
    HashMap<String, Integer> alphabeticCardValue = new HashMap<>();
    String cardColor;
    String cardValue;
    Integer intCardValue;

    public Card(String cardCode) throws IllegalArgumentException {
        this.cardCode = cardCode;
        cardColor = this.cardCode.substring(0, 1).toUpperCase();

        if (!"SCDH".contains(cardColor)) {
            throw new IllegalArgumentException("card color isn't valid: " + cardColor);
        }

        cardValue = cardCode.substring(1).toUpperCase();

        alphabeticCardValue.put("J", 11);
        alphabeticCardValue.put("Q", 12);
        alphabeticCardValue.put("K", 13);
        alphabeticCardValue.put("A", 14);

        if (alphabeticCardValue.get(cardCode.substring(1).toUpperCase()) == null) {
            // raises exception if cardValue is a letter, but not J/Q/K/A
            intCardValue = Integer.parseInt(cardValue);
            if (intCardValue > 10 || intCardValue < 2) {
                throw new IllegalArgumentException("card number isn't valid: " + intCardValue);
            }

        }
    }

    public int getValue() {

        if (alphabeticCardValue.get(cardCode.substring(1).toUpperCase()) == null) {
            intCardValue = Integer.parseInt(cardValue);
        } else {
            intCardValue = alphabeticCardValue.get(cardCode.substring(1).toUpperCase());
        }

        return intCardValue;
    }
}
