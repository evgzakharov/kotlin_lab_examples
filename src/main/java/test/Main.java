package test;

public class Main {
    public static void main(String[] args) {
        Persons persons = new Persons();

        Person userM = new Person();
        userM.setGender(Gender.MALE);
        userM.setName("UserM");
        userM.setAge(25);
        persons.add(userM);

        Person userF = new Person();
        userF.setGender(Gender.FEMALE);
        userF.setName("UserF");
        userF.setAge(23);
        persons.add(userF);

        System.out.println(persons);
    }
}
