package test;

public class Main {
    public static void main(String[] args) {
        User user = User.builder()
                .name("test-name")
                .surname("test-surname")
                .age(25)
                .build();

        System.out.println(user);
        System.out.println(user.getFullName());
    }
}
