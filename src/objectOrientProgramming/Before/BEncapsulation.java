package objectOrientProgramming.Before;

/**
 * 필드가 공개되어 누구나 접근 가능
 */
class Book {
    public String name;
    public int price;
}

public class BEncapsulation {
    public static void main(String[] args) {
        Book book = new Book();
        book.name = "JAVA";
        book.price = -2000;


        System.out.println("book.name = " + book.name);
        System.out.println("book.price = " + book.price);
    }
}
