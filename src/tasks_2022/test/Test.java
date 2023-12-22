package tasks_2022.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Здесь проверяем некоторые утверждения из теста
 */
public class Test {
    public static void main(String[] args) {
        List<String> numbers = new ArrayList<>(Arrays.asList("first", "second", "third"));
        for (String number: numbers) {
            if ("third".equals(number)) {
                numbers.add("fourth");
            }
        }
        System.out.println(numbers.size());
    }
}
