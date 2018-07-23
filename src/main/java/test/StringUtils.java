package test;

import java.util.List;
import java.util.stream.Collectors;

public class StringUtils {

    private static final String DEFAULT_DELIMITER = ",";

    public static String concatToString(List<String> values, String delimiter, String prefix, String suffix) {
        return values.stream()
                .collect(Collectors.joining(delimiter, prefix, suffix));
    }

    public static String concatToString(List<String> values, String prefix, String suffix) {
        return values.stream()
                .collect(Collectors.joining(DEFAULT_DELIMITER, prefix, suffix));

    }

    public static String concatToString(List<String> values, String delimiter) {
        return String.join(delimiter, values);
    }

    public static String concatToString(List<String> values) {
        return String.join(DEFAULT_DELIMITER, values);
    }
}
