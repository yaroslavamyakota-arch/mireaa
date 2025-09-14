import java.util.*;

public class Main {
    public static void main(String[] args) {
        // создаем переменную для чтения ввода с консоли
        Scanner sc = new Scanner(System.in); 
        // создаем список для хранения введенных чисел
        List<Integer> nums = new ArrayList<>();
        // читаем строку из консоли и разбиваем ее по пробелам на массив строк
        for (String s : sc.nextLine().split(" ")) {
            // Преобразуем каждую строку в число и добавляем в список
            nums.add(Integer.parseInt(s));
        }
        
        // если список пуст, завершаем программу
        if (nums.isEmpty()) return;
        
        int min = Collections.min(nums);
        int max = Collections.max(nums);
        
        // создаем список с результатами
        List<Integer> res = new ArrayList<>();
        
        // проходим по всем числам исходного списка
        for (int n : nums) {
            if (n == max) res.add(min);
            res.add(n);
        }
        
        // выводим результат
        res.forEach(n -> System.out.print(n + " "));
    }
}
