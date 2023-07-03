package coreHw5.tsk2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    private static int[] readFromSave() {

        int[] toeIn = new int[9];

        try (FileInputStream fis = new FileInputStream("saveToe.txt");) {

            for (int i = 0; i < 3; i++) { // read 3 bytes
                byte save = (byte) fis.read();
                for (int j = 0; j < 3; j++) { // read 3 values from each byte
                    int value = (save >> (j * 2)) & 0x03;
                    toeIn[3 * i + j] = value;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return toeIn;
    }


    private static char getCellChar(int value) {
        return switch (value) {
            case 0 -> ' ';
            case 1 -> 'X';
            case 2 -> 'O';
            case 3 -> '?';
            default -> 'd';
        };
    }

    private static void drawCells(char cellChar, char cellChar2, char cellChar3,
                                  char cellChar4, char cellChar5, char cellChar6,
                                  char cellChar7, char cellChar8, char cellChar9, int[] cellsFromSave) {

        System.out.println(" " + cellChar + " | " + cellChar2 + " | " + cellChar3);
        System.out.println("---+---+---");
        System.out.println(" " + cellChar4 + " | " + cellChar5 + " | " + cellChar6);
        System.out.println("---+---+---");
        System.out.println(" " + cellChar7 + " | " + cellChar8 + " | " + cellChar9);
    }

    public static void main(String[] args) {

        int[] toeOut = {3, 3, 3, 2, 1, 0, 0, 2, 3};

        try (FileOutputStream fos = new FileOutputStream("saveToe.txt");) {
            for (int i = 0; i < 3; i++) { // write to 3 bytes
                byte save = 0;
                for (int j = 0; j < 3; j++) { // write by 3 values in each
                    save += (byte) (toeOut[3 * i + j] << (j * 2));
                }
                fos.write(save);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }


        //read
        System.out.println(Arrays.toString(readFromSave()));
        System.out.println();

        //draw
        int[] cellsFromSave = readFromSave();
        drawCells(getCellChar(cellsFromSave[0]), getCellChar(cellsFromSave[1]), getCellChar(cellsFromSave[2]),
                getCellChar(cellsFromSave[3]), getCellChar(cellsFromSave[4]), getCellChar(cellsFromSave[5]),
                getCellChar(cellsFromSave[6]), getCellChar(cellsFromSave[7]), getCellChar(cellsFromSave[8]), cellsFromSave);


    }
}
