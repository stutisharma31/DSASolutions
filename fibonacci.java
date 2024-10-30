public class Fibonacci {
    public static void fibonacci(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci sequence: " + a + " " + b);
        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(" " + next);
            a = b;
            b = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 10;
        fibonacci(n); // Output: 0 1 1 2 3 5 8 13 21 34
    }
}
