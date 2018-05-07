public class Queen extends Ant {
    private int timeLeftToBeInMood;

    int getTimeLeftToBeInMood() {
        return timeLeftToBeInMood;
    }

    void setTimeLeftToBeInMood(int timeLeftToBeInMood) {
        this.timeLeftToBeInMood = timeLeftToBeInMood;
    }

    @Override
    void move(Queen queen, Direction direction) {
        this.timeLeftToBeInMood--;
    }
}
