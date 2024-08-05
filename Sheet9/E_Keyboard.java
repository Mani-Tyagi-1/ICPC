import java.util.Scanner;

public class E_Keyboard {

    public static String solve(String s1, char c) {
        String keyboard = "qwertyuiopasdfghjkl;zxcvbnm,./";
        StringBuilder answer = new StringBuilder();

        int len = s1.length();
        for (int i = 0; i < len; i++) {
            int index = keyboard.indexOf(s1.charAt(i));
            if (c == 'R') {
                answer.append(keyboard.charAt(index - 1));
            } else {
                answer.append(keyboard.charAt(index + 1));
            }
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char c = scanner.next().charAt(0);
        String s2 = scanner.next();

        System.out.println(solve(s2, c));

        scanner.close();
    }
}
