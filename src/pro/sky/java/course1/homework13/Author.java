package pro.sky.java.course1.homework13;

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

    @Override
    public String toString()
    {
        return name + " " + lastName;
    }

    @Override
    public boolean equals(Object o)
    {
        //Авторы равны, если их ФИО равны

        if(this.getClass() != o.getClass())
            return false;
        if(this.name.equals(((Author) o).name) && this.lastName.equals(((Author) o).lastName))
            return true;
        return false;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name+lastName);
    }
}
