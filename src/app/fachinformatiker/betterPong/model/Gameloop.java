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

import app.fachinformatiker.betterPong.constants.constants;

/**
 * @author Patrick Szalewicz <info@fachinformatiker.app>
 */
public class Gameloop {

    public static boolean MOVE_BALL_DOWN;
    public static boolean MOVE_BALL_RIGHT;
    public static double POS_X_BALL;
    public static double POS_Y_BALL;
    public static int POS_X_PLAYER_ONE;
    public static int POS_X_PLAYER_TWO;
    public static int POS_Y_PLAYER_ONE;
    public static int POS_Y_PLAYER_TWO;
    public static int SCORE_PLAYER_ONE;
    public static int SCORE_PLAYER_TWO;
    public static boolean MOVE;

    Movement movement = new Movement();
    Points points = new Points();

    public void initialize_game() {
        this.MOVE_BALL_DOWN = constants.MOVE_BALL_DOWN;
        this.MOVE_BALL_RIGHT = constants.MOVE_BALL_RIGHT;
        this.POS_X_BALL = constants.POS_X_BALL;
        this.POS_Y_BALL = constants.POS_Y_BALL;
        this.POS_X_PLAYER_ONE = constants.POS_X_PLAYER_ONE;
        this.POS_X_PLAYER_TWO = constants.POS_X_PLAYER_TWO;
        //this.POS_Y_PLAYER_ONE = constants.POS_Y_PLAYER_ONE;
        //this.POS_Y_PLAYER_TWO= constants.POS_Y_PLAYER_TWO;
        this.SCORE_PLAYER_ONE = constants.SCORE_PLAYER_ONE;
        this.SCORE_PLAYER_TWO= constants.SCORE_PLAYER_TWO;
        this.MOVE = constants.MOVE;
    }

    public void gameloop() {
        movement.move_right();
        movement.move_down();
        movement.showPosition();
        points.showPoints();
        points.showPoints("playerOne");
        points.showPoints("playerTwo");
    }

}
