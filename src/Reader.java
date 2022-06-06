public class Reader {
    private String fio;
    private int number;
    private String faculty;
    private String data;
    private String phone;

    Reader (String fio, int number, String faculty, String data, String phone){
        this.fio = fio;
        this.number = number;
        this.faculty = faculty;
        this.data = data;
        this. phone = phone;
    }

    public String getFio(){
        return fio;
    }
    public void setFio(String fio){
        this.fio = fio;
    }
    public int getNumber (){
        return number;
    }
    public void setNumber (int namber){
        this.number = number;
    }
    public void setFaculty(String faculty ){
        this.faculty = faculty;
    }
    public String get(){
        return faculty;
    }
    public String getData (){
        return data;

    }
    public void setData (String data){
        this.data = data;
    }

    public void takeBook (int a) {
        System.out.println(this.fio + " take " + a + " books");

    }

    public void takeBook (String... name){
        System.out.println(this.fio + " take books: ");
        for (String a : name){
            System.out.println(a);
        }
    }

    public void takeBook (Book... books ){
        System.out.println(this.fio + " take books: ");
        for (Book a : books){
            System.out.println(a.getName() + "  " + a.getAuthor()) ;
        }
    }

    public void returnBook (int a){
        System.out.println(this.fio + "return " + a + " books ");

    }

    public void returnBook (String... name){
        System.out.println(this.fio + "return books: ");
        for (String a : name){
            System.out.println(a);
        }
    }

    public void returnBook (Book... books){
        System.out.println(this.fio + "return books: ");
        for (Book a: books){
            System.out.println(a.getName () + "  "+a.getAuthor ());
        }
    }

    @Override
    public String toString() {
        return getInfo();
    }

    public String getInfo() {
        return "Reader{" +
                "fio='" + fio + '\'' +
                ", number=" + number +
                ", faculty='" + faculty + '\'' +
                ", data='" + data + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}

