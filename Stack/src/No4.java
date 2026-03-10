import java.util.*;

public class No4 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            Stack<Integer> stack = new Stack<>();
            
            System.out.print("Masukkan angka: ");
            String line = sc.nextLine();
            String[] numbers = line.split(" ");
            
            // masukkan ke stack
            for (String num : numbers) {
                stack.push(Integer.valueOf(num));
            }
            
            List<Integer> list = new ArrayList<>();
            
            // keluarkan dari stack
            while (!stack.isEmpty()) {
                list.add(stack.pop());
            }
            
            // urutkan
            Collections.sort(list);

            for (int n : list) {
                stack.push(n);
            }
            
            // cetak hasil
            System.out.println("Hasil:");
            for (int n : stack) {
                System.out.print(n + " ");
            }
        }
    }
}