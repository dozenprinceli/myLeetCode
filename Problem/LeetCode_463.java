package Problem;

public class LeetCode_463 {
    public static final int[] DX = {-1, 0, 1, 0};
    public static final int[] DY = {0, -1, 0, 1};

    public int islandPerimeter(int[][] grid) {
        int res = 0;
        int row = grid.length;
        int col = grid[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1) {
                    int side = 0;
                    for (int k = 0; k < 4; k++) {
                        int dx = i + DX[k];
                        int dy = j + DY[k];
                        if (dx < 0 || dx >= row || dy < 0 || dy >= col || grid[dx][dy] == 0) {
                            side++;
                        }
                    }
                    res += side;
                }
            }
        }

        return res;
    }

    // TODO:深度搜索方法求解
}
