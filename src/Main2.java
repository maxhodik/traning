
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.Scanner;
import java.lang.String;

public class Main2 {
    static int calculateGCD(int num1, int num2) {
        if (num2 != 0) {
            calculateGCD(num2, num1 % num2);
        }
        return num1;
    }

    public static void main(String[] args) {

        int i1 = calculateGCD(24, 64);

        System.out.println(i1);

        int max;
        int min;
        int x;
        System.out.println("x?");
        //LocalDateTime dateTime = LocalDateTime.parse("10.12.2022 14:00:00",DateTimeFormatter.ofPattern("dd.MM.yyyy hh:mm:ss"));
        System.out.printf("%d", -2);
        Scanner hg = new Scanner(System.in);
        x = hg.nextInt();
        int[] arr = createArr(x);
        int[] arr1 = enterArr(x);

        int i = arr[2];

        printArr(arr);

        printArr(arr1);
        System.out.println("mid= " + funcArr(arr1));
       // System.out.println("min= " + min);
        //System.out.println("max= " + max);
    }

    public static int[] createArr(int x) {
        int[] arr = new int[x];
        for (int i = 0; i < x; i++) {
            arr[i] = i;
        }
        return arr;
    }

    public static void printArr(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (i % 10 == 0 && i > 0)
                System.out.println("");
        }
        System.out.println();
    }

    public static int[] enterArr(int x) {
        int[] arr1 = new int[x];
        Scanner hg = new Scanner(System.in);
        for (int i = 0; i < x; i++) {
            System.out.println("arr1 [" + i + "] ?");
            arr1[i] = hg.nextInt();

        }

        return arr1;
    }

    public static double funcArr(int arr1[]) {
        int i = 0;
        int sum = 0;
        double mid;
        while (i < arr1.length) {
            sum =+ arr1[i];
            i++;
        }
        mid = sum / arr1.length;

        Arrays.sort(arr1);
        int min = arr1[0];
        int max = arr1[arr1.length-1];
        return mid;

 }

}

