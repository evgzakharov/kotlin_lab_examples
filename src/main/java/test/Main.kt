package test

fun main(args: Array<String>) {
    //        User user = User.builder()
    //                .name("test-name")
    //                .surname("test-surname")
    //                .age(25)
    //                .build();

    val user = User(
        name = "test-name",
        surname = "test-surname",
        age = 25
    )

    System.out.println(user)
}