import org.junit.jupiter.api.BeforeAll;
import java.util.HashMap;
public class Sequenz implements SequenzIF {
    String[][] abh;
    public Sequenz(String[][] _abh) {
        abh = _abh;
    }

    @Override
    public boolean isWellSorted(String[] seq) {
        HashMap<String, Boolean> h = fill(seq);
        if (h == null) return false;

        // Schleife fuer die Sequenz
        for (int i = 0; i < seq.length; i++) {
            String currentLetter = seq[i];

            // Pruefe, ob aktueller Buchstabe ein Nachfolger in der Abhaengigkeitenliste ist.
            // Wenn ja, pruefe, ob der Vorgaenger in der Sequenz ist (= in die HashMap eingefuegt wurde)
            // Wenn ja, pruefe, ob der Vorgaenger schon abgearbeitet wurde.
            // Wenn nicht, dann breche ab!
            for(int j = 0; j < abh.length; j++) {
                if (abh[j][1].equals(currentLetter) && h.get(abh[j][0]) != null && !h.get(abh[j][0])) {
                    return false;
                }
            }
            // Markiere aktuellen Buchstaben als "abgearbeitet".
            h.put(currentLetter, true);
        }
        return true;
    }

    @Override
    public HashMap<String, Boolean> fill(String[] arr) {
        HashMap<String, Boolean> h = new HashMap<String, Boolean>();

        for (int i = 0; i < arr.length; i++) {
            if (h.get(arr[i]) == null)
                h.put(arr[i], false);
            else return null;
        }

        return h;
    }
}
