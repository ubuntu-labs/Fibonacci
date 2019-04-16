public class FibonacciSequence {

    public static int closestFibonacci(int n) {

        int closestFibonacci = 0;
        if ((n > 0)) {

            int a = 0;
            int b = 1;

            int c = (a + b);

            do {
                a = b;
                b = c;
                c = (a + b);
                if ((c >= n)) {
                    closestFibonacci = b;
                }

            } while ((c <= n));

        } else {
            return 0;
        }

        return closestFibonacci;

    }

    public static void main(String[] args) {

        int fibNumber = 9;

        System.out.println("Fib: " + closestFibonacci(fibNumber));
    }
}
