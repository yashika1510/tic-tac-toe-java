package com.tictactoe.ui;

import com.tictactoe.listener.TicTacToeButtonListener;
import com.tictactoe.logic.TicTacToeGameLogic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;

public class TicTacToeUI {
    private static final int SIZE = 3;
    private final JButton[][] buttons = new JButton[SIZE][SIZE];
    private final TicTacToeGameLogic gameLogic;
    private JFrame frame;

    public TicTacToeUI() {
        gameLogic = new TicTacToeGameLogic();
        initializeUI();
    }

    /**
     * This method is used for initializing UI
     */
    private void initializeUI() {
        frame = new JFrame("TIC-TAC-TOE");
        frame.setSize(600, 600);
        frame.getContentPane().setBackground(Color.PINK);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(SIZE, SIZE));

        TicTacToeButtonListener buttonListener = new TicTacToeButtonListener(this, gameLogic);

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                buttons[i][j] = new JButton("");
                buttons[i][j].setFont(new Font("Arial", Font.BOLD, 60));
                buttons[i][j].setFocusable(false);
                buttons[i][j].setName(i + "," + j);
                buttons[i][j].addActionListener(buttonListener);
                frame.add(buttons[i][j]);
            }
        }

        frame.setVisible(true);
    }

    public void showEndGameMessage(String message) {
        int result = JOptionPane.showConfirmDialog(frame, message + " Do you want to play again?", "Tic-Tac-Toe", JOptionPane.YES_NO_OPTION);

        if (result == JOptionPane.YES_OPTION) {
            resetGame();
        } else {
            frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
        }
    }

    private void resetGame() {
        gameLogic.resetGame();
        for (JButton[] buttonRow : buttons) {
            for (JButton button : buttonRow) {
                button.setText("");
                button.setEnabled(true);
            }
        }
    }

    public static void main(String[] args) {
        new TicTacToeUI();
    }
}
