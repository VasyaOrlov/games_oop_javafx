package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1) {
                rsl = vert(board, i) || gor(board, i);
                if (rsl) {
                    break;
                }
            }
        }
        return rsl;
    }

    public static boolean vert(int[][] board, int index) {
        boolean rsl = true;
        for (int[] ints : board) {
            if (ints[index] != 1) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static boolean gor(int[][] board, int index) {
        boolean rsl = true;
        for (int i = 0; i < board.length; i++) {
            if (board[index][i] != 1) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
