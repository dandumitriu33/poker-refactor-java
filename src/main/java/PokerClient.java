import java.util.ArrayList;
import java.util.List;

public class PokerClient {

    List<Card> o = new ArrayList<Card>();
    List<Card> m = new ArrayList<Card>();

    public PokerClient(String p1, String p2, String p3, String p4, String p5) {
        m.clear();
        m.add(new Card(p1.toUpperCase()));
        m.add(new Card(p2.toUpperCase()));
        m.add(new Card(p3.toUpperCase()));
        m.add(new Card(p4.toUpperCase()));
        m.add(new Card(p5.toUpperCase()));
    }

    public boolean highestCardIsMine(String p1, String p2, String p3, String p4, String p5) {
        Card hc = new Card("s2");
        o.clear();
        o.add(new Card(p1.toUpperCase()));
        o.add(new Card(p2.toUpperCase()));
        o.add(new Card(p3.toUpperCase()));
        o.add(new Card(p4.toUpperCase()));
        o.add(new Card(p5.toUpperCase()));

        for (int i = 0; i < o.size(); i++) {
            Card mc = m.get(i);
            for (int j = 0; j < o.size(); j++) {
                Card oc = o.get(j);
                if (oc.getValue() >= mc.getValue()) {
                    if (oc.getValue() >= hc.getValue()) {
                        hc = oc;
                    }
                } else {
                    if (mc.getValue() > hc.getValue()) {
                        hc = mc;
                    }
                }
            }
        }

        return m.contains(hc);
    }

}