package ru.job4j.array;

public class MatrixCheck {
        public static boolean monoHorizontal(char[][] board, int row) {
            boolean result = true;
            char rsl = 'X';
            for (int i = 0; i < board[row].length; i++) {
                if (rsl != board[row][i]) {
                    result = false;
                    break;
                }
            }
            return result;
        }
    }