import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Исходный список
        List<Integer> ol = List.of(1, 5, 2, 7, 6, 9);
        System.out.println("Original list: " + ol);
        
        // Список для нечетных чисел
        List<Integer> odd = new ArrayList<>();
        
        // Перебираем элементы и добавляем нечетные
        for (int x : ol) {
            if (x % 2 != 0) {
                odd.add(x);
            }
        }
        
        System.out.println("Odd numbers: " + odd);
    }
}
