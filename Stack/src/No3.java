import java.util.Scanner;
import java.util.Stack;

public class No3 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            Solution t = new Solution();
            
            if (sc.hasNextInt()) {
                
                int caseNum = sc.nextInt();
                Stack<Integer> timeline = new Stack<>();
                
                for (int i = 0; i < caseNum; i++) {
                    timeline.push(sc.nextInt());
                }
                
                StringBuilder hasilAkhir = new StringBuilder();
                int akumulasiDistorsi = 0;
                
                while (!timeline.isEmpty()) {
                    
                    int targetAsli = timeline.pop();
                    int targetKompensasi = targetAsli + akumulasiDistorsi;
                    
                    String rute = t.testcase3(targetKompensasi);
                    
                    int jumlahPlusDiRute = 0;

                    for (int i = 0; i < rute.length(); i++) {
                        if (rute.charAt(i) == '+') {
                            jumlahPlusDiRute++;
                        }
                    }
                    
                    akumulasiDistorsi += jumlahPlusDiRute;
                    
                    hasilAkhir.insert(0, rute);
                }
                System.out.println(hasilAkhir.toString());
            }
        }
    }
}

class Solution {

    public String testcase3(int target) {

        Stack<String> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        while (target > 1) {

            if (target % 2 == 0) {
                target = target / 2;
                stack.push("d+");
            } 
            else {
                target = target - 1;
                stack.push("1+");
            }
        }

        if (target == 1) {
            result.append("1");
        }

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }
}