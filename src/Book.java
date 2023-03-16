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
    public static int hascode(){
        return java.util.Objects.hash();
    }
    public static void equals() {
//еееей
    }
}

