import java.util.Stack;

public class palindromCheckStack {
    public static void main(String[] args) {
        Stack<String> stck = new Stack<>();
        String data = "1100011";
        for (int i = 0; i < data.length(); i++) {
            stck.push(Character.toString(data.charAt(i)));
        }
        String a = "";
        while (stck.isEmpty() != true) {
            a += stck.pop();
        }
        System.out.println(a);
        System.out.println(data);
        if (a.equals(data)) {
            System.out.println("Palindrome !");
        }else {
            System.out.println("Not Polindrome !");
        }
    }

}
