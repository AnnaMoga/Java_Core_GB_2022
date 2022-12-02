package lesson_1;

public class Person {
    private String name;
    private int canDo;

    public Person(String name, int canDo) {
        this.name = name;
        this.canDo = canDo;
    }

    public String getName() {
        return name;
    }

    public int getCanDo() {
        return canDo;
    }
}
