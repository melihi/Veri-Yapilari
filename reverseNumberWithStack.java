import java.util.Scanner;
import java.util.Stack;;
public class reverseNumberWithStack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        Stack<String> stc = new Stack<>();
        for(int i=0;i<input.length();i++){
            stc.push(Character.toString(input.charAt(i)));

        }
        String reverse="";
        while(stc.isEmpty()!=true){
            reverse+=stc.pop();
        }
        System.out.println(reverse);
        scan.close();

    }
}
