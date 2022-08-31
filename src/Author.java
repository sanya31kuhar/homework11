import java.util.Objects;

public class Author {
    private final String name;
    private final String surName;

    public Author(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }
    public String getName(){
        return name;
    }
    public String getSurName() {
        return surName;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode(){
        return Objects.hash(name, surName);
    }

    @Override
    public String toString() {
        return name +" "+ surName;
    }
}
