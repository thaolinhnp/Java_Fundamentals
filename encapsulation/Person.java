package encapsulation;
public class Person {
    private String name; // private: retricted access

    // getter
    public String getName() {
        return name;
    }

    // setter
    public void setName(String newName) {
        this.name = newName;
    }
}