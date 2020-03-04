public class Sudoku {
    public static void main(String[] args) {
        int[][] grid1 = {
                {8, 3, 5, 4, 1, 6, 9, 2, 7},
                {2, 9, 6, 8, 5, 7, 4, 3, 1},
                {4, 1, 7, 2, 9, 3, 6, 5, 8},
                {5, 6, 9, 1, 3, 4, 7, 8, 2},
                {1, 2, 3, 6, 7, 8, 5, 4, 9},
                {7, 4, 8, 5, 2, 9, 1, 6, 3},
                {6, 5, 2, 7, 8, 1, 3, 9, 4},
                {9, 8, 1, 3, 4, 5, 2, 7, 6},
                {3, 7, 4, 9, 6, 2, 8, 1, 5}
        };
        int[][] grid2 = {
                {1, 2, 3, 4, 5, 6, 7, 8, 9},
                {9, 1, 2, 3, 4, 5, 6, 7, 8},
                {8, 9, 1, 2, 3, 4, 5, 6, 7},
                {7, 8, 9, 1, 2, 3, 4, 5, 6},
                {6, 7, 8, 9, 1, 2, 3, 4, 5},
                {5, 1, 7, 8, 9, 6, 2, 3, 4},
                {4, 5, 6, 7, 8, 9, 1, 2, 3},
                {3, 4, 5, 6, 7, 8, 9, 1, 2},
                {2, 3, 4, 5, 6, 7, 8, 9, 1}
        };
    }
 /*   private boolean columnConstraint(int[][]board, int column) {
        boolean[]constraint = new boolean[BOARD__SIZE];
        return IntStream.range(BOARD__START__INDEX, BOARD__SIZE)
                .allMatch(row -> checkConstraint(board, row, constraint, column));
    }
    private boolean rowConstraint(int[][]board, int row) {
        boolean[]constraint = new boolean[BOARD__SIZE];
        return IntStream.range(BOARD__START__INDEX, BOARD__SIZE)
                .allMatch(column -> checkConstraint(board, row, constraint, column));
    }
    private boolean isValid(int[][]board, int row, int column) {
        return (rowConstraint(board, row)
                && columnConstraint(board, column)
                && subsectionConstraint(board, row, column));
    }

    private boolean solve(int[][]grid1) {
        for (int row = 0; row < grid1.length; row++) {
            for (int column = 0; column < grid1.length; column++) {
                if (grid1[row][column]== 0) {
                    for (int k = 1; k <= 9; k++) {
                        grid1[row][column]= k;
                        if (isValid(grid1, row, column) && solve(grid1)) {
                            return true;
                        }
                        grid1[row][column]= 0;
                    }
                    return false;
                }
            }
        }
        return true;
    }
    private boolean subsectionConstraint(int[][]board, int row, int column) {
        boolean[]constraint = new boolean[BOARD__SIZE];
        int subsectionRowStart = (row/SUBSECTION__SIZE) **  SUBSECTION__SIZE;
        int subsectionRowEnd = subsectionRowStart + SUBSECTION__SIZE;

        int subsectionColumnStart = (column/SUBSECTION__SIZE) **  SUBSECTION__SIZE;
        int subsectionColumnEnd = subsectionColumnStart + SUBSECTION__SIZE;

        for (int r = subsectionRowStart; r < subsectionRowEnd; r++) {
            for (int c = subsectionColumnStart; c < subsectionColumnEnd; c++) {
                if (!checkConstraint(board, r, constraint, c)) return false;
            }
        }
        return true;
    }
    boolean checkConstraint(
            int[][]board,
            int row,
            boolean[]constraint,
            int column) {
        if (board[row][column]!= 0) {
            if (!constraint[board[row][column]- 1]) {
                constraint[board[row][column]- 1]= true;
            } else {
                return false;
            }
        }
        return true;
    }
    */

}
