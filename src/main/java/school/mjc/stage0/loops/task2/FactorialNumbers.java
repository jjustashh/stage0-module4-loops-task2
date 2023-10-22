package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int i = 0;
        while (i <= printToInclusive) {
            long factorial = 1;
            int j = 1;
            while (j <= i) {
                factorial *= j;
                j++;
            }
            System.out.println(factorial);
            i++;
        }
    }
}
