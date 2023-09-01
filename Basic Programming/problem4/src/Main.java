public class Main {
    public class bilprima {
        public static boolean primeNumber(int n) {
            boolean a = false;
            for (int i = 2; i <= n; i++) {

                if (n % i == 0) {
                    System.out.println(i);
                    a = true;
                    break;
                }
            }
            return a;
        }

        public static void main(String[] args) {
            System.out.println(primeNumber(17));
        }
    }
}