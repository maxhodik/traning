public class Main5 {

    public static void main(String[] args) {
        Reader reader1 = new Reader("Петров В.В.", 1, "ИФ", "21.10.1999", "+806711111");
        Reader reader2 = new Reader("Иванов И.И.", 2, "ИФ", "11.11.1997", "+806722222");
        Reader reader3 = new Reader("Сидоров А.А.", 3, "ИФ", "05.04.2005", "+806733333");
        System.out.println(reader1);
        System.out.println(reader1.getInfo());
        Reader[] readers = {reader1, reader2, reader3};
        printReaders(readers);

        Book book1 = new Book("война и мир", "Толстой");
        Book book2 = new Book("мать", "Горький");
        Book book3 = new Book("Заповит", "Шевченко");
        Book[] books = {book1, book2, book3};

printBooks(books);
        reader1.takeBook(3);
        reader3.takeBook(2);
        reader3.takeBook("война и мир", "Толстой", "мать", "Горький");
        reader1.takeBook(book3, book2);
        reader1.returnBook(8);
        reader2.returnBook("Толстой", "мать", "Горький", "Заповит", "Шевченко");
        reader3.returnBook(book2, book1, book3);

    }

    public static void printReaders(Reader[] readers) {
        System.out.println("readers list: ");
        for (Reader reader : readers) {
            System.out.println(reader.getInfo());
        }
    }
    public static void printBooks( Book [] books){
        System.out.println("books list:");
        for (Book book: books) {
            System.out.println(book.getInfo());
        }
        System.out.println();
    }
}


