package Author;

public class TestAuthor {
    public static void main(String[] args) {
        Author first = new Author("TestAuthor1", "TestAuthor1@gmail.com", 'm');
        Author second = new Author("TestAuthor2", "TestAuthor2@gmail.com", 'f');
        System.out.println(first.toString());
        System.out.println(second.toString());
    }
}
