package coreHw2Snake.utilClasses;

import coreHw2Snake.variables.GameFieldVariables;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class DrawBackGround implements GameFieldVariables {
    public static void drawBackground(GraphicsContext gc) {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                if ((i + j) % 2 == 0) {
                    gc.setFill((Color.web("AAD751")));
                } else {
                    gc.setFill((Color.web("A2d149")));
                }
                gc.fillRect(i * SQUARE_SIZE, j * SQUARE_SIZE, SQUARE_SIZE, SQUARE_SIZE);
            }

        }
    }

}
