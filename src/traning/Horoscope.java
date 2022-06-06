
package traning;
import java.util.Scanner;
public class Horoscope {

    public static void main(String[] args) {
        int y;
        int z;
        System.out.println(24%64);
        System.out.println(72/16);
        Scanner year = new Scanner(System.in);
        System.out.println("enter your year born");
        y = year.nextInt();
        z=y%12;
switch (z)
        {
            case 0:
                System.out.println("Monkey");
            break;
            case 1:
                System.out.println("Rooster");
                break;
            case 2:
                System.out.println("Dog");
                break;
            case 3:
                System.out.println("Pig");
                break;
            case 4:
                System.out.println("Rat");
                break;
            case 5:
                System.out.println("Ox");
                break;
                case 6:
            System.out.println("Tiger");
            break;
            case 7:
            System.out.println("Rabbit");
            break;
            case 8:
            System.out.println("Dragon");
            break;
            case 9:
            System.out.println("Snake");
            break;
            case 10:
            System.out.println("Horse");
            break;
            case 11:
                System.out.println("Goat");
                break;
            default:
                System.out.println("invalid year");
        }


    }
}
