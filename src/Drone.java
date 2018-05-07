public class Drone extends Ant {
    public Drone(int x, int y) {
        this.posX = x;
        this.posY = y;
        this.distance = Math.abs(x)+Math.abs(y);
    }

    public void move() {
        if (distance == 3) {
            welcomeQueen();
        }

        if (posX == 0) {
            if (posY < 0) {
                posY += 1;
            } else {
                posY -= 1;
            }
        } else {
            if (posX < 0) {
                posX += 1;
            } else {
                posX -=1;
            }
        }
    }

    private void welcomeQueen(int mood) {
        if (mood == 0) {
            System.out.println("HALLLELUUJA");

        }
    }
}
