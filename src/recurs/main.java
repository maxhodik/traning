package recurs;

public class main {
    public static void main(String[] args) {
        int a = 7;
        int b = 15;

       if (a < b){
            printUp(a, b);
        }
       else {
          printDown(a, b);
        }
    }

    public static void printUp(int a, int b) {
        if (a > b) {
            return;
        }
        System.out.println(a);

        printUp(++a, b);
    }
public static void printDown (int a, int b){
        if (a < b) {
        return;
    }
        System.out.println(a);
    printDown(--a,b);
}
}