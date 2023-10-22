package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int x = 2;
        while (x <= printToInclusive) {
            int i = 2;
            boolean isPrime = true;
            while (i <= (x/2)) {
                if (x%i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            }
            if (isPrime)
                System.out.println(x);
            x++;
        }
    }
}
