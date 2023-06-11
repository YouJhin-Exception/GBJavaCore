package coreHw2Snake.utilClasses;

import coreHw2Snake.utilClasses.food.CreateFood;
import coreHw2Snake.utilClasses.snake.CreateSnake;
import coreHw2Snake.variables.GameFieldVariables;

public class EndGame implements GameFieldVariables {
    public static boolean gameOver;

    public static void gameOver() {
        //border
        if (CreateSnake.snakeHead.x < 0 || CreateSnake.snakeHead.y < 0 || CreateSnake.snakeHead.x * SQUARE_SIZE >= WIDTH || CreateSnake.snakeHead.y * SQUARE_SIZE >= HEIGHT) {
            gameOver = true;
        }

        //eat self
        for (int i = 1; i < CreateSnake.snakeBody.size(); i++) {
            if (CreateSnake.snakeHead.x == CreateSnake.snakeBody.get(i).getX() && CreateSnake.snakeHead.getY() == CreateSnake.snakeBody.get(i).getY()) {
                gameOver = true;
                break;
            }
        }
        //poison
        if (CreateSnake.snakeHead.getX() == CreateFood.poisonX && CreateSnake.snakeHead.getY() == CreateFood.poisonY) {
            gameOver = true;

        }

    }
}
