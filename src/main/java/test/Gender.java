package test;

public enum Gender {
    MALE("1"),
    FEMALE("0");

    private String value;

    Gender(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
