public class NumberToWords {

    // method one,
    public static void numberToWords (int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }

        int workingNumber = reverse(number);
        int digitCount = getDigitCount(number);

        // digit count method handles leading zeros
        while (digitCount> 0) {
            int digit = workingNumber % 10;

            switch (digit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }

            workingNumber /= 10;
            digitCount--;
        }
    }

    // method 2, reverse digits in a number
    public static int reverse(int number) {

        int reversed = 0;

        while (number != 0) {

            // trim last digit
            int digit = number % 10;

            // move decimal place
            reversed *= 10;

            // add digit
            reversed += digit;

            // shrink number
            number /= 10;
        }

        return reversed;

    }

    public static int getDigitCount(int number) {
        // eliminate negative numbers
        if (number < 0) {
            return -1;
        } else if (number == 0) {
            return 1;
        }
        // to count how many digits based on number of iterations
        int count = 0;

        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }
}
