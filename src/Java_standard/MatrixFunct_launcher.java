package Java_standard;

import java.util.Date;
import java.util.Random;

public class MatrixFunct_launcher extends MatrixFunct {
    
    protected static int COL_SIZE = 10;
    protected static int ROW_SIZE = 10;

    public static void main(String[] args) {
        
        int matrix[][] = new int [ROW_SIZE][COL_SIZE];

        Random rn = new Random();
        Date d = new Date();

        rn.setSeed(d.getTime());

        for (int i = 0; i < ROW_SIZE; i++) {
            for (int j = 0; j < COL_SIZE; j++) {
                matrix[i][j] = rn.nextInt(100);
            }
        }
        
        System.out.println("Matrix \n" + strMatrix(matrix));

    }
}
