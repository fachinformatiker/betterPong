/*
 *
 *  * Copyright (c) 2019.
 *  * To learn more about my code have a look at:
 *  * - my GitHub page -> github.com/fachinformatiker
 *  * - my blog -> fachinformatiker.app
 *  * - my YouTube channel -> youtube.com/psvisualdesign
 *
 */

package app.fachinformatiker;

import app.fachinformatiker.constants.constants;
import app.fachinformatiker.constants.en;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @author Patrick Szalewicz <info@fachinformatiker.app>
 */

public class Main implements KeyListener {

    public static void main(String[] args) {
        boolean gameStarted = constants.GAME_STARTED;

        System.out.println(constants.BETTER_PONG);
        System.out.println(en.WELCOME);

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
