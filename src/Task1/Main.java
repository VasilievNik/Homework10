package Task1;

public class Main {

    public static void main(String[] args) {
        Author author1 = new Author("Gneg", "Johnson");
        Book book1 = new Book(1999, "Life and living", author1);

        Author author2 = new Author("Jimmy", "Smith");
        Book book2 = new Book(2023, "I hate my computer", author2);

        book1.getBookAllInfo();
        book2.getBookAllInfo();
        book2.setPublishDate(2021);
        book2.getBookAllInfo();
    }
}