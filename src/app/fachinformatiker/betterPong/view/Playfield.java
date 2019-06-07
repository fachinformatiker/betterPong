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
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * @author Patrick Szalewicz <info@fachinformatiker.app>
 */
public class Playfield extends Application {

    private static int WIDTH = constants.WIDTH;
    private static int HEIGHT = constants.HEIGHT;

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Create the Canvas
        Canvas canvas = new Canvas(WIDTH, HEIGHT);
        // Set the width of the Canvas
        canvas.setWidth(WIDTH);
        // Set the height of the Canvas
        canvas.setHeight(HEIGHT);

        // Get the graphics context of the canvas
        GraphicsContext gc = canvas.getGraphicsContext2D();

        // Draw a Text
        gc.strokeText("Hello Canvas", 150, 100);

        // Create the Pane
        Pane root = new Pane();
        // Set the Style-properties of the Pane
        root.setStyle("-fx-padding: 10;" +
                "-fx-border-style: solid inside;" +
                "-fx-border-width: 2;" +
                "-fx-border-insets: 5;" +
                "-fx-border-radius: 5;" +
                "-fx-border-color: blue;");

        // Add the Canvas to the Pane
        root.getChildren().add(canvas);
        // Create the Scene
        Scene scene = new Scene(root);
        // Add the Scene to the Stage
        primaryStage.setScene(scene);
        // Set the Title of the Stage
        primaryStage.setTitle("Creation of a Canvas");
        // Display the Stage
        primaryStage.show();

    }

    public void createPlayfield() {
        Draw.createElements();

    }

    public void updatePlayfield() {

    }
}
