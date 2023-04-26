package pro.sky.java.course1.homework13;

public class Homework12Main
{
    public static void main(String[] args)
    {
        System.out.println("Задание 1");

        Author author1 = new Author("Ivan","Ivanov");
        Author author2 = new Author("Petr","Petrov");

        Book book1 = new Book("Как легко научится программировать.", author1,2023);
        Book book2 = new Book("Как бросить программирование и уйти на завод.", author2, 2023);
        book1.setPublicYear(2020);

        printBook(book1);
        printBook(book2);
    }

    public static void printBook(Book book)
    {
        System.out.println(book.toString());
    }
}
