import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();
        
        try {
            // Преобразуем строку в список чисел
            List<Integer> numbers = Arrays.stream(input.split("\\s+"))
                    .filter(s -> !s.isEmpty())
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());

            int minVal = numbers.stream().min(Integer::compare).get();
            int maxVal = numbers.stream().max(Integer::compare).get();
            
            // Обрабатываем числа
            List<Integer> result = numbers.stream()
                    .flatMap(num -> {
                        if (num == maxVal) {
                            return Arrays.asList(minVal, num).stream();
                        } else {
                            return Arrays.asList(num).stream();
                        }
                    })
                    .collect(Collectors.toList());
            
            System.out.println("Final stack: " + result.stream()
                    .map(String::valueOf)
                    .collect(Collectors.joining(" ")));
        } catch (NumberFormatException e) {
        } catch (NoSuchElementException e) {
        }
    }
}
