public class Day_08 {
    public static void main(String[] args) {
        int a = 73;
        int m = 100;
        System.out.println(isprime(a));
        System.out.println(primeBt(7,15));
        System.out.println(palceValue(a));
    }

    public static boolean isprime(int num) {
        boolean b = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                b = false;
                break;
            }

        }
        return b;
    }

    public static void primeBt(int n, int m) {
        for (int i = n; i <= m; i++) {
            if (isprime(i)) {
                System.out.println(i);
            }
        }
    }

    public static int palceValue(int num) {
        int r = 1;
        while (num >= 10) {
            r = r * 10;
            num = num / 10;
        }
        return r;
    }

}
