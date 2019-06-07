/*
 *
 *  * Copyright (c) 2019.
 *  * To learn more about my code have a look at:
 *  * - my GitHub page -> github.com/fachinformatiker
 *  * - my blog -> fachinformatiker.app
 *  * - my YouTube channel -> youtube.com/psvisualdesign
 *
 */

package app.fachinformatiker.betterPong.view;

import app.fachinformatiker.betterPong.constants.constants;
import javafx.scene.image.Image;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;


/**
 * @author Patrick Szalewicz <info@fachinformatiker.app>
 */
public class Draw {

    static Image playerOnePaddle;
    static Image playerTwoPaddle;
    static Image gameBall;
    static Text playerScoreText;
    static Text enemyScoreText;

    public static void createElements() {
        WritableImage PaddleImage;
        WritableImage BallImage;
        double PADDLE_WIDTH = constants.PADDLE_WIDTH;
        double PADDLE_HEIGHT = constants.PADDLE_HEIGHT;
        double BALL = constants.BALL;

        Rectangle paddle = new Rectangle(PADDLE_WIDTH, PADDLE_HEIGHT);
        Circle ball = new Circle(BALL);

        PaddleImage = new WritableImage((int)PADDLE_WIDTH, (int)PADDLE_HEIGHT);
        paddle.snapshot(null, PaddleImage);

        BallImage = new WritableImage((int)BALL, (int)BALL);

        playerOnePaddle = PaddleImage;
        playerTwoPaddle = PaddleImage;

        gameBall = BallImage;
    }

        private void createScoreLayer() {
            playerScoreText.setFont( Font.font( null, FontWeight.BOLD, 32));
            enemyScoreText.setFont( Font.font( null, FontWeight.BOLD, 32));

            AnchorPane.setTopAnchor(playerScoreText, 0.0);
            AnchorPane.setLeftAnchor(playerScoreText, 10.0);

            AnchorPane.setTopAnchor(enemyScoreText, 0.0);
            AnchorPane.setRightAnchor(enemyScoreText, 10.0);

            //scoreLayer.getChildren().add( playerScoreText);
            //scoreLayer.getChildren().add( enemyScoreText);
        }
}
