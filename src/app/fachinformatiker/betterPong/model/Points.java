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

public class Points {

    public static void addPoint(String player) {
        if (player == "playerOne") {
            Gameloop.SCORE_PLAYER_ONE++;
        } else if (player == "playerTwo") {
            Gameloop.SCORE_PLAYER_TWO++;
        } else {
            // error
        }
    }

    public static void showPoints() {
        Debug.returnInfo("The score is " + Gameloop.SCORE_PLAYER_ONE + ":" + Gameloop.SCORE_PLAYER_TWO);
    }

    public static void showPoints(String player) {
        if (player == "playerOne") {
            Debug.returnInfo("Player one has " +Gameloop.SCORE_PLAYER_ONE + " points");
        } else if (player == "playerTwo") {
            Debug.returnInfo("Player two has " +Gameloop.SCORE_PLAYER_TWO + " points");
        } else {
            // error
        }
    }
}
