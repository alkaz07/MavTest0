package alkaz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t1 = scanner.nextInt();
        int t2 = scanner.nextInt();
        String mode = scanner.next();
        int result = work(t1, t2, mode);
        System.out.println(result);
    }

    public static int work(int t1, int t2, String mode) {
        if(mode.equals("auto")){
            return t2;
        }
        if(mode.equals("fan")){
            return t1;
        }
        if(mode.equals("freeze")){
            if(t2>t1)
                return t1;
            else
                return t2;
        }
        if(mode.equals("heat")){
            if(t2>t1)
                return t2;
            else
                return t1;
        }
        return -273;
    }
}