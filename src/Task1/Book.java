package Task1;

public class Book {
    private final String name;
    private int publishDate;
    private Author author;
    public Book(int publishDate, String name, Author author) {
        this.publishDate = publishDate;
        this.name = name;
        this.author = author;
    }

    public String getBookName() {
        return this.name;
    }
    public int getPublishDate() {
        return this.publishDate;
    }
    public void getBookAllInfo(){
        System.out.format("Книга: %s\nАвтор: %s %s\nГод выпуска: %d\n\n", name, author.getAuthorName(), author.getAuthorSername(), publishDate);
    }

    public void setPublishDate(int publishDate) {
        this.publishDate = publishDate;
    }


}
