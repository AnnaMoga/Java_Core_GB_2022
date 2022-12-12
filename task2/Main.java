package lesson_4.task2;

public class Main {

    public static void main(String[] args) {
        PhoneTable phoneTable = new PhoneTable();
        phoneTable.add("1234567","Анна Николаева");
        phoneTable.add("4567890","Анна Николаева");
        phoneTable.add("7890123","Анна Николаева");
        phoneTable.add("2222222","Игорь Сергеев");
        phoneTable.add("3333333","Ольга Викторова");
        phoneTable.add("4444444","Сергей Ильин");
        phoneTable.add("5555555","Пётр Александров");

        System.out.println(phoneTable.getPhoneByName("Анна Николаева"));
        System.out.println(phoneTable.getPhoneByName("9999999"));
    }
}
