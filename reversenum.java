import java.util.Scanner;

public class reversenum {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int sum = 0;

        while (n != 0) {
            int rem = n % 10;
            sum = sum * 10 + rem;
            n = n / 10;
        }
        System.out.println(sum);
    }
}
