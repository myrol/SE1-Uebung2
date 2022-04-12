import java.util.HashMap;

public class Sequenz implements SequenzIF {
    String[] seq;

    public Sequenz(String[] _seq) {
        seq = _seq;
    }

    @Override
    public boolean isWellSorted(String[] arr) {
        return false;
    }

    @Override
    public HashMap<String, boolean> fill(String[] arr) {
        return null;
    }
}
