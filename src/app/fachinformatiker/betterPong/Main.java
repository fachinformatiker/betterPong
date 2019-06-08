/*
 *
 *  * Copyright (c) 2019.
 *  * To learn more about my code have a look at:
 *  * - my GitHub page -> github.com/fachinformatiker
 *  * - my blog -> fachinformatiker.app
 *  * - my YouTube channel -> youtube.com/psvisualdesign
 *
 */

package app.fachinformatiker.betterPong;

import app.fachinformatiker.betterPong.constants.constants;
import app.fachinformatiker.betterPong.constants.en;
import app.fachinformatiker.betterPong.model.Gameloop;
import app.fachinformatiker.betterPong.view.Playfield;
import javafx.animation.AnimationTimer;
import javafx.stage.Stage;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @author Patrick Szalewicz <info@fachinformatiker.app>
 */

public class Main implements KeyListener {

    private Stage primaryStage;
    private AnimationTimer mainLoop;

    public static void main(String[] args) {

        Gameloop gameloop = new Gameloop();
        boolean gameStarted = constants.GAME_STARTED;

        System.out.println(constants.BETTER_PONG);
        System.out.println(en.WELCOME);

        gameloop.initialize_game();

        gameStarted = true;

        while (gameStarted) {
            gameloop.gameloop();
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
