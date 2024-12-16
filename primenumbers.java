public class PrimeCheck {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Is 17 prime? " + isPrime(17)); // Output: true
        System.out.println("Is 20 prime? " + isPrime(20)); // Output: false
    }
}
