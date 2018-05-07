public class Drone extends Ant {
    private int dontMoveCounter;

    public Drone(int x, int y) {
        this.posX = x;
        this.posY = y;
        this.distance = Math.abs(x)+Math.abs(y);
    }

    public void move(Queen queen) {
        if (distance == 3) {
            welcomeQueen(queen);
        }
        if (dontMoveCounter > 0) {
            decreaseDontMoveCounter();
        } else {
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
                    posX -= 1;
                }
            }
        }
    }

    private void welcomeQueen(Queen queen) {
        if (queen.getTimeLeftToBeInMood() == 0) {
            System.out.println("HALLLELUUJA");
            dontMoveCounter = 10;
            queen.setTimeLeftToBeInMood(Random.getInstance().nextInt(101,100));
        } else {
            System.out.println("D'OH");
            kickAway();
        }
    }

    private void decreaseDontMoveCounter() {
        if (dontMoveCounter == 1) {
            this.dontMoveCounter--;
            kickAway();
        }
    }
    private void kickAway() {
        this.posX = Random.getInstance().nextInt(101,-50);
        this.posY = 100 - Math.abs(posX);
    }
}
