package com.tictactoe.logic;

public class TicTacToeGameLogic {
    private static final int SIZE = 3;
    private String[][] board;
    private boolean xTurn;
    private int moveCount;

    public TicTacToeGameLogic() {
        resetGame();
    }

    public void resetGame() {
        board = new String[SIZE][SIZE];
        xTurn = true;
        moveCount = 0;
    }

    public boolean isXTurn() {
        return xTurn;
    }

    public boolean makeMove(int row, int column) {
        if (board[row][column] == null) {
            board[row][column] = xTurn ? "X" : "O";
            moveCount++;
            return true;
        }
        return false;
    }

    public boolean isWinningMove(int row, int column) {
        String player = board[row][column];
        return checkRow(row, player) || checkColumn(column, player) || checkDiagonals(player);
    }

    private boolean checkRow(int row, String player) {
        for (int i = 0; i < SIZE; i++) {
            if (!player.equals(board[row][i])) return false;
        }
        return true;
    }

    private boolean checkColumn(int column, String player) {
        for (int i = 0; i < SIZE; i++) {
            if (!player.equals(board[i][column])) return false;
        }
        return true;
    }

    private boolean checkDiagonals(String player) {
        boolean diagonal = true, antiDiagonal = true;
        for (int i = 0; i < SIZE; i++) {
            if (!player.equals(board[i][i])){
                diagonal = false;
            }
            if (!player.equals(board[i][SIZE - 1 - i])){
                antiDiagonal = false;
            }
        }
        return diagonal || antiDiagonal;
    }

    public boolean isDraw() {
        return moveCount == SIZE * SIZE;
    }

    public void switchTurn() {
        xTurn = !xTurn;
    }
}
