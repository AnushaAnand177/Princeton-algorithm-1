/**
 * This program takes two integer command-line arguments n and r and calculates the nth generalized
 * harmonic number of order r using a for loop. The generalized harmonic number is defined as the
 * sum of 1/i^r for i from 1 to n. The program uses a loop to iterate over each value of i, calculates
 * the corresponding term in the sum using the formula 1/i^r, and then adds that term to a running
 * total. The final result is printed to the console.
 *
 */
    public class GeneralizedHarmonic {
        public static void main(String[] args) {
            int n = Integer.parseInt(args[0]);
            int r = Integer.parseInt(args[1]);
            double sum = 0.0;

            for (int i = 1; i <= n; i++) {
                sum += 1.0 / Math.pow(i, r);
            }

            System.out.println(sum);
        }
    }


