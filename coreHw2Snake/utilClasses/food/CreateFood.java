package coreHw2Snake.utilClasses.food;

import coreHw2Snake.utilClasses.score.GameScore;
import coreHw2Snake.utilClasses.snake.CreateSnake;
import coreHw2Snake.variables.GameFieldVariables;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

import java.awt.Point;


public class CreateFood implements GameFieldVariables {

    private static final String[] FOODS_IMAGE = new String[]{"coreHw2Snake/img/ic_orange.png", "coreHw2Snake/img/ic_apple.png", "coreHw2Snake/img/ic_berry.png", "coreHw2Snake/img/ic_cherry.png",
            "coreHw2Snake/img/ic_coconut.png", "coreHw2Snake/img/ic_peach.png", "coreHw2Snake/img/ic_pomegranate.png", "coreHw2Snake/img/ic_tomato.png", "coreHw2Snake/img/ic_watermelon.png"};
    private static Image foodImage;

    private static int foodX;
    private static int foodY;

    public static int poisonX;
    public static int poisonY;
    private static Image poisonImage;

    //если дойдут руки, то нужно пофиксить генерацию еды и яда в самой змее
    public static void generateFood() {
        start:
        while (true) {
            foodX = (int) (Math.random() * ROWS);
            foodY = (int) (Math.random() * COLUMNS);

            for (Point snake : CreateSnake.snakeBody) {
                if (snake.getX() == foodX && snake.getY() == foodY) {
                    continue start;
                }

            }
            foodImage = new Image(FOODS_IMAGE[(int) (Math.random() * FOODS_IMAGE.length)]);
            break;
        }

    }

    public static void drawFood(GraphicsContext gc) {
        gc.drawImage(foodImage, foodX * SQUARE_SIZE, foodY * SQUARE_SIZE, SQUARE_SIZE, SQUARE_SIZE);
    }

    public static void eatFood() {
        if (CreateSnake.snakeHead.getX() == foodX && CreateSnake.snakeHead.getY() == foodY) {
            CreateSnake.snakeBody.add(new Point(-1, -1));
            generateFood();
            GameScore.score += 1;
            if (GameScore.score % 3 == 0) {
                generatePoison();
            } else {
                poisonX = -1;
                poisonY = -1;
            }

        }

    }

    public static void generatePoison() {

        poisonX = (int) (Math.random() * ROWS);
        poisonY = (int) (Math.random() * COLUMNS);

        poisonImage = new Image("coreHw2Snake/img/ic_poison.png");

    }

    public static void drawPoison(GraphicsContext gc) {
        gc.drawImage(poisonImage, poisonX * SQUARE_SIZE, poisonY * SQUARE_SIZE, SQUARE_SIZE - 3, SQUARE_SIZE - 3);
    }

}



