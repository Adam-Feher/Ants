public class Worker extends Ant {

    public Worker(int x, int y) {
        this.posX = x;
        this.posY = y;
        this.distance = Math.abs(x)+Math.abs(y);
    }

    public void move(Queen queen, Direction direction) {
        switch (direction) {
            case North:
                this.posY ++;
                break;
            case East:
                this.posX ++;
                break;
            case South:
                this.posY --;
                break;
            case West:
                this.posX --;
        }
    }
}
