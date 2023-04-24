package pro.sky.java.course1.homework12;

public class Author {
    private String name;
    private String lastName;

    public Author()
    {
        this.name = "Default";
        this.lastName = "Author";
    }
    public Author(String name, String lastName)
    {
        this.name = name;
        this.lastName = lastName;
    }
    public String getName()
    {
        return this.name;
    }
    public String getLastName()
    {
        return  this.lastName;
    }
}
