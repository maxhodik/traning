package traning;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Pizza {           //class for order data
    String pizza;
    float cost;
    int quantity;

    public Pizza(String pizza, float cost, int quantity) {
        this.pizza = pizza;
        this.cost = cost;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return pizza + " " + cost + " " + quantity;
    }
}
class Order {           //class for an order
    public String name;
    public String address;
    List<Pizza> list;
    float sum=0;

    public Order(String name, String address, List<Pizza> list, float sum) {
        this.name = name;
        this.address = address;
        this.list = list;
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "Name " + this.name + "; Address: " + this.address + "; Total amount - " + this.sum;
    }
}

class Item {        //class for the item in the queue
    private Order order;
    public Item next;

    public void setObject(Order order) {
        this.order = order;
    }

    public Item getNext() {
        return next;
    }

    public void setNext(Item next) {
        this.next = next;
    }

    public Order getOrder() {
        return order;
    }
}

class MyQueue {         //class for the order queue
    Item head = null;
    Item tail = null;
    private int size = 0;

    public void push(Order obj) {  //adding an item to the queue
        Item ob = new Item();
        ob.setObject(obj);
        if (head == null) {
            head = ob;
        } else {
            tail.next = ob;
        }
        this.tail = ob;
        size++;
    }

    public Order pop() {          //removing an item from the queue
        if (size == 0) {
            System.out.println("No orders");
            return null;
        }
        Order obj = head.getOrder();
        head = head.getNext();
        if (head == null) {
            tail = null;
        }
        size--;
        System.out.println("The order deleted");
        return obj;
    }

    public Order get(int index) {
        if(size == 0 || index >= size || index < 0) {
            return null;
        }
        Item current = head;
        int pos = 0;
        while(pos < index) {
            current = current.getNext();
            pos++;
        }
        Order obj = current.getOrder();
        return obj;
    }

    void quantity() {    //counting orders in the queue
        Item current = head;
        int count = 0;
        if (head == null)
            System.out.println("No orders");
        else
        {
            while ( current!= null)
            {
                count++;
                current = current.getNext();
            }
            System.out.println("Number of clients  " + count);
        }
    }

    void saveFile(String filePath,Order order) throws IOException { //saving a completed (deleted) order from the queue
        File file = new File(filePath);
        FileWriter fileWrite = null;
        fileWrite = new FileWriter(file,true);
        fileWrite.write("______________________________________________\n");
        fileWrite.write(order.toString()+"\n");
        fileWrite.write("______________________________________________\n");
        fileWrite.close();
    }

    public int size() {   //determining the size of the queue
        return size;
    }

    public void show() {  //display of all orders
        int i=1;
        Item current = head;
        if (head != null)
        {
            System.out.println("______________________________________________");
            System.out.println("|  Order");
            System.out.println("______________________________________________");
            while (current != null)
            {
                System.out.printf("%d| Name %15s| Address %15s| Total amount %.2f", i, current.getOrder().name, current.getOrder().address,current.getOrder().sum);
                System.out.println("\n______________________________________________");
                current = current.getNext();
                i++;
            }
        }
        else System.out.println("No orders");
    }
}

public class Main {
    static void instructions() {
        System.out.printf("\n1) Add order to the queue\n" +
                "2) Deleting an order from the queue \n" +
                "3) Count orders\n" +
                "4) Output on display\n" +
                "0) Exit the program\n");
    }
    static Order insert(){
        Scanner in = new Scanner(System.in);
        System.out. println("Enter the name: ");
        String name =in.nextLine();
        System.out. println("Enter the address: ");
        String address =in.nextLine();
        System.out. println("Enter the order: ");
        int finish=1;
        int sum=0;
        String pizzaName;
        float cost;
        int quantity;
        List<Pizza> pizzaList = new ArrayList<Pizza>();
        while(finish!=0)
        {
            System.out.println("Enter the name of the pizza: ");
            pizzaName = in.nextLine();
            System.out.println("Enter cost of the pizza: ");
            cost = in.nextFloat();
            System.out.println("Enter the quantity: ");
            quantity = in.nextInt();
            pizzaList.add(new Pizza(pizzaName,cost,quantity));
            sum += quantity*cost;
            System.out.println("Finish order 0-yes 1-no");
            finish = in.nextInt();
            if(finish==1) in.nextLine();
        }

        System.out.print("Total amount $\n"+sum);
        return new Order(name,address,pizzaList,sum);  //creating an order object

    }
    public static void main(String[] args) throws IOException {
        MyQueue queue = new MyQueue();            //creating an order queue object
        instructions();
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        while (choice != 0){
            switch (choice){
                case 1:
                    queue.push(insert()); break;
                case 2:
                    String filePath = "my_order.txt";
                    queue.saveFile(filePath,queue.pop());
                    break;
                case 3:
                    queue.quantity();
                    break;
                case 4:
                    queue.show();
                    break;
                default:
                    System.out.println("Invalid entry. Please try again\n"); break;
            }
            instructions();
            choice = in.nextInt();
        }
    }
}