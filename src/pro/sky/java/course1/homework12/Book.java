package pro.sky.java.course1.homework12;

public class Book
{
    private String bookName;
    private Author author;
    private int publicYear;


    public Book()
    {
        this.bookName = "Default Book";
        this.author = new Author();
        this.publicYear = 0;
    }

    public Book(String name, Author author, int publicYear)
    {
        this.bookName = name;
        this.author = author;
        this.publicYear = publicYear;
    }

    public String getBookName()
    {
        return this.bookName;
    }
    public Author getAuthor()
    {
        return this.author;
    }
    public int getPublicYear()
    {
        return this.publicYear;
    }

    public void setPublicYear(int newPublicYear)
    {
        this.publicYear = newPublicYear;
    }

}
