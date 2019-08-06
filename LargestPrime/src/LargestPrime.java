public class LargestPrime {

    public static int getLargestPrime(int number) {

        // 0 and 1 not prime numbers, we also do not want any negatives
        if (number <= 1) {
            return -1;
        }

        int largestPrime = 0;
        int divisor = 0;
        boolean isPrime = true;

        // using 21
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                //divisor = 21
                divisor = i;
                // preference would have been to have this in submethod to avoid O(n^2)
                // class requested one method
                for (int j = 2; j < divisor; j++) {
                    if (divisor % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime) {
                    largestPrime = divisor;
                }
            }
        }
        return largestPrime;
    }
}
