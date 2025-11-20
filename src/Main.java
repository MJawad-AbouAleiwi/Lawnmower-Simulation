import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {

        String filePath = "../input.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            // Read lawn size.
            String[] limits = br.readLine().trim().split(" ");
            Lawn lawn = new Lawn(
                    Integer.parseInt(limits[0]),
                    Integer.parseInt(limits[1])
            );

            CommandProcessor processor = new CommandProcessor();
            String line;
            StringBuilder finalOutput = new StringBuilder();

            // Read each mower (2 lines per mower).
            while ((line = br.readLine()) != null) {
                if (line.isBlank()) continue;

                // Parse mower starting position.
                String[] parts = line.trim().split(" ");
                int x = Integer.parseInt(parts[0]);
                int y = Integer.parseInt(parts[1]);
                char dir = parts[2].charAt(0);

                Mower mower = new Mower(x, y, dir, lawn);

                // Read instructions.
                String commands = br.readLine().trim();

                // Execute instructions.
                processor.execute(commands, mower);

                // Add final position to result.
                finalOutput.append(mower.toString()).append(" ");
            }

            // Print results.
            System.out.println(finalOutput.toString().trim());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
