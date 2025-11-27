public class Primes {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        boolean[] isPrime = new boolean[n + 1];

        int i = 2;
        while (i <= n) {
            isPrime[i] = true;
            i++;
        }

        // the algorithm (NOTICE- I am starting 2 because it's the exception)
        int p = 2;
        while (p * p <= n) {
            if (isPrime[p]) {
                int k = p * p;
                while (k <= n) {
                    isPrime[k] = false;
                    k += p;
                }
            }
            p++;
        }

        System.out.println("Prime numbers up to " + n + ":");

        int count = 0;
        int num = 2;
        while (num <= n) {
            if (isPrime[num]) {
                System.out.println(num);
                count++;
            }
            num++;
        }

        int percentage = (int) Math.round((100.0 * count) / (n - 1));

        System.out.println("There are " + count + " primes between 2 and " + n +
                           " (" + percentage + "% are primes)");
    }
}
