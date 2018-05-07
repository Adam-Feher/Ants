import java.util.ArrayList;
import java.util.List;

public class World {
    public static void main(String[] args) {
        Queen queen = new Queen();
        List<Ant> ants = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            ants.add(new Drone(Random.getInstance().nextInt(101, -50), Random.getInstance().nextInt(101, -50)));
            ants.add(new Soldier(Random.getInstance().nextInt(101, -50), Random.getInstance().nextInt(101, -50)));
            ants.add(new Worker(Random.getInstance().nextInt(101, -50), Random.getInstance().nextInt(101, -50)));
        }

        for (int i = 0; i < 20000; i++) {
            for (Ant ant:ants) {
                   ant.move(queen,Direction.values()[Random.getInstance().nextInt(Direction.values().length,0)]);
            }
        }
    }
}
