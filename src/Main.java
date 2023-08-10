import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        List<Integer> listInt = new ArrayList<>() {{
            add(1);
            add(2);
            add(3);
            add(4);
            add(5);
            add(6);
        }};

        List<String> listString = new ArrayList<>() {{
            add("One");
            add("Two");
            add("Three");
            add("Four");
        }};

        // 1. Напишите программу, которая находит сумму всех чисел в списке, используя Stream API.
        int result = listInt.stream().mapToInt(Integer::intValue).sum();
        System.out.println(result);

        //2. Напишите программу, которая находит самое длинное слово в списке строк с использованием Stream API.
        String str = listString.stream().max((s1, s2) -> s1.length() - s2.length()).orElse("");
        System.out.println(str);

        //3. Напишите программу, которая фильтрует список строк и оставляет только строки, начинающиеся с определенной буквы, используя Stream API.
        List<String> listOf_T_Words = listString.stream().filter(x -> x.startsWith("T")).toList();
        System.out.println(listOf_T_Words);

        //4. Напишите программу, которая преобразует список чисел в список их квадратов, используя Stream API.
        List<Integer> squareNumber = listInt.stream().mapToInt(x -> x * x).boxed().toList();
        System.out.println(squareNumber);

        //5. Напишите программу, которая находит среднее значение списка чисел с использованием Stream API.
        double average = listInt.stream().mapToInt(Integer :: intValue).average().getAsDouble();
        System.out.println(average);
    }
}