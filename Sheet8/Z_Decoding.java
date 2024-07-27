import java.util.Scanner;

public class Z_Decoding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        scanner.close();

        String res = "";
        
        int i = 0;
        while (n > 0) {
            if (n % 2 == 0)
                res = s.charAt(i) + res;
            else
                res += s.charAt(i);
            i++;
            n--;
        }
        System.out.println(res);
    }
}
