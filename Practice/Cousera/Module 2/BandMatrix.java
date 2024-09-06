/**
 * This program takes two integer command-line arguments n and width and prints an n-by-n pattern
 * where each element is either a 0 or a *, depending on its distance from the main diagonal. If the
 * distance is greater than width, the element is a 0; otherwise, it is a *. The program uses two
 * nested loops to iterate over each element in the matrix, calculates its distance from the main
 * diagonal using the formula Math.abs(i - j), and then prints the appropriate character based on
 * that distance.
 *
 */
public class BandMatrix {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (Math.abs(i - j) > width)
                    System.out.print("0  ");
                else
                    System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
