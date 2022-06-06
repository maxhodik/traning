public class Main3 {
    public static void main(String[] args) {
        Phone samsung = new Phone("0503879390", "samsung", 125);
        Phone apple = new Phone("0661793427", "apple", 180);
        Phone nokia = new Phone("0442710302", "nokia");

        System.out.println(samsung.number);
        samsung.resiveCall("Mather");
        apple.resiveCall("phather");

        samsung.resiveMessage("kjhlkdfhlkjg", "0503879390","0661793427", "0442710302");
        apple.resiveMessage("i l u ", "0442710302","0442710302");

    }
}