/*
 *
 *  * Copyright (c) 2019.
 *  * To learn more about my code have a look at:
 *  * - my GitHub page -> github.com/fachinformatiker
 *  * - my blog -> fachinformatiker.app
 *  * - my YouTube channel -> youtube.com/psvisualdesign
 *
 */

package app.fachinformatiker.betterPong.constants;

import java.awt.*;

public interface constants {
    boolean MOVE_BALL_DOWN = false;
    boolean MOVE_BALL_RIGHT = false;
    boolean MOVE = true;

    String BETTER_PONG = "betterPONG";
    String BATTLE_ROYAL = "Battle Royal";
    String CREDITS = "Credits";

    String LANGUAGE = "en";

    //String FONT_NAME = "Arial";
    //Font BIG_FONT = new Font(FONT_NAME, 32);
    //Font SMALL_FONT = new Font(FONT_NAME, 18);

    int WIDTH = 1024;
    int HEIGHT = 768;
    double ZERO = 0.0;
    double POS_X_BALL = 612;
    double POS_Y_BALL = 384;
    int PADDLE_WIDTH = 100;
    int PADDLE_HEIGHT = 15;
    boolean GAME_STARTED = false;
    int POS_X_PLAYER_ONE = 0;
    int POS_X_PLAYER_TWO = WIDTH - PADDLE_WIDTH;
    int POS_Y_PLAYER_ONE = HEIGHT / 2;
    int POS_Y_PLAYER_TWO = HEIGHT / 2;
    int BALL = 15;
    double BALL_X_SPEED = 0.5;
    double BALL_Y_SPEED = 0.5;
    int SCORE_PLAYER_ONE = 0;
    int SCORE_PLAYER_TWO = 0;
}
