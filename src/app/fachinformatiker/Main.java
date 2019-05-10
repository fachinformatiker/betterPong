package app.fachinformatiker;

import app.fachinformatiker.constants.constants;
import app.fachinformatiker.constants.en;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main implements KeyListener {

    public static void main(String[] args) {
        boolean gameStarted = constants.GAME_STARTED;

        System.out.println(constants.BETTER_PONG);
        System.out.println(en.WELCOME);

        JFrame myFrame = new JFrame(constants.BETTER_PONG);
        myFrame.setSize(constants.WIDTH, constants.HEIGHT);
        myFrame.setVisible(true);
        myFrame.setDefaultCloseOperation(myFrame.EXIT_ON_CLOSE);

        while (gameStarted) {

        }
    }


    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {

        }
        else if (e.getKeyCode() == KeyEvent.VK_DOWN) {

        }

    }
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {

        }
        else if (e.getKeyCode() == KeyEvent.VK_DOWN) {

        }
    }
    public void keyTyped(KeyEvent e) {

    }
}
