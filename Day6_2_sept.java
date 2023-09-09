public class Day6_2_sept {
    public static void main(String[] args) {
        // for loop

        // 1
        // int i = 0;
        // for (System.out.println("Hello You Are Sleeping"); i < 3; i++) {
        // System.out.println("No sir ,you only Sleeping");
        // }

        // 2
        // int i = 0;
        // for (System.out.println("Hello"); i < 3; System.out.println("hi")) {
        // i++;
        // }

        // 3
        // for (;;) {
        // System.out.println("hello");
        // }

        // 4
        // for (int i = 0; true; i++) {
        // System.out.println("hello");
        // }
        // System.out.println("hi");

        // 5
        // boolean b = false;
        // for (int i = 0; b; i++) {
        // System.out.println("hello");
        // }
        // System.out.println("hi");

        // 6
        // String s = "hello java";
        // char[] arr = s.toCharArray(); // string converted into char -type array .
        // for (char c : arr) {
        // System.out.println(c);
        // }

        // 7
        // String s = "hello java";
        // char[] arr = s.toCharArray();
        // String[] a = { "Mango", "Apple", "Bannna" };
        // for (char c : a) {
        // System.out.println(c);
        // }

        // pattern
        int space = 0;
        for (int i = 0; i < 5; i++) {
            for (space = 0; space < 5; space++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

}
