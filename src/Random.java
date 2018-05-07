public class Random {
    private static Random instance;
    private java.util.Random rnd;

    private Random() {
        rnd = new java.util.Random();
    }

    public static Random getInstance() {
        if(instance == null) {
            instance = new Random();
        }
        return instance;
    }

    public int nextInt() {
        return rnd.nextInt();
    }

    public int nextInt(int bound, int from) {
        return rnd.nextInt(bound) + from;
    }
}