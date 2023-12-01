class Solution {
    public static void spiralOrder(int[][] matrix) {
        int move[][] = {{0,1},{1,0},{0,-1},{-1,0}};
        int x = 0;
        int y = -1;
        int i = 0;
        boolean finish = false;
        int ch = 1;
        while (!finish) {
            finish = true;
            while (true) {
                int tmpX = x;
                int tmpY = y;
                if (x + move[i % 4][0] < matrix.length && x + move[i % 4][0] > -1) x += move[i % 4][0];
                if (y + move[i % 4][1] < matrix[0].length && y + move[i % 4][1] > -1) y += move[i % 4][1];
                if (x < matrix.length && y < matrix[0].length && matrix[x][y] == 0) {
                    matrix[x][y] = ch++;
                    finish = false;
                }
                else {
                    x = tmpX;
                    y = tmpY;
                    break;
                }
            }
            i++;
        }
    }

    public static int[][] generateMatrix(int n) {
        int matrix[][] = new int[n][n];
        spiralOrder(matrix);
        return matrix;
    }
}
