/**
 * The RandomWalkers class simulates multiple random walks.
 * It calculates and outputs the average number of steps needed
 * to reach a certain Manhattan distance r from the origin,
 * averaged over a specified number of trials.
 */
public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int totalSteps = 0;

        for (int t = 0; t < trials; t++) {
            int x = 0, y = 0;
            int steps = 0;

            while (Math.abs(x) + Math.abs(y) < r) {
                double direction = Math.random();

                if (direction < 0.25) {
                    x++;
                } else if (direction < 0.5) {
                    y++;
                } else if (direction < 0.75) {
                    x--;
                } else {
                    y--;
                }

                steps++;
            }

            totalSteps += steps;
        }

        double averageSteps = (double) totalSteps / trials;
        System.out.printf("average number of steps = %.6f\n", averageSteps);
    }
}


