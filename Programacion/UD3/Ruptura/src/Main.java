public class Main {
    public static void main(String[] args) {
        for (int i = 10; i <= 20; i += 2) {
            if (i == 16) {
                continue;
            }
            System.out.println(i);
            }
            manera2();
        }
    public static void manera2() {
        for (int i = 10; i <= 20; i++) {
            if (i == 16) {
                continue;
            }
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        manera3();
    }
    public static void manera3() {
        for (int i = 10; ; i++) {
            if (i == 16) {
                continue;
            }
            if (i > 20) {
                break;
            }
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

