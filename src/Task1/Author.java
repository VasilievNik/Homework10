package Task1;

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

}
