package com.tictactoe.listener;

import com.tictactoe.logic.TicTacToeGameLogic;
import com.tictactoe.ui.TicTacToeUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToeButtonListener implements ActionListener {
    private final TicTacToeUI ui;
    private final TicTacToeGameLogic gameLogic;

    public TicTacToeButtonListener(TicTacToeUI ui, TicTacToeGameLogic gameLogic) {
        this.ui = ui;
        this.gameLogic = gameLogic;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clickedButton = (JButton) e.getSource();
        int row = Integer.parseInt(clickedButton.getName().split(",")[0]);
        int column = Integer.parseInt(clickedButton.getName().split(",")[1]);

        if (!gameLogic.makeMove(row, column)) return;

        String currentPlayer = gameLogic.isXTurn() ? "X" : "O";
        clickedButton.setText(currentPlayer);
        clickedButton.setEnabled(false);

        if (gameLogic.isWinningMove(row, column)) {
            ui.showEndGameMessage("Player " + (gameLogic.isXTurn() ? "1" : "2") + " wins!");
            return;
        }

        if (gameLogic.isDraw()) {
            ui.showEndGameMessage("It's a Tie!");
            return;
        }

        gameLogic.switchTurn();
    }
}
