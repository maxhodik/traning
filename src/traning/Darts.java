package traning;

import java.util.Random;

public class Darts {


    static void input(int[][] x, int n1, int m1)   // array input function
    {
        int i, j;
        Random rand = new Random();
        for (i = 0; i < n1; i++)
            for (j = 0; j < m1; j++)
                x[i][j] = rand.nextInt(59);         // Entering random numbers in the range from 0 to 60
    }

    static void output(int[][] x, int n1, int m1) {
        int i, j;
        for (i = 0; i < n1; i++) {

            for (j = 0; j < m1; j++)
                System.out.print(x[i][j] + " ");
            System.out.println();
        }
    }

    static int sumPlayer(int[][] x, int n1, int m1) {
        int[] sumPlayer = new int[4];
        for (int i = 0; i < n1; i++) {
            sumPlayer[i] = 0;
            for (int j = 0; j < m1; j++) {
                sumPlayer[i] += x[i][j];
            }
            System.out.println("Total score of " + (i + 1) + " player = " + sumPlayer[i]);
        }
        int imax = 0;
        int sumMax = 0;
        for (int i = 0; i < n1; i++) {
            if (sumPlayer[i] > sumMax) {
                sumMax = sumPlayer[i];
                imax = i;
            }

        }
        System.out.println("The winner is player " + (imax + 1) + " with the score of " + sumMax);
        return sumMax;
    }


    public static void main(String[] args) {
        int n = 4;
        int m = 3;
        int first[][] = new int[4][3];
        int second[][] = new int[4][3];
        int third[][] = new int[4][3];

        System.out.println("First team results: ");
        input(first, n, m);
        output(first, n, m);
        int win1 = sumPlayer(first, n, m);
        System.out.println();

        System.out.println("Second team results: ");
        input(second, n, m);
        output(second, n, m);
        int win2 = sumPlayer(second, n, m);
        System.out.println();

        System.out.println("third team results: ");
        input(third, n, m);
        output(third, n, m);
        int win3 = sumPlayer(third, n, m);
        System.out.println();
        int max,maxi;
if (win1>win2 && win1>win3) {
            max=win1;
            maxi = 1;
        }
if (win2 > win3) {
    max=win2;
    maxi = 2;
}
else {
    max = win3;
    maxi = 3;
}
        System.out.println("The best result was shown by player of the team " + maxi + " with a score of "+ max);

    }

}