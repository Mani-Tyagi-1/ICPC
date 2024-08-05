import java.util.*;

public class D_Hussien_and_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String value1 = sc.next();
        String value2 = sc.next();

        if (value1.length() != value2.length()) {
            System.out.println("NO");
            return;
        }

        int flag = 0;
        if (value1.equals(value2)) {
            char[] chars = value1.toCharArray();
            Arrays.sort(chars);
            for (int i = 0; i < chars.length - 1; i++) {
                if (chars[i] == chars[i + 1]) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            int dif = 0;
            int index1 = -1, index2 = -1;
            boolean close = true;
            for (int i = 0; i < value1.length(); i++) {
                if (value1.charAt(i) != value2.charAt(i)) {
                    dif++;
                }
                if (dif == 1 && close) {
                    index1 = i;
                    close = false;
                }
                if (dif == 2) {
                    index2 = i;
                    break;
                }
            }
            if (dif == 2) {
                char[] chars = value1.toCharArray();
                char temp = chars[index1];
                chars[index1] = chars[index2];
                chars[index2] = temp;
                String swapped = new String(chars);
                if (swapped.equals(value2)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                System.out.println("NO");
            }
        }
    }
}
