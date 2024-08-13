package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {

        int counter = 0;
        int another = multiplyByAndToInclusive < 0? multiplyByAndToInclusive * -1: multiplyByAndToInclusive;
        if (multiplyByAndToInclusive == 0) {
            return;
        }
        while (counter <= another) {
            System.out.println(counter * multiplyByAndToInclusive);
            counter++;
        }
    }
}
