package Task1;

public class Main {

    public static void main(String[] args) {
        Author author1 = new Author("Gneg", "Johnson");
        Book book1 = new Book(1999, "Life and living", author1);

        Author author2 = new Author("Jimmy", "Smith");
        Book book2 = new Book(2023, "I hate my computer", author2);

        Author author3 = new Author("Gneg", "Johnson");
        Book book3 = new Book(1999, "Life and living", author1);

        /*book1.getBookAllInfo();
        book2.getBookAllInfo();
        book2.setPublishDate(2021);*/
        book2.getBookAllInfo();//Собственный вывод информации о книге
        System.out.println(book1);//Использование toString()
        System.out.println(author1);//toString проверенный на авторе
        System.out.println(book1.equals(book3)+"\n");//проверка равности книги 1 и 3
        System.out.println(author1.equals(author3)+"\n");
        System.out.println(author1.hashCode());
        System.out.println(author3.hashCode()); //Хэш коды у разных авторов равны, так как у них одинаковые имена
        System.out.println(book1.hashCode());
        book1.setPublishDate(2021);
        System.out.println(book1.hashCode()); //А если изменить хоть какую-то информацию о книге через сеттер, то изменится и Хеш Код
    }
}