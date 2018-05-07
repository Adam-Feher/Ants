import java.awt.*;

public class Soldier extends Ant {
    private Direction currentDirection;
    private Point startingPos;

    public Soldier(int x, int y) {
        this.startingPos = new Point(x, y);
        this.posX = x;
        this.posY = y;
        this.distance = Math.abs(x) + Math.abs(y);
        currentDirection = Direction.North;
    }

    public void move(Direction direction) {
        switch (direction) {
            case North:
                if (posY <= 24) {
                    this.posX = (int) startingPos.getX();
                    this.posY = (int) startingPos.getY() + 1;
                }
                this.currentDirection = Direction.East;
                break;
            case East:
                if (posX <= 24) {
                    this.posX = (int) startingPos.getX() + 1;
                    this.posY = (int) startingPos.getY();
                }
                this.currentDirection = Direction.South;
                break;
            case South:
                if (posY >= -24) {
                    this.posX = (int) startingPos.getX() - 1;
                    this.posY = (int) startingPos.getY();
                }
                this.currentDirection = Direction.West;
                break;
            case West:
                if (posX >= -24) {
                    this.posX = (int) startingPos.getX();
                    this.posY = (int) startingPos.getY() - 1;
                }
                this.currentDirection = Direction.East;
        }
    }
}
