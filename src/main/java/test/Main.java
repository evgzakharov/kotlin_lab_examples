package test;

public class Main {
    public static void main(String[] args) {
        User user = new User(
                "test-user",
                "test-surname",
                "test-patronymic",
                25
        );

        System.out.println(user);

        User user2 = new User();
        user2.setName("test-user2");
        user2.setSurname("test-surname2");
        user2.setPatronymic("test-patronymic2");
        user2.setAge(55);

        System.out.println(user2);
    }
}
