
import java.util.Scanner;

public class R_Ksenia_and_Pan_Scales {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        String scale = S.nextLine();
        String val = S.nextLine();
        String left = "";
        String right = "";
        boolean flag = true;

        for (int i = 0; i < scale.toCharArray().length; i++) {
            if (flag) {
                if (scale.toCharArray()[i] == '|') {
                    flag = false;
                    continue;
                }
                left += scale.toCharArray()[i];
            } else {
                right += scale.toCharArray()[i];
            }
        }
        
        if (((left.length() + right.length() + val.length()) % 2 == 0)
        && !(left.length() > (right.length() + val.length()))
        && !(right.length() > (left.length() + val.length()))) {

            for (int x = 0; x < val.length(); x++) {
                if (left.length() > right.length()) {
                    right += val.toCharArray()[x];
                } else {
                    left += val.toCharArray()[x];
                }
            }
            System.out.println(left + '|' + right);
        }
        else {
            System.out.println("Impossible");
        }
            
        
        
    }
}
