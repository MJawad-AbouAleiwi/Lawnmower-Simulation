// The Lawn class represents a rectangular area where the mower can move.
public class Lawn {

    // The maximum X coordinate allowed on the lawn.
    private final int maxX;
    
    // The maximum Y coordinate allowed on the lawn.
    private final int maxY;

    // Creates a lawn with the given upper-right boundary.
    public Lawn(int maxX, int maxY) {
        this.maxX = maxX;
        this.maxY = maxY;
    }

    // Checks whether the given (x, y) position is inside the lawn.
    public boolean isInside(int x, int y) {
        return x >= 0 && x <= maxX && y >= 0 && y <= maxY;
    }
}
