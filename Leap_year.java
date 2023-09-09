public class Leap_year {
    public static void main(String[] args) {
    // Leap Year.
    // int y=1200;
    // boolean b=(y%400 ==0)||(y%4==0 && y%100 !=0);
    // System.out.println("Prime no.");
    int n=1234;
    reverse(n);
    System.out.println("Reverse No." + " "  );
    

    // public static int numberofDigits(int num) {
    //     count = 0;
    //     while (num > 0) {
    //         count++;
    //         num = num / 10;
    //     }
    //     }
    //             return count;

    // }

    public static int reverse(int num) {
        int rem = 0;
        while (num > 0) {
            rem = rem * 10 + num % 10;
            num = num / 10;
        }
        return r;
    }
    public staic boolean is palindrome(int num){
        return reverse(num)==num;
    }
}
}
