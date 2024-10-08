package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    private boolean isPrime(int number) {
        if (number <= 1) return false;
        if (number <= 3) return true;
        if (number % 2 == 0 || number % 3 == 0) return false;

        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) return false;
        }

        return true;
    }

    public void printPrimeNumbers(int printToInclusive) {
        if (printToInclusive < 2) return;

        for (int i = 2; i <= printToInclusive; i++) {
            if (
                    isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}
