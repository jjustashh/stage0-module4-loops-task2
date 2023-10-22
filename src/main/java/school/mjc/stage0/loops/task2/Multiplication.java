package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        if (multiplyByAndToInclusive != 0) {
            int x = 0;
            while (Math.abs(x) <= Math.abs(multiplyByAndToInclusive)) {
                System.out.println(x * multiplyByAndToInclusive);
                x++;
            }
        }

    }
}
