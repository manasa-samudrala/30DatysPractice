import java.util.ArrayList;
import java.util.List;

public class PrimeNumberList {
    public static List<Integer> generatePrimeNumbers(int lowerRange, int upperRange) {
        List<Integer> primeNumbers = new ArrayList<>();

        for (int num = lowerRange; num <= upperRange; num++) {
            if (isPrime(num)) {
                primeNumbers.add(num);
            }
        }

        return primeNumbers;
    }

    // Function to check if a number is prime
    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        if (number <= 3) {
            return true;
        }

        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int lowerRange = 10;
        int upperRange = 50;

        List<Integer> primeNumbers = generatePrimeNumbers(lowerRange, upperRange);

        System.out.println("Prime numbers between " + lowerRange + " and " + upperRange + ":");
        for (int prime : primeNumbers) {
            System.out.print(prime + " ");
        }
    }
}
