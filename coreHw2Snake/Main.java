package coreHw2Snake;

import coreHw2Snake.utilClasses.MovementLauncher;
import coreHw2Snake.utilClasses.food.CreateFood;
import coreHw2Snake.utilClasses.snake.CreateSnake;
import coreHw2Snake.variables.GameFieldVariables;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.awt.*;

public class Main extends Application implements GameFieldVariables {
    public static GraphicsContext gc;

    @Override
    public void start(Stage primeStage) throws Exception {
        primeStage.setTitle("SSSnake");
        Group root = new Group();
        Canvas canvas = new Canvas(WIDTH, HEIGHT);
        root.getChildren().add(canvas);
        Scene scene = new Scene(root);
        primeStage.setScene(scene);
        primeStage.show();

        gc = canvas.getGraphicsContext2D();

        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                KeyCode code = keyEvent.getCode();
                if (code == KeyCode.RIGHT || code == KeyCode.D) {
                    if (MovementLauncher.currentDirection != MovementLauncher.LEFT) {
                        MovementLauncher.currentDirection = MovementLauncher.RIGHT;
                    }
                } else if (code == KeyCode.LEFT || code == KeyCode.A) {
                    if (MovementLauncher.currentDirection != MovementLauncher.RIGHT) {
                        MovementLauncher.currentDirection = MovementLauncher.LEFT;
                    }
                } else if (code == KeyCode.UP || code == KeyCode.W) {
                    if (MovementLauncher.currentDirection != MovementLauncher.DOWN) {
                        MovementLauncher.currentDirection = MovementLauncher.UP;
                    }
                } else if (code == KeyCode.DOWN || code == KeyCode.S) {
                    if (MovementLauncher.currentDirection != MovementLauncher.UP) {
                        MovementLauncher.currentDirection = MovementLauncher.DOWN;
                    }
                }
            }
        });

        for (int i = 0; i < 3; i++) {
            CreateSnake.snakeBody.add(new Point(5, ROWS / 2));
        }
        CreateSnake.snakeHead = CreateSnake.snakeBody.get(0);

        CreateFood.generateFood();

        CreateFood.generatePoison();

        Timeline timeline = new Timeline(new KeyFrame(Duration.millis(190), e -> MovementLauncher.run(gc)));
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();

    }

    public static void main(String[] args) {
        launch(args);
    }


}
