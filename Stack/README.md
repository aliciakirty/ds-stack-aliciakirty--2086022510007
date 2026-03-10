1. public static boolean is_balanced(String s) {
        Stack<Character> stack = new Stack<>(); 
}

-How to compile/run each question: java No1
-Input format + example usage: Input bracket: {[()]}, Outputnya: Balanced
-Any assumptions and edge cases: hanya akan cek (), {}, []. jika string kosong artinya balanced, kalau ada bracket yang tidak ada pasangannya artinya tidak balanced.

2. public static int evaluate_rpn(String[] stacks)

-How to compile/run each question: java No2
-Input format + example usage: Input:{"2","7","5","+","+"}, Outputnya: 14
-Any assumptions and edge cases: hanya dapat menggunakan operator + - * /, menggunakan integer division

3. 
a. stack yang menyimpan target waktu
Stack<Integer> timeline = new Stack<>();

for (int i = 0; i < caseNum; i++) {
    timeline.push(sc.nextInt());
}

b. proses ditorasi waktu
while (!timeline.isEmpty()) {

    int targetAsli = timeline.pop();
    int targetKompensasi = targetAsli + akumulasiDistorsi;

    String rute = t.testcase3(targetKompensasi);
}

c. menghasilkan instruksi yang akan digunakan
public String testcase3(int target)

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

while (!stack.isEmpty()) {
    result.append(stack.pop());
}

-How to compile/run each question: java No3
-Input format + example usage: Input:2
1 4, Outputnya: 1d+1+1d+d+
-Any assumptions and edge cases: nilai target harus positif dan minimal 1 (target >= 1)

4. // masukkan ke stack
    for (String num : numbers) {
        stack.push(Integer.valueOf(num));
        }
            
    // keluarkan dari stack
        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }
            
    // urutkan
        Collections.sort(list);

    //push kembali ke dalam stack
        for (int n : list) {
            stack.push(n);
        }
            
    // cetak hasil
        for (int n : stack) {
            System.out.print(n + " ");
        }

-How to compile/run each question: java No4
-Input format + example usage: Input: 22 77 44 99 11 , Outputnya: 11 22 44 77 99
-Any assumptions and edge cases: inputan angkanya ditandai dengan spasi, jika inputan kosong maka outputnya akan kosong juga.

5. static void printSeq(int n) {
    if (n == 0) return;
    printSeq(n / 2);
    if (n > 0) System.out.print(n + " ");
    }

-How to compile/run each question: java No5
-Input format + example usage: Input: 50 , Outputnya: 1 3 6 12 25 50
-Any assumptions and edge cases: tidak dapat memproses nilai negatif, kemudian jika inputan 0 maka tidak ada outputnya.
