import java.util.Random;

public class Main4 {


    public static void main(String[] args) {

        int i;
        int j;
        double[][] matricA = {{12, 12, 45}, {11, .52, 454}, {8578, 0.588, 1}};
        double[][] matricB = {{1, 2, 4}, {1, 52, .44}, {8.8, 0.588, 1.4}};
        Matrix myMatrix = new Matrix(4, 5);
        Matrix m1 = new Matrix(matricA);
        Matrix m2 = new Matrix(matricB);
        Matrix C = m1.sum(m2);
        myMatrix.printMatr();
        Matrix d = myMatrix.umn(254);
        d.printMatr();
        m1.getSizes();
        C.printMatr();
//        printMatr(matricA);
//        System.out.println();
//        printMatr(matricB);
//        System.out.println();

//
//        matrC = sumMatr(matricA, matricB);
//
//        printMatr(matrC);
//
//        System.out.println("Hi");
    }




    private static void printMatr(double[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "  ");
            }
            System.out.println();
        }
    }
}



