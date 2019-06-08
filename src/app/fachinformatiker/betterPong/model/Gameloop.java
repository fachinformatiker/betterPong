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
import app.fachinformatiker.betterPong.view.Playfield;

/**
 * @author Patrick Szalewicz <info@fachinformatiker.app>
 */
public class Gameloop {

    static boolean MOVE_BALL_DOWN;
    static boolean MOVE_BALL_RIGHT;
    public static double POS_X_BALL;
    public static double POS_Y_BALL;
    static int POS_X_PLAYER_ONE;
    static int POS_X_PLAYER_TWO;
    public static int POS_Y_PLAYER_ONE;
    public static int POS_Y_PLAYER_TWO;
    static int SCORE_PLAYER_ONE;
    static int SCORE_PLAYER_TWO;
    static boolean MOVE;

    private Movement movement = new Movement();

    public void initialize_game() {
        MOVE_BALL_DOWN = constants.MOVE_BALL_DOWN;
        MOVE_BALL_RIGHT = constants.MOVE_BALL_RIGHT;
        POS_X_BALL = constants.POS_X_BALL;
        POS_Y_BALL = constants.POS_Y_BALL;
        POS_X_PLAYER_ONE = constants.POS_X_PLAYER_ONE;
        POS_X_PLAYER_TWO = constants.POS_X_PLAYER_TWO;
        //this.POS_Y_PLAYER_ONE = constants.POS_Y_PLAYER_ONE;
        //this.POS_Y_PLAYER_TWO= constants.POS_Y_PLAYER_TWO;
        SCORE_PLAYER_ONE = constants.SCORE_PLAYER_ONE;
        SCORE_PLAYER_TWO= constants.SCORE_PLAYER_TWO;
        MOVE = constants.MOVE;

        Playfield.main();
    }

    public void gameloop() {
        movement.move_right();
        movement.move_down();
        movement.showPosition();
        Points.showPoints();
        Points.showPoints("playerOne");
        Points.showPoints("playerTwo");
    }

}