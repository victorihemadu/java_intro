public class BookType {

    public static void main(String[] args) {
        Book cleancode = new Book();
        Book artofprogramming = new Book();
        Book effectiveJava = new Book();

        cleancode.listCopies(7);
        artofprogramming.listCopies(3);
        effectiveJava.listCopies(4);

    }
}
