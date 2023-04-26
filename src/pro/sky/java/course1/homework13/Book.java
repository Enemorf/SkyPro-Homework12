package pro.sky.java.course1.homework13;

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

    @Override
    public String toString()
    {
        return "Название книги: " + bookName +"\n"+
                "Автор книги: " + author.toString() + "\n"+
                "Год выпуска книги: " + publicYear + "\n";
    }

    @Override
    public boolean equals(Object o)
    {
        //Книги равны, если равны их название, автор и год выпуска
        if(this.getClass() != o.getClass())
            return false;

        if(this.bookName.equals(((Book) o).bookName) && this.author.equals(((Book) o).author) &&
                this.publicYear == ((Book) o).publicYear)
            return true;
        return false;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(bookName+author.toString()+publicYear);
    }

}
