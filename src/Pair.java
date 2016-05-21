
public class Pair<K, V> {
    private K kay;
    private V value;

    public String toString() {
        return String.format("[%s, %s]", kay, value);
    }

    public Pair(K kay, V value) {
        this.kay = kay;
        this.value = value;
    }

    public K getKay() {
        return kay;
    }

    public V getValue() {
        return value;
    }

    public void setKay(K kay) {
        this.kay = kay;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
