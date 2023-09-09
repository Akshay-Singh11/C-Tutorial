import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();
        int divisor = 2;
        boolean flag = true;
        while (divisor <= n - 1) {
            if (n % divisor == 0) {
                flag = false;
            }
            divisor = divisor + 1;
        }

        if (flag == true) {
            System.out.println("Prime no.");
        } else {
            System.out.println("Non Prime no.");
        }
    }

}
