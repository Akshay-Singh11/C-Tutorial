package CB;

public class increment {
    public static void main(String[] args) {
        int a = 6;

        System.out.println(a);
        int x = a++ + 6 + a-- - a-- + a++ - a++;
        System.out.println(x);

    }

}
