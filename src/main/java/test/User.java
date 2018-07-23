package test;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.ZonedDateTime;

@Getter
@Setter
@ToString
@Builder
public class User {
    private String name;
    private String surname;
    private String patronymic;
    private Integer age;

    @Builder.Default
    private ZonedDateTime created = ZonedDateTime.now();

    public String getFullName() {
        return surname + " " + name + " " + patronymic;
    }
}
