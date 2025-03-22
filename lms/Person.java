package lms;

public class Person {
    protected int id;
    public String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String displayInfo() {
        return "id: " + id + " name: " + name;
    }
}
