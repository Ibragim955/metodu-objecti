public class Main {

            public static Book createBook(String name, int age) {
                Author esenin = new Author("Александр", "Пушкин");
                Author lermantov = new Author("Михаил", "Лермантов");
                System.out.println("автор книги " + esenin);
                System.out.println("автор книги " + lermantov);
                Book book = new Book();
                book.book = name;
                book.age = age;
                return book;

            }

            public static void main (String[] args) {
                Book name = createBook("sunna", 1999);
                System.out.println("name.book = " + name.getName());
                System.out.println("name.age = " + name.getAge());
                name.setAge(2000);
                System.out.println("name.getAge() = " + name.getAge());
            }

        }
