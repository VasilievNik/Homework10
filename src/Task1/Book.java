package Task1;
import java.util.Objects;

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

    public String toString(){
        return "Книга: "+name+"\nАвтор: "+author.getAuthorName()+" "+author.getAuthorSername()+"\nГод выпуска: "+publishDate+"\n";
    }

    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book book = (Book) other;
        return name.equals(book.name);
    }

    public void setPublishDate(int publishDate) {
        this.publishDate = publishDate;
    }

    public int hashCode() {
        return Objects.hash(name)+Objects.hash(publishDate)+Objects.hash(author);
    }

}
