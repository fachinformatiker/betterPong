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
import app.fachinformatiker.betterPong.model.Gameloop;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * @author Patrick Szalewicz <info@fachinformatiker.app>
 */
public class Playfield extends Application {

    private static int WIDTH = constants.WIDTH;
    private static int HEIGHT = constants.HEIGHT;
    private static int BALL = constants.BALL;
    private static double POS_X_BALL = Gameloop.POS_X_BALL;
    private static double POS_Y_BALL = Gameloop.POS_Y_BALL;
    private Circle ball = new Circle(POS_X_BALL, POS_Y_BALL, BALL, Color.WHITE);

    public static void main() {
        Application.launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.getNamespace().put("width", WIDTH);
        loader.getNamespace().put("height", HEIGHT);
        loader.setLocation(getClass().getResource("0.fxml"));

        Pane content = loader.load();
        content.setPadding(new Insets(10));

        ball.setCenterX(POS_X_BALL);
        ball.setCenterY(POS_Y_BALL);
        content.getChildren().add(ball);

        primaryStage.setScene(new Scene(content));
        primaryStage.show();
    }

    public void createPlayfield() {
        Draw.createElements();

    }

    public void updatePlayfield() {

    }
}
