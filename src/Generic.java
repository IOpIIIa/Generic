
public class Generic {
    public static void main(String[] args) {

        Pair<Integer, String> p1 = new Pair<>(123, "sda");
        Pair<Integer, String> p2 = new Pair<>(321, "ads");

        System.out.println(p1);
        System.out.println(p2);

    }
}
