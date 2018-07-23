package test;

public class Main {
    public static void main(String[] args) {
        User user = User.builder()
                .name("test-name")
                .surname("test-surname")
                .build();

        System.out.println(user);
    }
}
