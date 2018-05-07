public class Worker extends Ant {

    public Worker(int x, int y) {
        this.posX = x;
        this.posY = y;
        this.distance = Math.abs(x)+Math.abs(y);
    }

    public void move(Direction direction) {
        switch (direction) {
            case North:
                if (posY <= 24) {
                    this.posY += 1;
                }
                break;
            case East:
                if (posX <= 24) {
                    this.posX += 1;
                }
                break;
            case South:
                if (posY >= -24) {
                    this.posY -=1;
                }
                break;
            case West:
                if (posX >= -24) {
                    this.posX -= 1;
                }
        }
    }
}
