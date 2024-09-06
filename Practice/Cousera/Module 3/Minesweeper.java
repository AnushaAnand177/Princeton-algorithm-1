public class Minesweeper {
    public static void main(String[] args) {

        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);

        // Generate the grid with k mines
        boolean[][] grid = new boolean[m][n];
        int minesPlaced = 0;
        while (minesPlaced < k) {
            int i = (int) (m * Math.random());
            int j = (int) (n * Math.random());
            if (!grid[i][j]) {
                grid[i][j] = true;
                minesPlaced++;
            }
        }

        // Print the grid
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j]) {
                    System.out.print("*  ");
                } else {
                    int count = 0;
                    for (int rowDiff = -1; rowDiff <= 1; rowDiff++) {
                        for (int colDiff = -1; colDiff <= 1; colDiff++) {
                            if (rowDiff == 0 && colDiff == 0) {
                                continue;
                            }
                            int x = i + rowDiff;
                            int y = j + colDiff;
                            if (x >= 0 && x < m && y >= 0 && y < n && grid[x][y]) {
                                count++;
                            }
                        }
                    }
                    System.out.print(count + "  ");
                }
            }
            System.out.println();
        }
    }
}
