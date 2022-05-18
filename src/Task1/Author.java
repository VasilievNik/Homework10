package Task1;
import java.util.Objects;

public class Author {
    private final String name;
    private final String sername;
    public Author(String name, String sername){
        this.name = name;
        this.sername = sername;
    }

    public String getAuthorName() {
        return this.name;
    }
    public String getAuthorSername() {
        return this.sername;
    }

    public String toString(){
        return "Имя: "+name+" Фамилия: "+sername+"\n";
    }

    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author author = (Author) other;
        return name.equals(author.name);
    }

    public int hashCode() {
        return Objects.hash(name)+Objects.hash(sername);
    }
}
