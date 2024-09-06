import java.util.Arrays;

public class DiscreteDistribution {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int size = args.length - 1;


        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = Integer.parseInt(args[i + 1]);
        }


        int[] sum = new int[size];
        sum[0] = nums[0];
        for (int i = 1; i < size; i++) {
            sum[i] = sum[i - 1] + nums[i];
        }


        for (int a = 0; a < m; a++) {

            int r = (int) (Math.random() * sum[size - 1]);
            for (int i = 0; i < size; i++) {
                if (sum[i] > r) {
                    int index = i + 1;
                    System.out.print(index + " ");
                    System.out.println(" ");

                    break;
                }
            }
        }
    }
}
