// The Mower class represents a single autonomous mower on the lawn.

public class Mower {

    // Current X coordinate of the mower.
    private int x;

    // Current Y coordinate of the mower.
    private int y;

    // Current orientation.
    private char direction;

    // Reference to the lawn, used to check boundary constraints.
    private final Lawn lawn;

    // Array of orientations in clockwise order.
    private static final char[] ORIENTATIONS = {'N', 'E', 'S', 'W'};

    // Constructor for a mower.
    public Mower(int x, int y, char direction, Lawn lawn) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.lawn = lawn;
    }

    // Rotates the mower 90° to the left.
    public void rotateLeft() {
        int index = getOrientationIndex();
        // Moving left in the array.
        index = (index + 3) % 4;
        this.direction = ORIENTATIONS[index];
    }

    // Rotates the mower 90° to the right.
    public void rotateRight() {
        int index = getOrientationIndex();
        // Moving right in the array.
        index = (index + 1) % 4;
        this.direction = ORIENTATIONS[index];
    }

    // Moves the mower forward by one square in the direction it is facing.
    public void moveForward() {
        int nextX = x;
        int nextY = y;

        switch (direction) {
            case 'N': nextY++; break; // Move up
            case 'E': nextX++; break; // Move right
            case 'S': nextY--; break; // Move down
            case 'W': nextX--; break; // Move left
        }

        // Move only if the new position is inside the lawn boundaries.
        if (lawn.isInside(nextX, nextY)) {
            x = nextX;
            y = nextY;
        }
    }

    // Returns the index of the current orientation inside the ORIENTATIONS array.
    private int getOrientationIndex() {
        for (int i = 0; i < ORIENTATIONS.length; i++) {
            if (ORIENTATIONS[i] == direction)
                return i;
        }
        throw new IllegalArgumentException("Invalid direction");
    }

    // Represents the mower's current position and direction in the required format.
    @Override
    public String toString() {
        return x + " " + y + " " + direction;
    }
}
