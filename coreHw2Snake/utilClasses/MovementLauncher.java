package coreHw2Snake.utilClasses;

import coreHw2Snake.utilClasses.Score.GameScore;
import coreHw2Snake.utilClasses.food.CreateFood;
import coreHw2Snake.utilClasses.snake.CreateSnake;
import coreHw2Snake.variables.GameFieldVariables;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class MovementLauncher implements GameFieldVariables {

    public static final int RIGHT = 0;
    public static final int LEFT = 1;
    public static final int UP = 2;
    public static final int DOWN = 3;
    public static int currentDirection;

    public static void run(GraphicsContext gc) {
        if (EndGame.gameOver) {
            gc.setFill(Color.RED);
            gc.setFont(new Font("Digital-7", 70));
            gc.fillText("Game Over", WIDTH / 3.5, HEIGHT / 2);
            return;
        }

        DrawBackGround.drawBackground(gc);

        CreateFood.drawFood(gc);

        if (GameScore.score % 3 == 0) {
            CreateFood.drawPoison(gc);
        }


        CreateSnake.drawSnake(gc);

        GameScore.drawScore(gc);


        for (int i = CreateSnake.snakeBody.size() - 1; i >= 1; i--) {
            CreateSnake.snakeBody.get(i).x = CreateSnake.snakeBody.get(i - 1).x;
            CreateSnake.snakeBody.get(i).y = CreateSnake.snakeBody.get(i - 1).y;
        }

        switch (currentDirection) {
            case RIGHT -> moveRight();
            case LEFT -> moveLeft();
            case UP -> moveUp();
            case DOWN -> moveDown();
        }

        EndGame.gameOver();
        CreateFood.eatFood();


    }

    private static void moveRight() {
        CreateSnake.snakeHead.x++;
    }

    private static void moveLeft() {
        CreateSnake.snakeHead.x--;
    }

    private static void moveUp() {
        CreateSnake.snakeHead.y--;
    }

    private static void moveDown() {
        CreateSnake.snakeHead.y++;
    }

}
