package lesson_1;

public class Main {
    public static void main(String[] args) {

        Person[] person = new Person[4];
        person[0] = new Person("Анна", 150);
        person[1] = new Person("Игорь", 200);
        person[2] = new Person("Илья", 450);
        person[3] = new Person("Ольга", 800);
        Team team = new Team("Спортсмены", person);

        Obstruction obstruction = new Obstruction(250,350,410);
        String result = obstruction.doIt(team);
        System.out.println(result);
    }
}
