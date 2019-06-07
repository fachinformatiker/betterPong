/*
 *
 *  * Copyright (c) 2019.
 *  * To learn more about my code have a look at:
 *  * - my GitHub page -> github.com/fachinformatiker
 *  * - my blog -> fachinformatiker.app
 *  * - my YouTube channel -> youtube.com/psvisualdesign
 *
 */

package app.fachinformatiker.betterPong.model;

import app.fachinformatiker.betterPong.Utility.Debug;
import app.fachinformatiker.betterPong.constants.constants;

/**
 * @author Patrick Szalewicz <info@fachinformatiker.app>
 */

public class Movement {

    public void move_right() {
        if (Gameloop.MOVE) {
            if (Gameloop.MOVE_BALL_RIGHT && Gameloop.POS_X_BALL < Gameloop.POS_X_PLAYER_TWO) {
                Gameloop.POS_X_BALL = Gameloop.POS_X_BALL + constants.BALL_X_SPEED;
            } else if (Gameloop.MOVE_BALL_RIGHT && Gameloop.POS_X_BALL >= Gameloop.POS_X_PLAYER_TWO) {
                //stopMovement();
                Points.addPoint("playerOne");
                Gameloop.MOVE_BALL_RIGHT = false;
            } else if (!Gameloop.MOVE_BALL_RIGHT && Gameloop.POS_X_BALL > Gameloop.POS_X_PLAYER_ONE) {
                Gameloop.POS_X_BALL = Gameloop.POS_X_BALL - constants.BALL_X_SPEED;
            } else if (!Gameloop.MOVE_BALL_RIGHT && Gameloop.POS_X_BALL <= Gameloop.POS_X_PLAYER_ONE) {
                //stopMovement();
                Points.addPoint("playerTwo");
                Gameloop.MOVE_BALL_RIGHT = true;
                // pause gameloop
            } else {
                // error
            }
        }
    }

    public void move_down() {
        if (Gameloop.MOVE) {
            if (Gameloop.MOVE_BALL_DOWN && Gameloop.POS_Y_BALL < constants.HEIGHT) {
                Gameloop.POS_Y_BALL = Gameloop.POS_Y_BALL + constants.BALL_Y_SPEED;
            } else if (Gameloop.MOVE_BALL_DOWN && Gameloop.POS_Y_BALL >= constants.HEIGHT) {
                Gameloop.MOVE_BALL_DOWN = false;
            } else if (!Gameloop.MOVE_BALL_DOWN && Gameloop.POS_Y_BALL > constants.ZERO) {
                Gameloop.POS_Y_BALL = Gameloop.POS_Y_BALL - constants.BALL_Y_SPEED;
            } else if (!Gameloop.MOVE_BALL_DOWN && Gameloop.POS_Y_BALL <= constants.ZERO) {
                Gameloop.MOVE_BALL_DOWN = true;
            } else {
                // error
            }
        }
    }

    public void stopMovement() {
        Gameloop.MOVE = false;
    }

    public void startMovement() {
        Gameloop.MOVE = true;
    }

    public void showPosition() {
        Debug.returnInfo("The position of the ball is " + Gameloop.POS_X_BALL + "/" + Gameloop.POS_Y_BALL + " (x/y)");
    }
}
