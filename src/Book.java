import java.util.Objects;

public class Book {

    public Author author;
    String book;
    int age;

    public Book(String name, int age) {
        this.book = name;
        this.age = age;
    }

    public Book() {

    }

    public String getName() {
        return this.book;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Название книги" + book + ",год издания '" + age + '\'' + ", автор " + author + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book1 = (Book) o;
        return age == book1.age && Objects.equals(author, book1.author) && Objects.equals(book, book1.book);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, book, age);
    }
    //еееей
    }


