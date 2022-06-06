import java.util.*;

public class Matrix {
    int sizeX;
    int sizeY;
    double[][] matrix;

    Matrix(int i, int j) {
        Random random = new Random();
        this.sizeX = i;
        this.sizeY = j;
        this.matrix = new double[i][j];
        for (int z = 0; z < i; z++) {
            for (int k = 0; k < j; k++) {
                matrix[z][k] = random.nextDouble() * 100 + 0;
            }
        }

    }

    Matrix(double[][] matrix, int i, int j) {
        this.matrix = matrix;
        this.sizeX = j;
        this.sizeY = i;
    }

    Matrix(double[][] matrix) {
        this(matrix, matrix.length, matrix[0].length);
    }

    public void printMatr() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void getSizes() {
        System.out.println(sizeX + "x" + sizeY);

    }

    public Matrix sum(Matrix matr) {
        double[][] a = this.matrix;
        double[][] b = matr.matrix;
        double[][] matrC = new double[a.length][a[1].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                matrC[i][j] = a[i][j] + b[i][j];
            }
        }
        Matrix c = new Matrix(matrC);
        return c;
    }

    public Matrix umn(double num) {
        double[][] a = this.matrix;
        double[][] matrUmn = new double[a.length][a[1].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                matrUmn[i][j] = a[i][j] * num;
            }
        }
            Matrix d = new Matrix(matrUmn);
                return d;


    }
}

