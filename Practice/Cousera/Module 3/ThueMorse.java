import java.util.Arrays;

public class ThueMorse {
    public static void main(String[] args) {
       int m = Integer.parseInt(args[0]);


        int [] thue = new int[m];
        thue[0] = 0;
        for (int i = 0; i < m; i++) {
            if (i % 2 == 0) {
                thue [i] = thue[i/2];
            }
            else {
                thue[i] = 1 - thue[i - 1];
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {

                if (thue[i] == thue[j]) {
                    System.out.print("+" + "  ");
                }
                else {
                    System.out.print("-" + "  ");
                }
            }
            System.out.println();
        }
    }
}
