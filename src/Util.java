
public class Util {
    public static <K, V> boolean compare(Pair<K, V>p1, Pair<K, V>p2) {

        return p1.getKay().equals(p2.getKay()) && p1.getValue().equals(p2.getValue());
    }
}
