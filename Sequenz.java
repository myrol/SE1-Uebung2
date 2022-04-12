import java.util.HashMap;

public class Sequenz implements SequenzIF {
    String[][] abh;

    public Sequenz(String[][] _abh) {
        abh = _abh;
    }

    @Override
    public boolean isWellSorted(String[] arr) {
        return false;
    }

    @Override
    public HashMap<String, Boolean> fill(String[] arr) {
        return null;
    }
}
