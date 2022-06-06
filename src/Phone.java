// Обычный класс
import java.util.*;
public class Phone {
    String number;
    String model;
    double weight;
    Phone (String number, String model, double weight){
        this (number, model);
        this.weight = weight;
        System.out.println(weight);
    }
    Phone (String number, String model){
        this.number = number;
        this.model = model;
        System.out.println(number);
        System.out.println(model);

    }

    void resiveCall(String name){
        System.out.println("Calling "+ name);
    }
    String getNumber (){
        return number;
    }

    void resiveMessage (String message, String ... number){
        System.out.println("number.lenght = " + number.length);
        for (String a : number){
            System.out.println("Message : " + message + " for this numbers :" + a);
        }
        System.out.println("Message : " + message+ " for this numbers :" + Arrays.toString(number));

    }


}

