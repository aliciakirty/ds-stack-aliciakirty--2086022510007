import java.util.*;

public class No2 {

    public static int evaluate_rpn(String[] stacks) {

        Stack<Integer> stack = new Stack<>();

        for (String ali : stacks) {

            if (ali.equals("+") || ali.equals("-") || ali.equals("*") || ali.equals("/")) {

                int b = stack.pop();
                int a = stack.pop();
                int result = 0;

                switch (ali) {
                    case "+" -> result = a + b;
                    case "-" -> result = a - b;
                    case "*" -> result = a * b;
                    case "/" -> result = a / b;
                }

                stack.push(result);

            } else {
                stack.push(Integer.valueOf(ali));
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {

        String[] stacks = { "2","7","5","+","+"};

        System.out.println(evaluate_rpn(stacks));
    }
}