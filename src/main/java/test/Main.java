package test;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("1", "2", "3");

        String listConcat = StringUtils.concatToString(list);
        System.out.println(listConcat);

        String listConcat2 = StringUtils.concatToString(list, ":");
        System.out.println(listConcat2);

        String listConcat3 = StringUtils.concatToString(list, ":", "suffix");
        System.out.println(listConcat3);

        String listConcat4 = StringUtils.concatToString(list, ":", "prefix", "suffix");
        System.out.println(listConcat4);
    }
}
