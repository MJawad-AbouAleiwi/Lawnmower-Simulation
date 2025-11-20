// The CommandProcessor class is responsible for executing a sequence of commands on a given mower.
public class CommandProcessor {

    // Executes a full string of commands on the mower.
    public void execute(String commands, Mower mower) {

        for (char cmd : commands.toCharArray()) {
            switch (cmd) {
                case 'G':
                    mower.rotateLeft();   // Turn left
                    break;

                case 'D':
                    mower.rotateRight();  // Turn right
                    break;

                case 'A':
                    mower.moveForward();  // Move forward
                    break;

                default:
                    throw new IllegalArgumentException("Unknown command: " + cmd);
            }
        }
    }
}
